class A {}
class B extends A {
    public int m1(){
        return 2;
    }
    public Integer m2() {
        return 12;
    }
}
class C extends B {
    @Override
    public int m1() {
        return super.m1() + 1;
    }
}
class D extends C {}

class Z {}
class X extends B {
    @Override
    public Integer m2() {
        return 5;
    }
}
class Y extends C {}
class W extends D {}

public class RobaDaCancellare {

    public static void main(String[] args) {


    }
}
