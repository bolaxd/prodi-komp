import os
from queueLinkedList import queueLinkedList
from playAudio import bicara

def clearConsole():
    os.system('cls' if os.name == 'nt' else 'clear')


def menu(x='-', y='-', z='-'):
    clearConsole()
    print()
    print('         SISTEM ANTRIAN S.A.T. BANK')
    print('  LOKET 1      LOKET 2       No Berikutnya')
    print(f'    [{x}]          [{y}]              [{z}]       ')
    print()
    print('Antrian tersisa : ', q.count())
    print()
    print('Menu Pilihan :')
    print('1.   Tambah Antrian')
    print('2.   Loket 1 Memanggil')
    print('3.   Loket 2 Memanggil')
    print('4.   Keluar')

def opsi_func():
    return input('\nPilih : ')

q = queueLinkedList()
menu('-', '-', q.peek())
opsi = opsi_func()

while opsi != '4':
    if opsi == '1':
        nomorAntrian = q.count() + 1
        q.enqueue(nomorAntrian)
        berikutnya = q.peek()
        menu('-', '-', berikutnya)
        opsi = opsi_func() 
    elif opsi == '2':
        loket1 = q.dequeue() if not q.isEmpty() else '-'
        berikutnya = q.peek() if not q.isEmpty() else '-'
        menu(loket1, '-', berikutnya)
        if not q.isEmpty(): bicara(loket1, 1)
        opsi = opsi_func() 
    elif opsi == '3':
        loket2 = q.dequeue() if not q.isEmpty() else '-'
        berikutnya = q.peek() if not q.isEmpty() else '-'
        menu('-', loket2, berikutnya)
        if not q.isEmpty(): bicara(loket2, 2)
        opsi = opsi_func() 
    else: 
        menu('-', '-', q.peek())
        opsi = opsi_func() 
