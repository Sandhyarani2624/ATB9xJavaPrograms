package ex_11112024OOPs_Encap_AM.Police;

public class Cop {

    private int gun;
    private String icard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, you can");
    }
}
