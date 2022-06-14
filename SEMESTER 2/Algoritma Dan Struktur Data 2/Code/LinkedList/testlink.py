from linkedlist import LinkedList

list1 = LinkedList()
list1.addFirst(4)
list1.addLast(2)
list1.addLast(7)
list1.addLast(5)

list1.display()
search = list1.search(7)
print("Search:", search)
