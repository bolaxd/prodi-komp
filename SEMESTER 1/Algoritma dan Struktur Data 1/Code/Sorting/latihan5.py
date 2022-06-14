from datetime import datetime as dt

def urutWaktu(data):
    return dt.strptime(data, "%d/%m/%Y")

def urutkanTanggal(data):
    return sorted(data, key=urutWaktu)

data = ['02/06/2011', '05/08/2011', '04/02/2011', '14/01/2010', '13/12/2010', '31/12/2009']
print(data)

data = urutkanTanggal(data)
print(data)