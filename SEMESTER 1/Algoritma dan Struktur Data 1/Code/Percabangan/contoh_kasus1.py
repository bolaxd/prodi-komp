import math

uts = int(input('Nilai UTS : '))
uas = int(input('Nilai UAS : '))

perhitungan_nilai_akhir = 0.40 * uts + 0.60 * uas
sempurna = ''
if (perhitungan_nilai_akhir == 100):
    sempurna = '>>> Sempurna <<<”'


print(f'''------------------------------------------
Nilai AKhir : {perhitungan_nilai_akhir:.2f}
{sempurna}''')