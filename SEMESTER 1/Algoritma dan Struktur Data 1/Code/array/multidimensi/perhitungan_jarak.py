import numpy as np
import math

x = np.array([1, 5, 6, 7])
y = np.array([5, 2, 5, 4])

def jarak(x,y):
    hasil = 0
    # silahkan diisi functionnya!
    subtract = x - y
    sum_sq = np.dot(subtract.T, subtract)
    hasil = np.sqrt(sum_sq)
    print('s', subtract, 'T', subtract.T, 'sum', sum_sq)
    return hasil


print("Jarak : ", jarak(x,y)) # 9.5764912225