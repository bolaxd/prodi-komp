import json
import os
import csv
import pandas
from tabulate import tabulate

Color = {
    'BOLD': '\u001b[1m',
    'UNDERLINE': '\u001b[4m',
    'STRIKETHROUGH': '\u001b[9m',
    'BLACK': '\u001b[30m',
    'RED': '\u001b[31m',
    'GREEN': '\u001b[32m',
    'YELLOW': '\u001b[33m',
    'BLUE': '\u001b[34m',
    'MAGENTA': '\u001b[35m',
    'CYAN': '\u001b[36m',
    'WHITE': '\u001b[37m',
    'BG_RED': '\u001b[41m',
    'BG_GREEN': '\u001b[42m',
    'BG_ORANGE': '\u001b[43m',
    'BG_BLUE': '\u001b[44m',
    'BG_MAGENTA': '\u001b[45m',
    'BG_CYAN': '\u001b[46m',
    'BG_WHITE': '\u001b[47m',
    'BD_RED': '\u001b[91m',
    'BD_GREEN': '\u001b[92m',
    'BD_ORANGE': '\u001b[93m',
    'BD_BLUE': '\u001b[9m',
    'BD_MAGENTA': '\u001b[95m',
    'BD_CYAN': '\u001b[96m',
    'BD_WHITE': '\u001b[97m',
    'RESET': '\u001b[0m'
}


def get_listdir(path):
    return [csv for csv in os.listdir(path) if '.csv' in csv]


def csv2dict(path):
    with open(path, 'r') as f:
        data = f.readlines()

    print(data)


def csv_get_title(path):
    with open(path, 'r') as f:
        data = f.readline()[1:].replace('"\n', '').split('","')

    return data


# https://www.geeksforgeeks.org/convert-csv-to-json-using-python/
def csv_get_column(path, key):
    # create a dictionary
    data = []

    # Open a csv reader called DictReader
    with open(path, encoding='utf-8') as csvf:
        csvReader = csv.DictReader(csvf)

        # Convert each row into a dictionary
        # and add it to data
        for rows in csvReader:
            data.append(rows[key])
            # Assuming a column named 'No' to
            # be the primary key
            # key = rows[key]
            # data[key] = rows

    return data


def buat_tabel_frekuensi(data):
    dataTable = pandas.Series(data).value_counts(
    ).reset_index().sort_values('index').reset_index(drop=True)
    dataTable.columns = ['Nilai', 'F1']
    # tableDict = dataTable.to_dict()
    # tableList = []

    print(tabulate(dataTable, tablefmt="pipe", headers="keys"))


def nilai_tengah(deret):
    deret.sort()
    n = len(deret)  # ambil panjang data
    i_tengah = n // 2  # dibulatkan ke bawah

    # jika n adalah ganjil
    if n % 2 == 1:
        return deret[i_tengah]

    # jika n genap
    return (deret[i_tengah - 1] + deret[i_tengah]) / 2


def nilai_terbanyak(deret):
    # dictionary untuk mapping nilai terbanyak
    peta_kemunculan = {}

    # perulangan satu-persatu tiap bilangan
    for bilangan in deret:
        # periksa apakah sudah pernah muncul atau belum
        if bilangan in peta_kemunculan:
            peta_kemunculan[bilangan] += 1
        else:
            peta_kemunculan[bilangan] = 1

    # cari kemunculan terbanyak
    bilangan_terbesar = deret[0]  # ambil angka pertama sebagai yg terbanyak
    for bilangan in peta_kemunculan.keys():
        jumlah = peta_kemunculan[bilangan]

        if jumlah > peta_kemunculan[bilangan_terbesar]:
            bilangan_terbesar = bilangan

    return bilangan_terbesar
# print(buat_tabel_frekuensi([1, 2, 2, 3]))

def letak_kuartil(deret, kuartil):
    kuartil = (kuartil * (len(deret) + 1)) / 4
    
    return kuartil

def nilai_kuartil(deret, letak_kuartil):
    a, b = str(letak_kuartil).split('.')
    a, b = int(a), int(b)
    
    deret = [int(drt) for drt in deret]
    xa = deret[a - 1]
    xa1 = deret[a]
    zerocoma_b = float(f'0.{xa}')
    nilai = xa + (zerocoma_b * (xa1 - xa))
    
    return nilai