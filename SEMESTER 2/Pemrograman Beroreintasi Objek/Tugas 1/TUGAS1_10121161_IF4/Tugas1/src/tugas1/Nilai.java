/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author user
 */
public class Nilai {
    private int tugas, uts, uas;

    Nilai() {
        
    }
    
    Nilai(int tugas, int uts, int uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    /**
     * @param tugas the tugas to set
     */
    public void setTugas(int tugas) {
        this.tugas = tugas;
    }

    /**
     * @param uts the uts to set
     */
    public void setUts(int uts) {
        this.uts = uts;
    }

    /**
     * @param uas the uas to set
     */
    public void setUas(int uas) {
        this.uas = uas;
    }

    /**
     * @return the tugas
     */
    public int getTugas() {
        return tugas;
    }

    /**
     * @return the uts
     */
    public int getUts() {
        return uts;
    }

    /**
     * @return the uas
     */
    public int getUas() {
        return uas;
    }
    
    public double nilaiAkhir() {
        return (this.getTugas() * 0.30) + (this.getUts() * 0.30) + (this.getUas() * 0.40);
    }
    
    public char indexNilai() {
        char indeks;
        double nilaiAkhir = this.nilaiAkhir();
        
        if (nilaiAkhir >= 80) {
            indeks = 'A';
        } else if (nilaiAkhir >= 68 && nilaiAkhir < 80) {
            indeks = '8';
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 68) {
            indeks = 'C';
        } else if (nilaiAkhir >= 30 && nilaiAkhir < 45) {
            indeks = 'D';
        } else {
            indeks = 'E';
        }
        
        return indeks;
    }
}
