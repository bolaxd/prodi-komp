# Input
harga   = int(input("Harga Barang   : "))
qty     = int(input("Qty            : "))
# Proses
sub_total = harga * qty
if qty >= 12:
    diskon = 0.20 * sub_total
else:
    diskon = 0
total = sub_total - diskon
# Output
print(f"Sub Total      : Rp. {sub_total:10}")
print(f"Diskon         : Rp. {diskon:10.0f}")
print(f"Total Bayar    : Rp. {total:10.0f}")
