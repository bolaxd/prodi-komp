# pendefinisian fungsi
def cetak_bilangan(m, n):
    if n < m:
        for i in range(m, n):
            print(i)

# input
m = input()
n = input()

#casting
m = int(m)
n = int(n)

# pemanggilan fungsi
cetak_bilangan(m, n)