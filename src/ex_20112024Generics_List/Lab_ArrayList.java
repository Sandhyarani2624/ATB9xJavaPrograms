package ex_20112024Generics_List;

import java.util.ArrayList;

public class Lab_ArrayList {
    public static void main(String[] args) {
     ArrayList studentList = new ArrayList();
     studentList.add("Sandhya");
     studentList.add("Rani");
     studentList.add("Rani");  //Duplicate is allowed
     studentList.add("Naresh");
     studentList.add(123); //Different data type is allowed
        studentList.add(true);

        System.out.println(studentList);
        System.out.println(studentList.size());
        System.out.println(studentList.isEmpty());
        System.out.println(studentList.contains("Rani"));
        System.out.println(studentList.contains(4));

    }
}
