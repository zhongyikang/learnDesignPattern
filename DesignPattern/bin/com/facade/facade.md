## 介绍
Facade Pattern 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。

例如， 到银行自动取款机取钱。 只有一个withdraw选项， 但是这个withdraw背后有复杂的逻辑。
1. 余额够不够。
2. 当前取款环境是否安全。
3. 线程安全问题。
4. 密码是否正确。
...

<<<<<<< HEAD
facade pattern ���������˸����ԣ��ṩ��clientһ���򵥵Ľӿڹ�ʹ�á�

��ʾ���У� ÿһ��withdraw�� ����Ҫִ��3��check��
1. funds check.
2. securitycode check.
3. account number check.

������check��ͨ����ʱ�򣬲ſ���˳��ȡǮ��

������check�� ����withdraw ��һ���ӿڡ�����ĸ����߼���
=======
facade pattern 就是隐藏了复杂性，提供给client一个简单的接口供使用。
>>>>>>> refs/remotes/origin/master
