package ex_08112024OOPs_Polymorphism.Method_Overiding;

public class Lab0087 {
    public static void main(String[] args) {
        sandhya s = new sandhya();
        s.home();

        Father f = new Father();
        f.home();

        //Dynamic Dispatch
        Father f1 = new sandhya();
        f1.home();
    }
}

class Father{
    void home(){
        System.out.println("2bhk");
    }
}

class sandhya extends Father{

    @Override
    void home(){
        System.out.println("3bhk");
    }
}