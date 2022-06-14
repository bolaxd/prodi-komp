import locale
import traceback

locale.setlocale(locale.LC_ALL, 'id_ID.UTF-8')

def toID(string):
    return locale.format_string('%10.0f', string, True)
kode_barang = input('Kode barang : ').upper()
qty         = input('Qty         : ')

produk = [
    {
        'kode': 'BK001',
        'nama': 'Buku Tulis',
        'harga': 5000
    },
    {
        'kode': 'PS002',
        'nama': 'Pensil',
        'harga': 2500
    },
    {
        'kode': 'PG001',
        'nama': 'Penggaris 30cm',
        'harga': 15000
    }
]

nama_barang, harga = '-',0

try:
    for i in produk:
    # print(kode_barang == i['kode'])
        if kode_barang == i['kode']:
            nama_barang = i['nama']
            harga = i['harga']
except:
    print(traceback)
# if kode_barang == 'BK001': 
#     nama_barang = 'Buku Tulis'
#     harga       = 5000
# elif kode_barang == 'PS002':
#     nama_barang = 'Pensil'
#     harga       = 2500
# elif kode_barang == 'PG001':
#     nama_barang = 'Penggaris 30 cm'
#     harga       = 15000
# else:
#     print('Tidak dapat menemukan kode barang!')
#     exit()
    
sub_total = harga * int(qty)
diskon = sub_total * 0.30
if diskon > 20000:
    diskon = 20000
total = sub_total - diskon
print('''-----------------------------------
Nama Barang : {}
Harga       : Rp. {}
Sub Total   : Rp. {}
Diskon      : Rp. {}
Total Bayar : Rp. {}
'''.format(nama_barang, toID(harga), toID(sub_total), toID(diskon), toID(total)))
