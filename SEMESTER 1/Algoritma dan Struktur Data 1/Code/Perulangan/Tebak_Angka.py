import random

level = 1
percobaan = 0
gameover = False

while not gameover:
    maxRand = level * 10
    kunci = random.randint(1, maxRand)
    print(f'Level {level} [1..{maxRand}]')
    # print(kunci)
    tebakan=0
    while (tebakan != kunci) and not gameover:
        tebakan=int(input("Tebakan anda ? "))
        if tebakan==kunci:
            print("Selamat. Tebakan Anda Benar\n\n")
            level += 1
            percobaan = 0
        elif tebakan > kunci:
            print("Terlalu Besar")
            percobaan += 1
            if percobaan > 4:
                gameover = True
        else:
            print("Terlalu Kecil")
            percobaan += 1
            if percobaan > 4:
                gameover = True

print(f'''\n\nGame Over. Anda telah salah menebak 5 kali.
Angka rahasia adalah {kunci}''')
                    
