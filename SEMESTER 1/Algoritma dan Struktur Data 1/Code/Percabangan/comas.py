# perulangan untuk input 20 baris
for i in range(1, 21):
    # input dan kesting
    bilangan = float(input())
    # cabang jng output
    if i % 2 == 1:
        print('{:.3f}'.format(bilangan))
    else:
        print('{:.10f}'.format(bilangan))