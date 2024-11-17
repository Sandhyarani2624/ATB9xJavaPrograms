package ex_11112024OOPs_Encap_AM;

import ex_11112024OOPs_Encap_AM.RealExample.BaseClass;
import ex_11112024OOPs_Encap_AM.RealExample.TestCase1;

public class Lab0088_Encap_AM {
    public static void main(String[] args) {
        //BaseClass tc1 = new TestCase1();  //Dynamic Dispatch
        TestCase1 tc1 = new TestCase1();
        tc1.setBrowser("chrome", true);
        tc1.startTestCase();

    }
}
