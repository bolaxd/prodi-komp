/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator calculator = new Kalkulator();
        System.out.println("Menghitung pembagian 2 bilangan");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        try {        
            calculator.tambahBilangan();
            calculator.tampilHasilBilangan();
        } catch (NumberValidationException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmatika : " + e.getMessage());
        }
    }
    
}
