package latihan2;

public class Main {
    public static void main(String[] args) {
        User login = new User();
        boolean isLogin = false;
        
        while(!isLogin) {
            login.inputData();
            try {
                login.validasiData();
                System.out.println("Login Berhasil!");
                isLogin = true;
            } catch (UserValidationException e) {
                System.out.println(e.getMessage() + "\n");
            }
        }
    }
    
}
