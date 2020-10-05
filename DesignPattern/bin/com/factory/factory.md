## Factory Pattern Introduction

# 介绍
隐藏了对象的创建， 转而通过Facotry创建。

Factory创建的对象需要实现同一个接口， 因为工厂设计模式需要使用多态。

例如Animal接口， 有三个实现类Dog、Cat、Bird。 我们通过工厂类创造特定的对象，  使用多态返回Animal。