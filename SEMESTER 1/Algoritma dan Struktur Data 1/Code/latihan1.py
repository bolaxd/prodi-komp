jam_masuk       = int(input('jam masuk     : '))
menit_masuk     = int(input('menit masuk   : '))
jam_keluar      = int(input('jam keluar    : '))
menit_keluar    = int(input('menit keluar  : '))


waktu_masuk     = jam_masuk * 60 + menit_masuk
waktu_keluar    = jam_keluar * 60 + menit_keluar

waktu_rental    = (waktu_keluar - waktu_masuk) / 60

jam             = int(waktu_rental)
menit           = int((waktu_rental*60) % 60)

# if jam < 0 or menit < 0:
#     jam = (jam + 24) 

# print(waktu_masuk, waktu_keluar, waktu_rental, jam, menit, int(waktu_rental * 5000))

# Jam Masuk     : {jam_masuk}
# Menit Masuk   : {menit_masuk}
# Jam Keluar    : {jam_keluar}
# Menit Keluar  : {menit_keluar}

print(f'''-----------------------------------
Lama Rental   : {waktu_keluar - waktu_masuk} ({jam} jam {menit} menit)
Biaya Rental  : {int(waktu_rental * 5000)}
''')
