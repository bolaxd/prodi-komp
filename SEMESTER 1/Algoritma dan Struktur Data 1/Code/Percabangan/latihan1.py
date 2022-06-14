string_choice = '''Perhitungan Tiket Kereta Api
----------------------------
Jurusan :
1. Jakarta
2. Yogyakarta
3. Surabaya
Pilihan Jurusan [1/2/3]: '''
kode_kota = input(string_choice)
banyak_tiket = input('Banyak tiket : ')

harga_bayar = 0
total_bayar = 0

if kode_kota == '1':
    harga_bayar = 150000
    total_bayar = harga_bayar * int(banyak_tiket)
elif kode_kota == '2':
    harga_bayar = 300000
    total_bayar = harga_bayar * int(banyak_tiket)
elif kode_kota == '3':
    harga_bayar = 400000
    total_bayar = harga_bayar * int(banyak_tiket)

print(f'''
Harga Bayar  : {harga_bayar}
Total Bayar  : {total_bayar}''')