package Oct.ex_16102024;

public class Lab0018 {
    public static void main(String[] args) {
        //condition ? valueiftrue : valueiffalse;
        int a = 10;
        int b = 20;
        int c = 15;
        int result = (a>=b && a>=c) ? a : (b>=c ? b:c);
        System.out.println("Max number is" + result);
    }
}
