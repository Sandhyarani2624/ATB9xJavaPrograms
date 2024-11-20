package ex_20112024Generics_List;

public class Generics {
    public static void main(String[] args) {
        temp_sum(23, 45);
        temp_sum("Sandhya", "rani");
        temp_sum(true, false);
    }

    //T-> any data type.
    public static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
