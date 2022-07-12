class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def preorder(N):
    print(N.data, end=" ")
    if N.left is not None:
        preorder(N.left)
    if N.right is not None:
        preorder(N.right)

def inorder(N):
    if N.left is not None:
        inorder(N.left)
    print(N.data, end=" ")
    if N.right is not None:
        inorder(N.right)

def postorder(N):
    if N.left is not None:
        postorder(N.left)
    if N.right is not None:
        postorder(N.right)
    print(N.data, end=" ")