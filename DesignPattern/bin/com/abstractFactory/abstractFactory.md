## abstract Factory
抽象工厂方法和工厂方法不同的地方在于， 它可以创建多个product。

在工厂方法中， 只有一个Factory， 一般是你给特定的参数（例如String）， 获取对应的prodecut。

这些products可以是implement同一个接口， 或者是完全不相干的Class。

抽象工厂有一个abstract factory， 有多个concret factory， 每个concret factory 可以创建多products。这些products一般implement同一个接口。

在本包中， 有两种products， 分别是： weapon、Engine。
然后有一个EnemyShipFactory， 专门创造特定的配件，两个一组。

weapon： UFOGun、UFOBossGun
Engine： UFOEngine、UFOBossEngin
Factory: UFOFactory、UFOBossFactory
EnemyShip： UFO、UFOBoss

特定的Factory可以创建related weapon and Engin, 然后组装成specific enemyShip.

EnemyShipBuilding: 协调specific factory 和 specific EnemyShip工作。
