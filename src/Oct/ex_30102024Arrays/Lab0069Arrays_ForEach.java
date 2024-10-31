package Oct.ex_30102024Arrays;

public class Lab0069Arrays_ForEach {
    public static void main(String[] args) {
        String[] names = {"Sandy", "Nari", "Nayu"};
        for(String name : names){
            System.out.println(name);
        }

        int [] a = new int[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        for(int i: a){
            System.out.println(i);
        }
    }
}
