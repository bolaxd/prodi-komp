kode_kota = input('Kode Kota:\n1. Jakarta\n2. Yogyakarta\n3. Surabaya\nPilihan Kota [1/2/3] ? ')
kode_kelas = input('Kode Kelas :\n1. Ekonomi\n2. Bisnis\n3. Eksekutif\nPilihan Kelas [1/2/3] ? ')
tiket = int(input('Banyak Tiket : '))
diskon = 0

if kode_kota == '1': # Jakarta
    if kode_kelas == '1': # ekonomi
        harga = 100000
    elif kode_kelas == '2': # bisnis
        harga = 400000
    elif kode_kelas == '3': # eksekutif
        harga = 700000
    else:
        print('Pilihan kode kelas tidak valid!')
        exit()
elif kode_kota == '2': # Yogyakarta
    if kode_kelas == '1': # ekonomi [TANYA VOUCHER]
        harga = 200000
        voucher = input('Kode Voucher : ')
        if voucher == 'PROMO':
            diskon = 0.10
    elif kode_kelas == '2': # bisnis
        harga = 500000
    elif kode_kelas == '3': # eksekutif
        harga = 800000
    else:
        print('Pilihan kode kelas tidak valid!')
        exit()
elif kode_kota == '3': # Surabaya
    if kode_kelas == '1': # ekonomi
        harga = 300000
    elif kode_kelas == '2': # bisnis
        harga = 600000
    elif kode_kelas == '3': # eksekutif [TANYA VOUCHER]
        harga = 900000
        voucher = input('Kode Voucher : ')
        if voucher == 'PROMO':
            diskon = 0.10
    else:
        print('Pilihan kode kelas tidak valid!')
        exit()
else:
    print('Pilihan kode kota tidak valid!')
    exit()

subtotal = (harga * tiket)
diskont = (diskon * subtotal)
totalbayar = subtotal - diskont

print(f'Harga Tiket  : Rp. {harga:10.0f}')
print(f'Sub Total    : Rp. {subtotal:10.0f}')
print(f'Diskon       : Rp. {diskont:10.0f}')
print(f'Total Bayar  : Rp. {totalbayar:10.0f}')
