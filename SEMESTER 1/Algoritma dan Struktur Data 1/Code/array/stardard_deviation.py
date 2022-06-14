import numpy as np

def my_sum(data):
    result = 0
    for i in data:
        result += i
    
    return result
# --

def my_std(data):
    result  = 0
    obj = {
        'sampel': [],
        'y': [],
        'y2': []
    }
    for i in range(1, len(data) + 1):
        obj['sampel'].append(i)
        obj['y'].append(data[i - 1])
        obj['y2'].append(data[i - 1] ** 2)
    
    y = my_sum(obj['y'])
    y2 = my_sum(obj['y2'])
    jumlah = len(obj['sampel'])

    b = (y ** 2) / jumlah

    result  = (y2 - b) / (jumlah - 1)
    
    return result
# --

data = np.array([84, 86, 89, 92, 82, 86, 89, 92, 80, 86, 87, 90])
print("Data : ", data)
print("Standar Deviasi : ", my_std(data)," -- ", np.std(data))
