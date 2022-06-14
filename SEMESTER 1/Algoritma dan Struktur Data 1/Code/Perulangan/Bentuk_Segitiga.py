N = int(input('N : '))
print('-' * (4 * N))
for i in range(N):
    angka = i+1
    print(f'{angka:2.0f}   :' + (' ' * (N-i)) + ('*' * angka) + ('*' * i))
    