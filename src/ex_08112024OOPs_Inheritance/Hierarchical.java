package ex_08112024OOPs_Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Daugter d = new Daugter();
        d.home3();
        d.home();

        Son1 s1 = new Son1();
        s1.h2();
        s1.home();

        Son2 s2 = new Son2();
        s2.home2();
        s2.home();

        Father f = new Father();
        f.home();
    }
}

