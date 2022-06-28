class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class queueLinkedList:
    def __init__(self):
        self.__front = None
        self.__rear = None
    def isEmpty(self):
        return self.__front is None
    def count(self):
        banyakdata = 0
        temp = self.__front
        while temp is not None:
            banyakdata = banyakdata + 1
            temp = temp.next
        return banyakdata

    def __str__(self):
        out = "queueLinkedList(["
        if self.isEmpty():
            out = out + " EmptyQueue "
        else:
            temp = self.__front
            while temp is not None:
                out = out + str(temp.data) + " "
                temp = temp.next
        out = out + "]"
        out = out + ")"
        return out
    def enqueue(self, data):
        newNode = Node(data)
        if self.isEmpty():
            self.__front = newNode
            self.__rear = newNode
        else:
            self.__rear.next = newNode
            self.__rear = newNode
    def dequeue(self):
        if self.isEmpty():
            print("Dequeue error karena queue kosong")
        else:
            dataFront=self.__front.data
            deletedNode = self.__front
            if self.__front == self.__rear: # jika hanya 1 node
                self.__front = None
                self.__rear = None
            else:
                self.__front = self.__front.next
            del deletedNode
            return dataFront
    def peek(self):
        if self.isEmpty():
            print("Peek error karena queue kosong")
        else:
            return self.__front.data
    def empty(self):
        while not self.isEmpty():
            self.dequeue()


if __name__ == "__main__": # jika dipanggil sebagai program utama
    q = queueLinkedList()
    print("#1 Isi Queue : ", q)
    q.enqueue("Asep")
    print("#2 Isi Queue : ", q)
    q.enqueue("Budi")
    print("#3 Isi Queue : ", q)
    q.enqueue("Cecep")
    print("#3 Isi Queue : ", q)
    data = q.dequeue()
    print("#4 Hasil Dequeue : ", data)
    print("#5 Isi Queue : ", q)
    print("#6 Peek : ", q.peek())
    print("#7 Isi Queue : ", q)
    q.empty()
    print("#8 Isi Queue : ", q)




