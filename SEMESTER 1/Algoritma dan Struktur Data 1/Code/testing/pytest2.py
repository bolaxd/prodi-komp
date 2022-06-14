n = int(input())

dict_uigm = {}

for i in range(n):
    baris = input().split(' ')
    nama = baris[0]
    dict_uigm[nama] = int(baris[1])

Nama_kampus = max(dict_uigm, key=dict_uigm.get)

print('{}: {}'.format(Nama_kampus, dict_uigm[Nama_kampus]))