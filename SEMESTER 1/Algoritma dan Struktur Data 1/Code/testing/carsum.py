length_data = input()
car_data = {}

for i in range(int(length_data)):
    merk, car_total = input('').split()
    if merk not in car_data:
        car_data[merk] = int(car_total)  
    else:
        car_data[merk] += int(car_total)
    
for i in car_data:
    print(f'Total {i} : {car_data[i]}')