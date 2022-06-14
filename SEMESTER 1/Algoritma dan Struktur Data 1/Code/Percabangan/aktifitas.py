# input 
aktivitas = input()

# inisialisasi variabel jumlah aktivitas makan
jumlah_aktivitas_makan = 0

# perulangan untuk membaca input dan menjumlahkan aktivitas makan
while aktivitas != 'kenyang':
    # memeriksa aktivitas makan
    if aktivitas == 'makan':
        # penjumlahan
        jumlah_aktivitas_makan += 1
    # input
    aktivitas = input()

# output
print(jumlah_aktivitas_makan)