saldo = int(input('Saldo Awal   : Rp. '))
bunga = int(input('Bunga (%)    : '))
waktu = int(input('Jangka Waktu : '))
print('-' * 37)
for i in range(0, waktu):
    bunga = saldo * 0.10
    saldo += bunga
    print('Saldo Akhir bulan ke-{} : Rp. {:10.0f}'.format(i + 1, saldo))
