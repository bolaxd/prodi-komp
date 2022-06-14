# input
x = input()
y = input()

# casting tipe data
x1 = int(x)
y1 = int(y)

# output
if ((x1 // y1) and (x1 % y1)) and ((x1 % y1) != 0):
    print(True)
else:
    print(False)