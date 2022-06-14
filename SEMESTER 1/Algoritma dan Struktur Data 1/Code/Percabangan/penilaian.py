nilaitugas = int(input('Nilai Tugas : '))
nilaiuts = int(input('Nilai UTS   : '))
nilaiuas = int(input('Nilai UAS   : '))

hitung_nilai_akhir = (0.30 * nilaitugas) + (0.30 * nilaiuts) + (0.40 * nilaiuas)
indeks_mutu = ''
keterangan = ''

if hitung_nilai_akhir >= 80:
    indeks_mutu = 'A'
    keterangan = 'Sangat Baik'
elif 80 > hitung_nilai_akhir >= 68:
    indeks_mutu = 'B'
    keterangan = 'Baik'
elif 68 > hitung_nilai_akhir >= 56:
    indeks_mutu = 'C'
    keterangan = 'Cukup'
elif 56 > hitung_nilai_akhir >= 45:
    indeks_mutu = 'D'
    keterangan = 'Kurang'
elif 40 > hitung_nilai_akhir >= 0:
    indeks_mutu = 'E'
    keterangan = 'Sangat Kurang'

print('Nilai Akhir : {:0.2f}'.format(hitung_nilai_akhir))
print('Indeks Mutu : {}'.format(indeks_mutu))
print('Keterangan  : {}'.format(keterangan))