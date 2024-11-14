package ex_08112024OOPs_Polymorphism.Method_Overiding;

public class Lab0086 {
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
    }
}

class Dog {
    void bark(){
        System.out.println("I am Dog, i will Bark!");
    }
    int age = 10;
}

class Hound extends Dog{

    @Override
    void bark(){
        System.out.println("Bark of Hound");
    }
}
