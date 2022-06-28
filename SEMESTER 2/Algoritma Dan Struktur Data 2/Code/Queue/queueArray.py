import array as ar

class queueArray:
    def __init__(self, max, datatype='i'):
        self.__max = max  # batas maksimal data dalam queue
        self.__content = ar.array(datatype, [0] * max)  # inisialisasi isi queue
        self.__front = -1
        self.__rear = -1
    def isEmpty(self):
        return self.__front == -1
    def isFull(self):
        return self.__rear == self.__max - 1
    def count(self):
        return self.__rear + 1
    def __str__(self):
        out = "queueArray(["
        if self.isEmpty():
            out = out + " EmptyQueue "
        else:
            for i in range(self.__rear + 1): # 0 s,d rear
                out = out + str(self.__content[i]) + " "
        out = out + "]"
        out = out + ")"
        return out
    def enqueue(self, data):
        if self.isFull():
            print("Enqueue error karena queue sudah penuh")
        else:
            if self.isEmpty():
                self.__front = 0
                self.__rear = 0
            else:
                self.__rear = self.__rear + 1
            self.__content[self.__rear] = data
    def dequeue(self):
        if self.isEmpty():
            print("Dequeue error karena queue kosong")
        else:
            dataFront = self.__content[self.__front]
            # geser
            for i in range(1,self.__rear+1):
                self.__content[i-1]= self.__content[i]
            self.__rear = self.__rear - 1
            if self.__rear == -1:
                self.__front = -1
            return dataFront
    def peek(self):
        if self.isEmpty():
            print("Peek gagal karena queue kosong.")
        else:
            return self.__content[self.__front]
    def empty(self):
        self.__front = -1
        self.__rear = -1


if __name__ == "__main__": # jika dipanggil sebagai program utama
    q = queueArray(3)
    print("#1 : Isi Queue : ", q)
    print("#2 : Banyak Data : ", q.count())
    q.enqueue(1)
    print("#3 : Isi Queue : ", q)
    q.enqueue(2)
    print("#4 : Isi Queue : ", q)
    q.enqueue(3)
    print("#5 : Isi Queue : ", q)
    data = q.dequeue()
    print("#6 : Hasil Dequeue : ", data)
    print("#7 : Isi Queue : ", q)
    print("#8 : Peek : ", q.peek())
    print("#9 : Isi Queue : ", q)
    q.empty()
    print("#10 : Isi Queue : ", q)

