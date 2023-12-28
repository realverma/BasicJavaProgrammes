package ConstructorsProgramms;

public class Facebook {
    void login(String email, String pass){
        System.out.println("Login via Email");
    }
    void login(long phno, String pass){
        System.out.println("Login via Phno");
    }

    public static void main(String[] args) {
        Facebook f1= new Facebook();
        f1.login("vnee@fhjf", "8378");
    }
}

