# Iterator pattern

## 简介

1. 迭代器模式是一个behavioral的模式。 （不是很理解这个behavioral）。 它的功能是遍历集合的每一个元素， 而不必知道集合的底层实现，因为封装了。
2. 集合是一组数据的汇集。 集合的底层有不一样的实现方式， 最简单的是线性list， 复杂的有树、图。
3. The main idea of the Iterator pattern is to **extract** the traversal behavior of a collection into a separate object called an *iterator*.

（done）

Java里面有迭代器设计模式的实现。

iterator

iterable有一个Iterator field。

Iterator 有两个方法：

1. hasNext
2. next



![image-20201020193149468](C:\Users\钟益康\AppData\Roaming\Typora\typora-user-images\image-20201020193149468.png)