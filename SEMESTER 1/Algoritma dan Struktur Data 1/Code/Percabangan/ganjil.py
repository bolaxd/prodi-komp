# input dan casting
bilangan = int(input())

# inisialisasi variabel jumlah
jumlah = 0

# perulangan untuk membaca input dan menjumlahkan bilangan ganjil
while bilangan > -1:
    # memeriksa bilangan ganjil
    if bilangan % 2 == 1:
        # penjumlahan
        jumlah += bilangan
    # input dan casting
    bilangan = int(input())

# output
print(jumlah)