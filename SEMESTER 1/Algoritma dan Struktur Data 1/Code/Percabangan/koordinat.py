x,y = input('Masukan koordinat (x,y) : ').split(',')
x,y = float(x),float(y)

if x > 0 and y > 0:
    sumbu = ' berada di kuadran I'
elif x < 0 and y > 0:
    sumbu = ' berada di kuadran II'
elif x < 0 and y < 0:
    sumbu = ' berada di kuadran III'
elif x > 0 and y < 0:
    sumbu = ' berada di kuadran IV'
elif x == 0 or y == 0:
    if x == 0 and y == 0:
        sumbu = 'berada di titik pusat'
    elif x == 0:
        sumbu = 'berada di sumbu x'
    elif y == 0:
        sumbu = 'berada di sumbu y'
    # sumbu = x == 0 if  else 'berada di sumbu y'

print(f'Koordinat ({x:0.1f},{y:0.1f}) {sumbu}')