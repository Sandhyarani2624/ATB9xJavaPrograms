package ex_08112024OOPs_Polymorphism.Method_Overloading;

public class Lab0085 {
    public static void main(String[] args) {
        MathOperations mathoperations = new MathOperations();
        int result = mathoperations.add(3, 4);
        System.out.println(result);

    }
}

class MathOperations{

    //Method Overloading-Same function name but different arguments or parameters
    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

    void add( int a, int b, int c){
        System.out.println("Hello");
    }
}
