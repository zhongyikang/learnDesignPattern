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

## builder pattern(建造者模式)
建造者模式的**core是逐步逐步地建造一个复杂对象**。 

复杂对象的定义： 有多个field的类的instance。
一般而言， 我们创造一个多field对象有两种方式。
1. 无参 + setter
2. 全参。

它们都是一下子就构建了对象。其中， 全参构造器还制定了其中field的顺序。

解决方案是使用public static class Builder, 也就是建造者内部类。 详情见src/com/builder/Student.java。 Builder和被build的对象有相同的field， 我们通过Builder的setter方法不断传入field，同时这个setter方法返回本对象（this）从而实现了链式构造。当所有的参数传入， Builder通过build()方法把field传入Student， 也就是被build对象的全参构造器的参数列表中。

**另外一种更实际生动的案例是饭店点餐**。饭馆有很多菜， 在Java中都是独特的实体Class（虽然可能隶属于同一个类）。最终点餐的结果聚合在一个Meal类中。一个好的方式是在Meal中添加一个List域存放各种食物（src/com.builder2）。这在思想上有builder的影子，即逐个添加，最终构建一个复杂对象。 
