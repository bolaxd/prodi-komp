jam_masuk = int(input('jam masuk     : '))
menit_masuk = int(input('menit masuk   : '))
jam_keluar = int(input('jam keluar    : '))
menit_keluar = int(input('menit keluar  : '))

waktu_masuk = jam_masuk * 60 + menit_masuk
waktu_keluar = jam_keluar * 60 + menit_keluar

lama_rental = waktu_keluar - waktu_masuk
if lama_rental < 0:
    lama_rental = (waktu_keluar + (24 * 60)) - waktu_masuk

waktu_rental = (lama_rental) / 60

jam = int(waktu_rental)
menit = int((waktu_rental*60) % 60)

print(f'''-----------------------------------
Lama Rental   : {lama_rental} ({jam} jam {menit} menit)
Biaya Rental  : Rp. {int(waktu_rental * 5000)}
''')
