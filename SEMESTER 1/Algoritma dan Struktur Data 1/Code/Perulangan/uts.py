# Buka jika input dari keyboard
# N = int(input('N : '))

# Input
N = 100

# Pasang harga dan diskon
harga_bensin = 5000
diskon = 4000

# Initial harga dan diskon untuk assigment
price = 0
disc = 0


# Output header table
print(f'''{'-' * 48}
| Liter | Harga Normal |  Diskon   |    Harga  |
{'-' * 48}''')

# Proses perhitungan didalam looping
for i in range(1, N + 1):
    # kelipatan 5 dan bertambah diskon 
    if (i % 5 == 0):
        disc = diskon * (i // 5)

    # pasang harga berdasarkan liter
    price = i * harga_bensin

    # Assigment ke variable
    harga_normal = price
    harga = price - disc

    # Outputkan isi tabel
    print(f'|{i:6.0f} |   {harga_normal:10.0f} |{disc:10.0f} |{harga:10.0f} |')

# Output footer table
print('-' * 48)



# diskon = 0
# N = 16

# for i in range(1, N + 1):
#     if (i % 5 == 0): 
#         diskon = 4000 * (i // 5)
#     harga_normal = i * 5000
#     harga = harga_normal - diskon
#     print('Harga normal', harga_normal, 'Diskon', diskon, 'Harga', harga)