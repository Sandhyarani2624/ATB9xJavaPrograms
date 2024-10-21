package Oct.ex_21102024;

public class Lab0046forloop_printEvennum {
    public static void main(String[] args) {
        for(int i = 0; i<=50; i++){
            if(i%2 == 0){     //To find even numbers
                System.out.println(i);
            }
            else
            {
                System.out.println("Odd");
            }
        }
    }
}

