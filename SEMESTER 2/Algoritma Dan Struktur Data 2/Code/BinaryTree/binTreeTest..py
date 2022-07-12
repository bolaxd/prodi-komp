from binaryTree import *

A = Node("A")
B = Node("B")
C = Node("C")
D = Node("D")
E = Node("E")
F = Node("F")
G = Node("G")
H = Node("H")
I = Node("I")

A.left = B
B.left = D
B.right= C
C.left = F
D.right= E
E.left = I
F.right= G
G.right= H

print('PREORDER  : ', end='')
preorder(A)
print()

print('INORDER   : ', end='')
inorder(A)
print()

print('POSTORDER : ', end='')
postorder(A)
print()


