import numpy as np

data1 = np.array([5, 7, 3, 2, 9])

def pencarianTanpaSentinel(data: list, find):
    for i, value in enumerate(data):
        if value == find:
            return i
    return -1    
    

print(pencarianTanpaSentinel(data1, 10))

