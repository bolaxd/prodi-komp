package latihan1.hanif.pbo.main;

public class Mahasiswa {

    private String nama, nim, kelas, jurusan, alamat;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    public void tampilDataMahasiswa(MainView mhs) {
        this.setNama(mhs.getTxtNama().getText());
        this.setNim(mhs.getTxtNim().getText());
        this.setAlamat(mhs.getAlamat().getText());
        
        if (mhs.getBtnKelas1().isSelected()) {
            this.setKelas("IF-4");
        }
        if (mhs.getBtnKelas2().isSelected()) {
            this.setKelas("IF-5");
        }
        if (mhs.getBtnKelas3().isSelected()) {
            this.setKelas("IF-6");
        }
        if (mhs.getBtnKelas4().isSelected()) {
            this.setKelas("IF-7");
        }
        
        String[] arrayJurusan = new String[] {"TEKNIK INFORMATIKA", "SISTEM INFORMASI", "TEKNIK KOMPUTER"};
        this.setJurusan(arrayJurusan[mhs.getJurusan().getSelectedIndex()]);
        
        String textTampil = "";
        textTampil += "NAMA MAHASISWA          : " + this.getNama();
        textTampil += "\nNIM MAHASISWA              : " + this.getNim();
        textTampil += "\nKELAS MAHASISWA        : " + this.getKelas();
        textTampil += "\nJURUSAN                          : " + this.getJurusan();
        textTampil += "\nALAMAT MAHASISWA      : " + this.getAlamat();
        
        mhs.getTxtTampil().setText(textTampil);
    }
}
