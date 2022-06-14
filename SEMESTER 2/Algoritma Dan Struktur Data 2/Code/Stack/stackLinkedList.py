class Node:
    def __init__(self, data):
        self.info = data
        self.next = None

class stackLinkedList:
    def __init__(self):
        self.top = None
    def isEmpty(self):
        return self.top is None
    def count(self):
        cnt = 0
        curNode = self.top
        while curNode is not None:
            cnt = cnt + 1
            curNode = curNode.next
        return cnt
    def __str__(self):
        out = "stackLinkedList(Data : ["
        if self.isEmpty():
            out = out + " EmptyStack "
        else:
            out = out + " TOP -> "
            curNode = self.top
            while curNode is not None:
                out = out + str(curNode.info) + " "
                curNode = curNode.next
        out = out + "]"
        out = out + ", Count : " + str(self.count())
        out = out + ")"
        return out

    def push(self, data):
        newNode = Node(data)
        newNode.next =  self.top
        self.top = newNode
    def pop(self):
        if self.isEmpty():
            print(" POP Error. Empty Stack")
            return None
        else:
            prevTop = self.top
            dataInTop = self.top.info
            self.top = self.top.next
            del prevTop
            return dataInTop
    def peek(self):
        if self.isEmpty():
            # print(" Peek Error. Empty Stack")
            return None
        else:
            return self.top.info

    def empty(self):
        while not self.isEmpty():
            self.pop()
