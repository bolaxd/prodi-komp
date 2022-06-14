package latihan.pkg2;

/**
 *
 * @author 10121161 - Hanif Ahmad Syauqi
 */
public class Main {
    public static void main(String[] args) {
        int maxLength = 100;
        
        for (int i = 1; i <= maxLength; i++) {
            if (i % 2 == 0) {
                if (i % 10 == 0) {
                    System.out.println(i + (i == maxLength ? "" : ", "));
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }
    
}
