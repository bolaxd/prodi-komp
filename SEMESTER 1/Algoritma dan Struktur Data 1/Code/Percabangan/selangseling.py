# input
n = input()
m = input()

# casting
n, m = int(n),int(m)

# inisialisasi variabel jumlah
jumlah = 0

# inisialisasi variabel x untuk menyatakan suku ke-
x = 1

# perulangan for
for i in range(n, m + 1):
     # memeriksa suku ganjil
    if x % 2 == 1:
        deret = i
        jumlah += 1/deret
        print(deret, jumlah)
    elif x % 2 == 0:
        deret = i
        jumlah -= 1/deret
        print(deret, jumlah)

    x += 1

# cetak
print(f'{jumlah:0.2f}')