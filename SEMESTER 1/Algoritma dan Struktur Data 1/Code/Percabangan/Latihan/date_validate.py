tgl = int(input('Tanggal : '))
bln = int(input('Bulan   : '))
thn = int(input('Tahun   : '))


def output(tgl, bln, thn, valid=True):
    if valid:
        print(f'Tanggal {tgl}/{bln}/{thn} adalah tanggal valid')
    else:
        print(f'Tanggal {tgl}/{bln}/{thn} bukan tanggal valid')


if 1 <= bln <= 12:
    if (bln == 1) or (bln == 3) or (bln == 5) or (bln == 7) or (bln == 8) or (bln == 10) or (bln == 12):
        if 1 <= tgl <= 31:
            output(tgl, bln, thn, True)
        else:
            output(tgl, bln, thn, False)
    elif (bln == 4) or (bln == 6) or (bln == 9) or (bln == 11):
        if 1 <= tgl <= 30:
            output(tgl, bln, thn, True)
        else:
            output(tgl, bln, thn, False)
    elif bln == 2:
        if ((thn % 100 != 0) and (thn % 4 == 0)) or ((thn % 100 == 0) and (thn % 400 == 0)):
            output(tgl, bln, thn, True)
        else:
            output(tgl, bln, thn, False)
    else:
            output(tgl, bln, thn, False)
else:
    output(tgl, bln, thn, False)
