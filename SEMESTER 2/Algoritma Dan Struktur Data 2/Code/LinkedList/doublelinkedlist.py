class Node:
    def __init__(self, info):
        self.info = info
        self.next = None
        self.prev = None


class doubleLinkedList:
    def __init__(self):
        self.awal = None
        self.akhir = None

    def isEmpty(self):
        return self.awal is None

    def display(self):  # traversal menampilkan data
        print("Data : ", end="")
        if self.isEmpty():
            print("[Data Kosong]")
        else:
            bantu = self.awal
            while bantu is not None:
                print(bantu.info, " ", end="")
                bantu = bantu.next
            print()

    def displayReverse(self):  # traversal menampilkan data
        print("Data : ", end="")
        if self.isEmpty():
            print("[Data Kosong]")
        else:
            bantu = self.akhir
            while bantu is not None:
                print(bantu.info, " ", end="")
                bantu = bantu.prev
            print()

    def size(self):
        if self.isEmpty():
            banyakNode = 0
        else:
            bantu = self.awal
            banyakNode = 1
            while bantu.next is not None:
                banyakNode = banyakNode + 1
                bantu = bantu.next
        return banyakNode

    def getFirst(self):
        return self.awal

    def getLast(self):
        return self.akhir

    def get(self, index):
        if self.isEmpty() or index < 1 or index > self.size():
            return None
        else:
            bantu = self.awal
            posisi = 1
            while posisi < index:
                bantu = bantu.next
                posisi = posisi + 1
            return bantu

    def addFirst(self, info):
        newNode = Node(info)
        if self.isEmpty():
            self.awal = newNode
            self.akhir = newNode
        else:
            newNode.next = self.awal
            self.awal.prev = newNode
            self.awal = newNode

    def addLast(self, info):
        newNode = Node(info)
        if self.isEmpty():
            self.awal = newNode
            self.akhir = newNode
        else:
            self.akhir.next = newNode
            newNode.prev = self.akhir
            self.akhir = newNode

    def add(self, info, index):
        if self.isEmpty() or index == 1:
            self.addFirst(info)
        else:
            nodeSisip = self.get(index)
            if nodeSisip is not None:
                newNode = Node(info)
                newNode.prev = nodeSisip.prev
                newNode.next = nodeSisip
                nodeSisip.prev.next = newNode
                nodeSisip.prev = newNode
            else:
                print("Penyisipan gagal Karena index tidak ditemukan")

    def removeFirst(self):
        if self.isEmpty():
            print("Ngak bisa hapus karena datanya kosong")
        elif self.awal == self.akhir:  # linked list hanya 1 data
            removedNode = self.awal
            self.awal = None
            self.akhir = None
            del removedNode
        else:  # linked list memiliki data lebih dari 1
            removedNode = self.awal
            self.awal = self.awal.next
            self.awal.prev = None
            del removedNode

    def removeLast(self):
        if self.isEmpty():
            print("Ngak bisa hapus karena datanya kosong")
        elif self.awal == self.akhir:  # linked list hanya 1 data
            removedNode = self.awal
            self.awal = None
            self.akhir = None
            del removedNode
        else:  # linked list memiliki data lebih dari 1
            removedNode = self.akhir
            self.akhir = self.akhir.prev
            self.akhir.next = None
            del removedNode

    def remove(self, index):
        if self.isEmpty():
            print("Ngak bisa hapus karena datanya kosong")
        elif index == 1:
            self.removeFirst()
        elif index == self.size():  # hapus akhir
            self.removeLast()
        else:  # menghapus di tengah
            removedNode = self.get(index)
            if removedNode is not None:
                removedNode.prev.next = removedNode.next
                removedNode.next.prev = removedNode.prev
                del removedNode
            else:
                print("Ngak bisa hapus karena index hapus tidak ditemukan")

    def removeAll(self):
        while self.isEmpty() == False:
            self.removeFirst()


list1 = doubleLinkedList()
list1.addLast(1)
list1.addLast(2)
list1.addLast(3)
list1.addLast(4)
list1.addLast(5)
list1.display()
list1.displayReverse()
list1.removeAll()
list1.display()
list1.displayReverse()


# Antrian - Queue => FIFO (First In, First Out)
#  Tambah Data  => Add First
#  Ambil data => Remove First

# Tumpukan - Stack => Last In, First Out
#    Tambah Data => Add_Last
#    Ambil Data => Remove Last

#  Tumpukan piring :
#  - Nambah piring ke tumpukan selalu di atas
#  - Mengambil piring pasti dari paling atas