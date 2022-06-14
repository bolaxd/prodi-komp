import my_module

PHI = my_module.PI
L = my_module.LuasLingkaran(10)
F = my_module.faktorial(5)
FN = my_module.fibonnaci

print(PHI, L, F)

for i in range(0, 11):
    print(FN(i), end=' ')