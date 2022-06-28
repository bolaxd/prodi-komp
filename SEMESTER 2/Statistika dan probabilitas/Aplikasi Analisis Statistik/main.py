from lib.menu import Menu


if __name__ == '__main__':
    try:
        menu = Menu()
        menu.main_menu()
    except KeyboardInterrupt:
        menu.keluar()