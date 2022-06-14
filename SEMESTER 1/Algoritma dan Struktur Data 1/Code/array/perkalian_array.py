import numpy as np

def my_multiply(data,pengkali):
# silahkan isi functionnya
# program utama
    result = []
    for i in data:
        result.append(i * pengkali)

    return result

data = np.array([12, 45, 23, 12, 22])
print("Data : ", data)
print("Data * 3: ", my_multiply(data,3))