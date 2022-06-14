kalimat = input('Kalimat : ')
print('-' * 37)
filtered = ''
for i in kalimat:
    huruf = i
    if (huruf == 'a') or (huruf == 'i') or (huruf == 'u') or (huruf == 'e') or (huruf == 'o') \
        or (huruf == 'A') or (huruf == 'I') or (huruf == 'U') or (huruf == 'E') or (huruf == 'O'):
        filtered += huruf

print(f'Huruf vokal ada {len(filtered)} ({filtered})')
