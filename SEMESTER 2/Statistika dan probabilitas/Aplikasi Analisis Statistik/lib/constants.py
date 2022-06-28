from colorama import Fore, Style

class Constants:
    pesan = {
        'title': f'''{Fore.WHITE}
# ============================================== #
#    {Fore.CYAN}   [  Aplikasi Analisis Statistika  ]  {Fore.WHITE}     #
# ============================================== #''',
        'input': f'''{Fore.YELLOW}\x1b[1m[ Pilih Salah Satu ]\x1b[0m{Fore.BLUE} >> {Style.RESET_ALL}''',
        'main_menu': f'''{Fore.WHITE}
# ============================================== #
#    {Fore.CYAN}   [  Aplikasi Analisis Statistika  ]  {Fore.WHITE}     #
# ============================================== #

{Fore.YELLOW}\x1b[3mInfo : Hanya data dengan format .csv didalam folder db yang akan dideteksi.\x1b[0m

{Fore.WHITE}1) {Fore.GREEN}Data Tunggal
{Fore.WHITE}2) {Fore.GREEN}Data Kelompok (Not Available)
{Fore.LIGHTBLACK_EX}--------------------------------
{Fore.WHITE}3) {Fore.CYAN}Tentang Aplikasi (Credit)
{Fore.WHITE}4) {Fore.RED}Keluar
''',
        'invalid_menu': f'''\n{Fore.RED}Opsi tersebut tidak valid, pilih salah satu angka di menu!{Style.RESET_ALL}\n''',
        'keluar': Fore.YELLOW + '\nBye 🤞\n' + Style.RESET_ALL
    }
    
    def __init__(self) -> None:
        pass

    def getMessage(self, kunciPesan):
        return self.pesan[kunciPesan]

