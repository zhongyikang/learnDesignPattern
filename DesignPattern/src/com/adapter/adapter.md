there are four similar pattern:
1. Adapter
2. Facade
3. Proxy
4. Decorator

介绍：
EnemyTank实现了EnemyAttacker接口， 所以有统一的操作逻辑。
EnemyRobot没有， 所以创建一个EnemyRobotAdapter， 让EnemyRobot实现EnemyAttacker的操作逻辑。