# inisialisasi
jumlah_hadir = 0

# for loop
for i in range(14):
    # input dan casting
    presensi = int(input())
    if presensi:
        # menjumlahkan kehadiran
        jumlah_hadir += 1

# hitung presentase
presentase = jumlah_hadir / 14 * 100

# cetak persentase
print("Persentase: {:.2f}".format(presentase))

# percabangan
if presentase > 75:
    print(f'bisa ikut UAS')
else:
    print(f'tidak bisa ikut UAS')