PI = 22 / 7

def LuasLingkaran(r):
    return PI * (r ** 2)

def faktorial(n):
    if n > 1:
        return n * faktorial(n-1)
    else:
        return 1

def fibonnaci(n):
    if n <= 1:
        return n
    else:
        return fibonnaci(n-1) + fibonnaci(n-1) 