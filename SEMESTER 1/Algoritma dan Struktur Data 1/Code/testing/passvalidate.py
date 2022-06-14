password = input()

status_numerik = False
password_length = len(password)

for kar in password:
    
    if kar.isnumeric():
        status_numerik = True
    
valid = status_numerik

if password_length > 8 and valid:
    print("strong")
elif valid:
    print('weak')
else:
    print('invalid')