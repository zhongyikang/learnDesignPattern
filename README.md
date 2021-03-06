## learnDesignPattern

# strategy pattern（策略模式）
定义一个类的域为接口， 此类instance的这个域为对应接口的实现。这样做的好处是：
1. 实现了类 和 filed的低耦合。
2. avoid duplicated code。 （假设Animal这个类中有一个叫做canFly的field， 有三种可选项： cantFly、flyWithWing、flyWithAir。 使用接口可以避免deplicated code）

当我第一次学习strategy pattern的时候， 我首先想到的是游戏。 游戏中，一个角色可以穿上不同种类的装配。 一般是： 上衣、裤子、手套、鞋子、背包等等。 
把每一个角色当作一个角色类的instance， 可装备的衣服就是角色class的域field。例如 private Shoes shoe.

显然一个游戏作品中不会只有一个可装备的衣服， 同时， 衣服对于所有角色都是可装备的。 这里的Shoe， 我们使用接口interface定义， 不同种类的鞋子类实现了Shoe接口。

鞋子有不同的等级， 同时， 同一种鞋子还有不同的属性加成。

# proxy pattern(代理模式)
静态代理很简单。
和代理模式非常类似的是adapter pattern(适配器模式).

**以下是二者的区别**

+ 代理模式中代理类和非代理类实现同一个interface，当被代理类执行一个方法， 暂且称之为execute()的时候， 被代理类执行execute()方法。 它的实现是在代理类的同名方法中调用被代理类的同名方法。
+ adapter pattern中， 被适配类没有实现对应的interface，当我们想要和interface同样的逻辑来操纵被适配类的时候， 就需要adapter来适配被适配类。 假设：在interface里面有一个execute()方法，但是在被适配类有一个run()方法。 我们想要用execute(),也就是interface的逻辑来执行run()方法， 就可以创建一个Adapter类， 它实现了inteface， 把被适配类的run()方法放在execute()方法中。


# 样板模式（Template Method Pattern）

首先要对“template”这个词汇的概念有所理解。 **样板是这样一个东西，可以用它来生产其他相似的东西。 这些相似的的东西，有同样的模式。** 例如在Spring JdbcTemplate中， 需要使用PSCFactory先创建一个样板， 类似于preparedeStatement， 然后通过方法生成一个实例。 同理， 日常生活中， 有时候要做PPT， 会从网络上下载样板，使用的时候只需要填充内容和调整一下所展示内容的结构和原有样板结构的关系就可以了。

**样板模式也是一样。 有一个样板，作为超类存在。每个样板中都有被填充的地方（slots）， 其在代码中的呈现为几个要被子类重写的抽象方法。**例如包com.template中的例子， 样板类是`Game.java`， 其中有一个`void play()`作为样板代码， 其他几个方法作为填充代码， 会被子类重写。 

对于每个比赛，都有一样的模式。 赛前预热、开始比赛、结束比赛。但是不同的比赛这些项目有不同的内容。 相似的模板，不同的内容。





# builder pattern(建造者模式)

建造者模式的**core是逐步逐步地建造一个复杂对象**。 

复杂对象的定义： 有多个field的类的instance。
一般而言， 我们创造一个多field对象有两种方式。

1. 无参 + setter
2. 全参。

它们都是一下子就构建了对象。其中， 全参构造器还制定了其中field的顺序。

解决方案是使用public static class Builder, 也就是建造者内部类。 详情见src/com/builder/Student.java。 Builder和被build的对象有相同的field， 我们通过Builder的setter方法不断传入field，同时这个setter方法返回本对象（this）从而实现了链式构造。当所有的参数传入， Builder通过build()方法把field传入Student， 也就是被build对象的全参构造器的参数列表中。

**另外一种更实际生动的案例是饭店点餐**。饭馆有很多菜， 在Java中都是独特的实体Class（虽然可能隶属于同一个类）。最终点餐的结果聚合在一个Meal类中。一个好的方式是在Meal中添加一个List域存放各种食物（src/com.builder2）。这在思想上有builder的影子，即逐个添加，最终构建一个复杂对象。 




# 样板模式（Template Method Pattern）

首先要对“template”这个词汇的概念有所理解。 **样板是这样一个东西，可以用它来生产其他相似的东西。 这些相似的的东西，有同样的模式。** 例如在Spring JdbcTemplate中， 需要使用PSCFactory先创建一个样板， 类似于preparedeStatement， 然后通过方法生成一个实例。 同理， 日常生活中， 有时候要做PPT， 会从网络上下载样板，使用的时候只需要填充内容和调整一下所展示内容的结构和原有样板结构的关系就可以了。

**样板模式也是一样。 有一个样板，作为超类存在。每个样板中都有被填充的地方（slots）， 其在代码中的呈现为几个要被子类重写的抽象方法。**例如包com.template中的例子， 样板类是`Game.java`， 其中有一个`void play()`作为样板代码， 其他几个方法作为填充代码， 会被子类重写。 

对于每个比赛，都有一样的模式。 赛前预热、开始比赛、结束比赛。但是不同的比赛这些项目有不同的内容。 相似的模板，不同的内容。



# 装饰者模式（decorator pattern）

装饰者模式和代理模式差不多。

代理模式有代理类和被代理类。 二者实现同一个接口。 代理模式使用组合（combination）， 在代理类中有被代理类的field。 当执行代理方法， 假设是`play()`的时候，调用被代理类的同名方法，同时代理类可以添加一些其他内容在代理`play()`中。

装饰者模式都差不多， **不同点在于这个“代理类”可以有多个**， 为了统一管理和设定规范， 每个concret 代理类都继承于同一个abstract 代理类。

装饰者模式特点在于， 有多个被装饰的对象， 也有	多个装饰品。 所有的它们都是实现同一个接口。

![decoratorPattern1](\img\decoratorPattern1.png)

同时更精妙的地方在以上图片。 装饰者通过combination装饰了circle（虽然二者本质上是分离的）， 得到的ShapeDecrotor对象可以使用多态变为Shape对象。 这符合decorator的附庸角色。可以理解为，**我们通过被装饰对象和装饰类得到了一个组合的新对象。**