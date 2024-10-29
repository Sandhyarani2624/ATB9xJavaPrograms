package Oct.ex_25102024Strings;

public class Lab0060StringExc {
    public static void main(String[] args) {
        String s1 = "Hello"; // Stored in SCP(String constant pool)
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = new String("Hello"); //Stored in Object Area
        String s5 = new String("Hello");
        String s6 = new String("hello");
        // 1 SCP and 3 OA

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s5 == s6);
        System.out.println(s1 == s2);

        // == check the reference location
        //equals checks the value

        System.out.println(s1.equals(s2));
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
        System.out.println(s3.equals(s4));

    }
}
