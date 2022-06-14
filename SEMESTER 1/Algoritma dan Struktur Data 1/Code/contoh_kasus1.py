# Bagian input data
nama_barang  = input('Nama barang? ')
harga_barang = int(input('Harga barang? '))
qty          = int(input('Nama barang? '))

# proses
sub_total    = harga_barang * qty
diskon       = 0.20 * sub_total
total_bayar  = sub_total - diskon

#output
print(f"""
Sub Total       : Rp. {sub_total:10.0f}
Diskon (20%)    : Rp. {diskon:10.0f}
Total bayar     : Rp. {total_bayar:10.0f}
""")