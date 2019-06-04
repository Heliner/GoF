# 外观模式（Facade）结构设计模式

外观模式，我们通过外观的包装，使其他应用程序只能看到外观模式，而不会看到其中的细节对象，这样无疑会降低系统的复杂度，并且提高了系统的可维护性。

![](..\IMG\facede.jpg)

## facade缺点

违背了开闭原则

1）对客户屏蔽子系统组件，减少了客户处理的对象数目并使得子系统使用起来更加容易。通过引入外观模式，客户代码将变得很简单，与之关联的对象也很少。
2）实现了子系统与客户之间的松耦合关系，这使得子系统的组件变化不会影响到调用它的客户类，只需要调整外观类即可。
3）降低了大型软件系统中的编译依赖性，并简化了系统在不同平台之间的移植过程，因为编译一个子系统一般不需要编译所有其他的子系统。一个子系统的修改对其他子系统没有任何影响，而且子系统内部变化也不会影响到外观对象。
4）只是提供了一个访问子系统的统一入口，并不影响用户直接使用子系统类。
Facade模式的缺点
1） 不能很好地限制客户使用子系统类，如果对客户访问子系统类做太多的限制则减少了可变性和灵活性。

2） 在不引入抽象外观类的情况下，增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。

## Facade与建造者模式的区别

建造者模式更加注重建造的过程，如设置值等

Facade注重的是将不同的方法或者类进行聚合，将一系列本该一起做的操作通过一个方法进行集成。

工厂模式注重的是生产的对象
