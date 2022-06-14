data = [["Adi", 80], ["Budi",85], ["Cecep", 58], ["Dede",85], ["Encep",68]]
print('data awal : {0}'.format(data))
data.sort(key=lambda x: x[1], reverse=True)
listMax = max([value[1] for value in data])
for name in data:
    if name[1] == listMax:
        print('Nama dari nilai paling besar : {0}'.format(name[0]))

