n = int(input())

dict_rating_pemain = {}

for i in range(n):
    baris = input().split(' ')
    nama_pemain = baris[0]
    baris1, baris2, baris3 = int(baris[1]), int(baris[2]), int(baris[3])
    dict_rating_pemain[nama_pemain] = [baris1, baris2, baris3] 


for i in dict_rating_pemain:
    print('{}: {}'.format(i, dict_rating_pemain[i]))