package ex_08112024OOPs_Encapsulation;

public class Lab0088 {
    public static void main(String[] args){
        VWOLogin vwoLogin = new VWOLogin("admin" , "password123");
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodadmin", "admin123");
      //  System.out.println(vwoLogin1.password);

        String pass = vwoLogin1.getPassword(false);
       //vwoLogin1.setPassword("1234");
        System.out.println(pass);
    }
}

class VWOLogin{

    public String username;
    public  String password;

    public VWOLogin(String username, String password){
        this.username = username;
        this.password = password;
    }
}

class GoodVWOLogin {

    private String username;
    private String password;

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAdmin) {
        if(isAdmin){
            return password;
        }
        return "Not Allowed";
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    public String givemePassword(Boolean isAuth) {
//        if (isAuth) {
//            return password;
//        }
//        return "none";

}



