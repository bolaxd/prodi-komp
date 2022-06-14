# Sejak
sjk_tgl = 1
sjk_bln = 1
sjk_thn = 1900

tahun,bulan,tanggal = input('Tanggal [YYYY-MM-DD] : ').split('-')
tahun,bulan,tanggal = int(tahun),int(bulan),int(tanggal)

def isKabisat(tahun):
    # Cek kabisat ato bukan
    return tahun % 4 == 0 and (tahun % 100 != 0 or tahun % 400 == 0)


# from datetime import date

# d0 = date(2020, 1, 1)
# d1 = date(2020, 2, 20)
# delta = d1 - d0
# print(delta.days)