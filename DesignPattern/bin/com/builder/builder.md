## 介绍
builder pattern 使用多个简单的对象一步一步构建复杂的对象。
在示例中， 简单的对象指的是Student类的各个field， 复杂的对象指的是类Student。

如果我们用构造器构建Student对象，有两个问题不符合builder pattern
1. 无法做到一步一步构建， 要么是完全构建（全参）， 要么是无参 + setter。（当然我们可以设置多个构造器，但是这样需要2的N次幂次）
2. 构建无法按照非指定顺序。 加入有三个参数ABC， 全参构建只有特定的顺序。但是这样不符合实际情况。 我们构建一个点餐程序， 点餐，随后生成一个订单。 点的餐最后形成一个具体的instance， 里面存入单个食物的field， 但是它是无序的。 我们获取这个实体类绝对不是构建numerous个实体类的构造器方法。

那么如何实现flexible created 复杂对象呢？使用builder
1.static 内部类 Builder
2.menu 的 list field. 

