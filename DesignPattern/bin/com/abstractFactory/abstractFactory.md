## abstract Factory
���󹤳������͹���������ͬ�ĵط����ڣ� �����Դ������product��

�ڹ��������У� ֻ��һ��Factory�� һ��������ض��Ĳ���������String���� ��ȡ��Ӧ��prodecut��

��Щproducts������implementͬһ���ӿڣ� ��������ȫ����ɵ�Class��

���󹤳���һ��abstract factory�� �ж��concret factory�� ÿ��concret factory ���Դ�����products����Щproductsһ��implementͬһ���ӿڡ�

�ڱ����У� ������products�� �ֱ��ǣ� weapon��Engine��
Ȼ����һ��EnemyShipFactory�� ר�Ŵ����ض������������һ�顣

weapon�� UFOGun��UFOBossGun
Engine�� UFOEngine��UFOBossEngin
Factory: UFOFactory��UFOBossFactory
EnemyShip�� UFO��UFOBoss

�ض���Factory���Դ���related weapon and Engin, Ȼ����װ��specific enemyShip.

EnemyShipBuilding: Э��specific factory �� specific EnemyShip������
