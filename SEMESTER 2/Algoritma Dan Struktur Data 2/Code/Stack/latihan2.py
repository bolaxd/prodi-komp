from stackLinkedList import stackLinkedList

stack = stackLinkedList()
kalimat = input('Masukan teks : ')

eolOver = False
needCloseEol = False

for huruf in kalimat:
    if huruf == '(' or huruf == '[' or huruf == '{':
        stack.push(huruf)
    elif huruf == ')':
        if stack.peek() == '(':
            stack.pop()
        elif stack.peek() == None:
            print(f"Gakbisa pop juga, '{huruf}' tidak ada yg perlu ditutup??")
            eolOver = huruf
        else:
            print(f"Gakbisa pop, masih ada '{stack.peek()}' yang belum ditutup")
            needCloseEol = huruf
    elif huruf == ']':
        if stack.peek() == '[':
            stack.pop()
        elif stack.peek() == None:
            print(f"Gakbisa pop juga, '{huruf}' tidak ada yg perlu ditutup??")
            eolOver = huruf
        else:
            print(f"Gakbisa pop, masih ada '{stack.peek()}' yang belum ditutup")
            needCloseEol = huruf
    elif huruf == '}':
        if stack.peek() == '{':
            stack.pop()
        elif stack.peek() == None:
            print(f"Gakbisa pop juga, '{huruf}' tidak ada yg perlu ditutup??")
            eolOver = huruf
        else:
            print(f"Gakbisa pop, masih ada '{stack.peek()}' yang belum ditutup")
            needCloseEol = huruf
    else: pass

if stack.isEmpty():
    if eolOver:
        print(f"Error ya, '{eolOver}' gada yg perlu ditutup.")
    elif needCloseEol:
        print(f"Jangan kecepetan masih error, '{needCloseEol}' penutup dari apa?!")
    else:
        print('oke data valid, lanjutkeun')
else:
    print(f"Wah error nih, '{stack.peek()}' masih diluar jangkauan.")