##### 单例（Singleton）模式： 
某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。


关键代码：

- 构造函数是私有的。

优点：

- 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。
- 2、避免对资源的多重占用（比如写文件操作）。

缺点：

- 没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。


##### 单例模式的几种实现方式

- 1、懒汉式，线程不安全
- 2、懒汉式，线程安全
- 3、饿汉式
- 4、双检锁/双重校验锁（DCL，即 double-checked locking）
- 5、登记式/静态内部类


##### 经验之谈：
一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。