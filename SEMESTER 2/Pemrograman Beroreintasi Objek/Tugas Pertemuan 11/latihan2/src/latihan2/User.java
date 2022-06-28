package latihan2;

import java.util.Scanner;

public class User {
    private String username;
    private String password;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username Anda : ");
        this.setUsername(input.nextLine());
        System.out.print("Masukan Password Anda : ");
        this.setPassword(input.nextLine());
    }
    
    public void validasiData() throws UserValidationException {
        String _username = "admin";
        String _password = "admin123";
        
        if ("".equals(this.getUsername())) {
            throw new UserValidationException("Data tidak valid 'Username Tidak Boleh Kosong'");
        } else if ("".equals(this.getPassword())) {
            throw new UserValidationException("Data tidak valid 'Password Tidak Boleh Kosong'");
        } else if (this.getPassword().length() > 8) {
            throw new UserValidationException("Data tidak valid 'Password Tidak Boleh lebih dari 8 Huruf'");
        } else if (!this.getUsername().equals(_username) && !this.getPassword().equals(_password)) {
            throw new UserValidationException("Data tidak valid 'Username atau Password Yang Anda Masukan Salah'");
        }
    }
}
