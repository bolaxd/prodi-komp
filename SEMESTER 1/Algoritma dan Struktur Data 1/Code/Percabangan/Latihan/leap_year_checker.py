# input
tahun = int(input('Tahun : '))

# Sebuah tahun disebut kabisat kalau
# ▪ Tahunnya bukan kelipatan 100 tapi tahunnya
#   merupakan kelipatan 4
# ▪ Tahunnya kelipatan 100 tapi tahunnya juga
#   harus kelipatan 400.

if (tahun % 100 != 0) and (tahun % 4 == 0):
    print('Tahun', tahun, 'adalah tahun kabisat')
elif (tahun % 100 == 0) and (tahun % 400 == 0):
    print('Tahun', tahun, 'adalah tahun kabisat')
else:
    print('Tahun', tahun, 'bukan tahun kabisat')

