import random

pemain = input('Komputer telah memilih. Sekarang giliran anda.\nPilihan Anda (G/K/B) ? ').upper()
komputer = random.choice(['G','K','B'])

if komputer == 'G':
    pilihan = 'Gunting'
elif komputer == 'K':
    pilihan = 'Kertas'
else:
    pilihan = 'Batu'

if ((pemain == 'K') and (komputer == 'K')) or ((pemain == 'B') and (komputer == 'B')) or ((pemain == 'G') and (komputer == 'G')):
    print('Komputer memilih', pilihan, 'Draw!')
elif ((pemain == 'K') and (komputer == 'B')) or ((pemain == 'B') and (komputer == 'G')) or ((pemain == 'G') and (komputer == 'K')):
    print('Komputer memilih', pilihan, 'Anda Menang!')
elif ((pemain == 'K') and (komputer == 'G')) or ((pemain == 'B') and (komputer == 'K')) or ((pemain == 'G') and (komputer == 'B')):
    print('Komputer memilih', pilihan, 'Komputer Menang!')
else:
    print('Pilih hanya (G/B/K) !')