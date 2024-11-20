package ex_20112024Generics_List_Collection_Framework;
import java.util.Vector;  //Vector methods are synchronize in nature
public class Lab0090_Vector {
    public static void main(String[] args) {
        Vector V = new Vector<>();
        V.add("Sandhya");
        V.add("Naresh");
        V.add("Gowtham");
        V.remove("Sandhya");
        System.out.println(V);

    }
}
