kalimat = input()

upper = 0
lower = 0

for i in kalimat:
 if i != ' ':
    if i.isupper():
        upper += 1
    else:
        lower += 1

print('jumlah upper case:', upper)
print('jumlah lower case:', lower)