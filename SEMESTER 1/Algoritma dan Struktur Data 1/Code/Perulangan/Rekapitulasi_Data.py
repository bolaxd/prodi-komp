
data_ke = 1
kumpulan_data = []

data = int(input(f'Masukan Data Ke-{data_ke} : '))
while data >= 0:
    kumpulan_data.append(data)
    data_ke += 1 
    data = int(input(f'Masukan Data Ke-{data_ke} : '))

print('-' * 30)
print('Total :', sum(kumpulan_data))
print('Banyak Data :', len(kumpulan_data))
print('Rata-Rata :', sum(kumpulan_data) / len(kumpulan_data))

