## 介绍
本builder pattern使用的是list存储复杂结构的子内容。
1. Item Burge（chick、veg）、ColdDrink(pepsi、cookie)
2. packing(bottle、wrapper)
3. Meal里面有一个field， 是Item的list。

这里通过builder， 构建出两种套餐，我个人觉得这里体现builder pattern的地方是Meal添加Item的过程。 一个complicated meal是由不同的单个菜实体组成。