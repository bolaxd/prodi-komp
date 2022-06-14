class Node:
    def _init_(self, info):
        self.info = info
        self.prev = None
        self.next = None

class DoubleLinkedList:
    def _init_(self):
        self.awal = None
        self.akhir = None

    def isEmpty(self):
            return self.awal is None
            
    def display(self):
        print("Data : ", end="")
        if self.isEmpty():
            print("[Data Kosong]")
        else:
            bantu = self.awal
            while bantu is not None:
                print(bantu.info, " ", end="")
                bantu = bantu.next
            print()
                
list = DoubleLinkedList()
list.display()

# print(doublyLL)  # 1←→2←→3