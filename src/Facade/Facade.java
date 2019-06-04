package Facade;

/**
 * 提供功能的继承方法
 * 使用的根本原因是多个对象的功能并不能集成起来
 * 但是每个对象的方法都需要在一次流程中被调用
 * <p>
 * alter：Facade 违背了开闭原则，当修改或者增加子系统类时，需要修改Facade对象
 * Facade对象不应该通过继承的方式来被实现多种方法。
 * <p>
 * 不要试图在Facade中增加额外的逻辑。
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();

    }

    void MethodA() {
        one.MethodOne();
        two.MethodTwo();
        three.MethodThree();
        four.MethodFour();

    }

    void MethodB() {
        four.MethodFour();
        three.MethodThree();
        two.MethodTwo();
        one.MethodOne();

    }
}
