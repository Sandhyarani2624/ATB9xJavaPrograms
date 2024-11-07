package Oct.ex_28102024Stringfunctions;

public class Lab0077SplittingStrings {
    public static void main(String[] args) {
        String fruits = "Apple,Banana,Custurd";
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);


        String exc = "ABC-XYZ-TYU";
        String[] exc1 = exc.split("-");
        System.out.println(exc1[0]);
        System.out.println(exc1[1]);
        System.out.println(exc1[2]);
    }
}
