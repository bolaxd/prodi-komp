# input 
jam = int(input())

# inisialisasi variabel jumlah jam
jumlah_jam = jam

# inisialisasi variabel banyaknya hari
jumlah_hari = jumlah_jam ** 1

# perulangan untuk membaca input dan menjumlahkan jumlah jam dan jumlah hari
while jam != -1:
    # penjumlahan jumlah jam
    jumlah_jam += jam
    # penjumlahan jumlah hari
    jumlah_hari += 1
    # input 
    jam = int(input())

# output rata-rata = jumlah waktu / banyak waktu
rata_rata = jumlah_jam / jumlah_hari
print(rata_rata, jumlah_jam, jumlah_hari)