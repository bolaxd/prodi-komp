import sys
import math
import traceback
from colorama import init, Fore, Style
from lib.constants import Constants
from lib.util import *
from terminaltables import AsciiTable

init(convert=True)


class Menu(Constants):
    database_dir = 'db'

    def __init__(self) -> None:
        super()
        pass

    # MENU
    def main_menu(self):
        self.clearConsole()
        print(self.getMessage('main_menu'))
        self.selectMenu()
        pass

    def selectMenu(self):
        print(self.getMessage('input'), end='')
        opsi = input()

        while opsi == '1' or opsi == '2' or opsi == '3' or opsi == '4':
            if opsi == '1':
                self.data_tunggal()
                break
            elif opsi == '2':
                self.data_kelompok()
                break
            elif opsi == '3':
                self.credits()
                break
            elif opsi == '4':
                self.keluar()
                break
        else:
            print(self.getMessage('invalid_menu'))
            self.selectMenu()

    # Data kelompol
    def data_kelompok(self):
        self.clearConsole()
        print(f'{Fore.GREEN}[ Coming soon ]', end='')
        input()
        self.main_menu()

    # Data tunggal
    def data_tunggal(self):
        self.clearConsole()
        print(self.getMessage('title'))
        print(
            f'\n{Fore.YELLOW}\x1b[3mInfo : pilih data yang akan di analisis.\x1b[0m\n')
        data = get_listdir(self.database_dir)
        self.select_data_tunggal(data)

    def select_data_tunggal(self, data):
        opts = []
        if len(data) > 0:
            for i in range(len(data)):
                opts.append(i)
                print(
                    f'{Fore.WHITE}{i+1}) {Fore.GREEN}{data[i].replace(".csv", "")}')

            print()
            print(self.getMessage('input'), end='')
            opsi = int(input()) - 1
            print()
            if opsi not in opts:
                print(f'''{Fore.RED}Opsi tidak valid!\n{Style.RESET_ALL}''')
                self.select_data_tunggal(data)
            else:
                self.pilih_judul_data_tunggal(data[opsi])
        else:
            print(
                f'''\n{Fore.RED}Data kosong, mohon isi folder db dengan file csv!\n\n{Fore.GREEN}[ Kembali ]{Style.RESET_ALL}''', end='')
            input()
            self.main_menu()

    def pilih_judul_data_tunggal(self, file):
        try:

            data_judul = csv_get_title(self.database_dir + '/' + file)
            opts = []
            if len(data_judul) > 0:
                for i in range(len(data_judul)):
                    opts.append(i)
                    print(
                        f'{Fore.WHITE}{i+1}) {Fore.GREEN}{data_judul[i]}')

                print()
                print(
                    f'''{Fore.YELLOW}\x1b[1m[ Pilih judul (pastikan semua data adl angka) ]\x1b[0m{Fore.BLUE} >> {Style.RESET_ALL}''', end='')
                opsi = int(input()) - 1
                print()
                if opsi not in opts:
                    print(
                        f'''{Fore.RED}Opsi judul tidak valid!\n{Style.RESET_ALL}''')
                    self.pilih_judul_data_tunggal(file)
                else:
                    self.clearConsole()

                    # PROSES PERHITUNGAN DATA TUNGGAL
                    kolom = csv_get_column(
                        self.database_dir + '/' + file, data_judul[opsi])

                    # Tabel Frekuensi
                    kolom = [int(col) for col in kolom]
                    print(f'{Fore.GREEN}----Tabel frekuensi----')
                    buat_tabel_frekuensi(kolom)

                    # Rata rata hitung
                    sumAll = 0
                    n = len(kolom)
                    for i in range(n):
                        sumAll += kolom[i]

                    print(f'{Fore.BLACK}\n----Rata rata hitung----')
                    print('N                :', n)
                    print('Sum              :', sumAll)
                    print('Hasil            :', sumAll/n)

                    # Rata rata harmonik
                    sum1per4 = 0
                    n = len(kolom)
                    for i in range(n):
                        sum1per4 += 1/kolom[i]

                    print(f'{Fore.YELLOW}\n----Rata rata harmonik----')
                    print('N                :', n)
                    print('sum 1/x          :', sum1per4)
                    print('Hasil            :', n/sum1per4)

                    # Rata rata ukur (Mean)
                    multipleAll = 1
                    n = len(kolom)
                    for i in range(n):
                        multipleAll *= kolom[i]

                    print(f'{Fore.BLUE}\n----Rata rata ukur (mean)----')
                    print('N                :', n)
                    print('Multiple         :', multipleAll)
                    print('Hasil            :', math.pow(multipleAll, 1/n))
 
                    # Modus
                    print(f'{Fore.MAGENTA}\n----Data modus----')
                    print('Nilai            :', nilai_terbanyak(kolom))

                    # Median
                    print(f'{Fore.LIGHTRED_EX}\n----Data median----')
                    print('Urutan           :', ','.join(sorted([str(cl) for cl in kolom])))
                    print('Nilai            :', nilai_tengah(kolom))

                    # Kuartil 
                    print(f'{Fore.LIGHTRED_EX}\n----Data kuartil----')
                    sorted_data = sorted([str(cl) for cl in kolom])
                    print('Urutan data      :', ','.join(sorted_data))
                    LK1 = letak_kuartil(sorted_data, 1)
                    LK3 = letak_kuartil(sorted_data, 3)
                    NILAI_K1 = nilai_kuartil(sorted_data, LK1)
                    NILAI_K3 = nilai_kuartil(sorted_data, LK3)
                    print('Letak kuartil 1  :', LK1)
                    print('Nilai kuartil 1  :', NILAI_K1)
                    print('Letak kuartil 3  :', LK3)
                    print('Nilai kuartil 3  :', NILAI_K3)

                    # Kembali
                    print(
                        f'''\n{Fore.GREEN}[ Kembali ]{Style.RESET_ALL}''', end='')
                    input()
                    self.main_menu()
            else:
                print(
                    f'''\n{Fore.RED}Data csv tidak valid!\n\n{Fore.GREEN}[ Kembali ]{Style.RESET_ALL}''', end='')
                input()
                self.main_menu()
        except ValueError:
            print(traceback.format_exc())
            print(
                f'''\n{Fore.RED}Data tersebut ada yang mengandung bukan angka!\n\n{Fore.GREEN}[ Kembali ]{Style.RESET_ALL}''', end='')
            input()
            self.main_menu()

    # Kosongkan console
    def clearConsole(self):
        os.system('cls' if os.name == 'nt' else 'clear')

    # Credit
    def credits(self):
        self.clearConsole()
        print(f'''{Fore.RED}
# ============================================== #
#            {Fore.LIGHTWHITE_EX}\033[1m[  Tentang Aplikasi  ]\x1b[0m{Fore.RED}              #
#      {Fore.LIGHTWHITE_EX}\x1b[3mLoving yourself will save your soul\x1b[0m{Fore.RED}       #
# ============================================== #
#                                                #
#    {Fore.CYAN}Dibuat Oleh Hanif A S & Ilmi Faturrahman{Fore.RED}    #
{Fore.WHITE}#          {Fore.GREEN}Teknik Informatika 4 / 2021 {Fore.WHITE}          #
#                                                #
#          {Fore.LIGHTMAGENTA_EX}Statistika dan Probabilitas{Fore.WHITE}           #
#               {Fore.YELLOW}Thankyou so much{Fore.WHITE}                 #
#                                                #
# ============================================== # {Style.RESET_ALL}''')
        input('')
        self.main_menu()

    # Keluar
    def keluar(self):
        print(self.getMessage('keluar'))
        sys.exit(0)
