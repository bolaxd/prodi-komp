package latihan2;

/**
 *
 * @author Hanif
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Film tayang1 = new Film("Spiderman 3");
        tayang1.genre = "Action, Adventure, Fantasy";
        tayang1.rating = "8.5";
        tayang1.durasi = "148 Menit";
        
        Film tayang2 = new Film("Frozen 2");
        tayang2.genre = "Animation, Adventure, Comedy";
        tayang2.rating = "6.2";
        tayang2.durasi = "120 Menit";
        
        Film tayang3 = new Film("Kimi no Na Wa");
        tayang3.genre = "Animation, Drama, Supernatural";
        tayang3.rating = "8.87";
        tayang3.durasi = "107 Menit";
        
        tayang1.showTitle();
        tayang1.newLine();
        tayang1.tampilData();
        tayang2.newLine();
        tayang2.tampilData();
        tayang3.newLine();
        tayang3.tampilData();
        tayang3.newLine();
    }
}
