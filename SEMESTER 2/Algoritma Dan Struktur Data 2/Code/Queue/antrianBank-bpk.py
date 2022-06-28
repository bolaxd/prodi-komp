from queueLinkedList import queueLinkedList

q = queueLinkedList()
nomorAntrian = 0
antrianDiLoket1 = 0
antrianDiLoket2 = 0
antrianSelanjutnya = 0
menu = 0
while menu!=4:
    # tampilkan status antrian
    print("SISTEM ANTRIAN BANK S.A.T")
    print("-"*30)
    print("Loket 1 : ", antrianDiLoket1)
    print("Loket 2 : ", antrianDiLoket2)
    print("Selanjutnya : ", end="")
    if q.isEmpty():
        antrianSelanjutnya = 0
    else:
        antrianSelanjutnya = q.peek()
    print(antrianSelanjutnya)
    # tampilkan menu
    print("-"*30)
    print("1. Ambil Antrian Baru")
    print("2. Loket 1 Memanggil")
    print("3. Loket 2 Memanggil")
    print("4. Keluar dari Aplikasi")
    print("-"*30)
    # baca menu yang dipilih
    menu = int(input("Pilihan anda ? "))

    # seting action sesuai menu yang dipilih
    if menu==1:
        nomorAntrian = nomorAntrian + 1
        q.enqueue(nomorAntrian)
        print("Nomor Antrian terbaru adalah ", nomorAntrian)
    elif menu==2:
        if not q.isEmpty():
            antrianDiLoket1=q.dequeue()
            print("Nomor Antrian",antrianDiLoket1,"ke Loket 1")
    elif menu==3:
        if not q.isEmpty():
            antrianDiLoket2 = q.dequeue()
            print("Nomor Antrian", antrianDiLoket2, "ke Loket 2")

    print()
    print()
