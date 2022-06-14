a = input('')
b = input('')
c = input('')

if a == b == c:
    print('imbang')
elif (a != b and b != c) and (a == c):
    print('Pemain 2 menang')
elif (a != b and a != c) and (b == c):
    print('Pemain 1 menang')
else:
    print('Pemain 3 menang')

