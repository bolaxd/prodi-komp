import random

jumlah_game = 3
poin = {
    'pemain': 0,
    'komputer': 0
}

for i in range(jumlah_game):
    print('\nGame ke-{}'.format(i+1))
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
        poin['pemain'] += 1
    elif ((pemain == 'K') and (komputer == 'G')) or ((pemain == 'B') and (komputer == 'K')) or ((pemain == 'G') and (komputer == 'B')):
        print('Komputer memilih', pilihan, 'Komputer Menang!')
        poin['komputer'] += 1
    
    print('=' * 30, '[Anda]  {} - {}  [Komputer]'.format(poin['pemain'], poin['komputer']), '=' * 30)

print('\n\nGame Over. {}'.format('Anda menang' if poin['pemain'] > poin['komputer'] else 'Komputer menang' if poin['pemain'] < poin['komputer'] else 'Poin draw'))