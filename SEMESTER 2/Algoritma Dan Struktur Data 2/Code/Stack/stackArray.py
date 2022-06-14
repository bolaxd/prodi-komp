import array as ar

class stackArray:
    def __init__(self, max, datatype='i'):
       self.max = max # batas maksimal data dalam stack
       self.top = -1 # initialisasi top
       self.data = ar.array(datatype,[0]*max) # inisialisasi isi stack
    def isEmpty(self):
        return self.top == -1
    def isFull(self):
        return self.top == self.max - 1
    def count(self):
        return self.top + 1

    def __str__(self):
        out = "stackArray(Data : ["
        if self.isEmpty():
            out = out + " EmptyStack "
        else:
            for i in range(self.top + 1):
                out = out + str(self.data[i])+ " "
        out = out + "]"
        out = out + ", Top : " + str(self.top)
        out = out + ", Max : " + str(self.max)
        out = out + ")"
        return out
    def push(self, data):
        if self.isFull():
            print("Stack Penuh. Overflow")
        else:
            self.top = self.top + 1
            self.data[self.top] = data
    def pop(self):
        if self.isEmpty():
            print("Stack Kosong. Underflow")
            return None
        else:
            dataInTop = self.data[self.top]
            self.top = self.top - 1
            return dataInTop
    def peek(self):
        if self.isEmpty():
            print("Stack Kosong. Underflow")
            return None
        else:
            return self.data[self.top]
    def empty(self):
        self.top = -1
