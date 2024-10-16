package Oct.ex_16102024;

public class Lab0020maxnum_Practice {
    public static void main(String[] args){
        int a = 10;
        int b = 12;
        int c = 13;
        int result = (a>=b && a>=c) ?  a : (b>=c ? b : c);
        System.out.println("Max number is -> " +result);
    }
}
