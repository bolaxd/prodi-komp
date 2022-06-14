a = input()
b = input()


a = int(a)
b = int(b)


selisih = abs(a - b)

menangA = a > b
menangB = a < b
seri = a == b

if menangA:
    print('Anne mendapat saldo gopei', selisih)
elif menangB:
    print('Bee mendapat saldo gopei', selisih)
elif seri:
    print('seri', selisih)
