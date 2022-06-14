import json, time

from tkinter import *
from tkinter import font, messagebox
from PIL import ImageTk, Image
from src.utils import kocok_dadu

# point1 = None
# point2 = None
# point3 = None
# point4 = None

gameObj = {
    'turn': 'P1',
    'var': {
        'P1': "Player 1",
        'P2': "Player 2",
        'P3': "Player 3",
        'P4': "Player 4"
    },
    'site': {
        'P1': 0,
        'P2': 0,
        'P3': 0,
        'P4': 0
    }
}

def click(btn, lbl, point1, point2, point3, point4, pl1, pl2, pl3, pl4):
    # time.sleep(0.8)
    rans = kocok_dadu()


    result = {
        'text': "Kocok Dadu ",
        'color': ""
    }

    player = gameObj['turn']

    skrng = gameObj['site'][player]
    # print(gameObj)
    # print(player, skrng, gameObj['site'][player])

    gameObj['site'][player] += rans

    if gameObj['site'][player] >= 100:
        messagebox.showinfo('Game berakhir!', f"Game telah dimenangkan oleh {gameObj['var'][player]}")
        root.destroy()

    lbl.config(text=rans)

    pl1.config(text=gameObj['site']['P1'])
    pl2.config(text=gameObj['site']['P2'])
    pl3.config(text=gameObj['site']['P3'])
    pl4.config(text=gameObj['site']['P4'])
    print(gameObj)
    position(point1, point2, point3, point4)

    if player == 'P1':
        result['text'] += 'Player 2'
        result['color'] = 'green'
        gameObj['turn'] = 'P2'
    elif player == 'P2':
        result['text'] += 'Player 3'
        result['color'] = 'gray'
        gameObj['turn'] = 'P3'
    elif player == 'P3':
        result['text'] += 'Player 4'
        result['color'] = 'blue'
        gameObj['turn'] = 'P4'
    elif player == 'P4':
        result['text'] += 'Player 1'
        result['color'] = 'red'
        gameObj['turn'] = 'P1'

    btn.config(bg=result['color'],text=result['text'])

    maju = lbl.cget('text')
    turn = gameObj['turn']


    # gameObj['site'][turn] = maju

    


def players(jumlah, root):
    prop = {
        'padx': {
            2: 110,
            3: 60,
            4: 35
        },
        'color': {
            1: 'red',
            2: 'green',
            3: 'gray',
            4: 'blue'
        }
    }
    widget = {}
    for i in range(1, jumlah + 1):
        mywid = Label(
            root,
            text=f"Player {i}",
            bg=prop['color'][i],
            fg="white",
            font=('Arial', 15)
        ).pack(
            pady=10,
            padx=prop['padx'][jumlah],
            side=LEFT,
            anchor=N
        )
        widget.update({
            i: mywid
        })

    return widget

def dadu(player, root, point1, point2, point3, point4, pl1, pl2, pl3, pl4):
    lbel = ''

    btn = Button(root, text = 'Kocok Dadu Player 1')
    btn.config(command=lambda: click(btn, lbl, point1, point2, point3, point4, pl1, pl2, pl3, pl4), font=('Arial', 15, font.BOLD), fg='white', bg='red')
    btn.pack(
        side=TOP
    )

    lbl = Label(root, text=0)
    lbl.config(font=('Arial', 10, font.BOLD))
    lbl.pack(
        padx=10,
        pady=5,
        side=TOP
    )
    lbel = lbl
    return btn, lbl

def position(point1, point2, point3, point4):
    
    f = open('./src/game_obj.json')
    data = json.loads(f.read())
    coor =  data['map-1']["coordinate"]
    turn = gameObj['turn']
    
    for i in range(len(coor)):
        x1 = coor[i][0] + 2
        x2 = coor[i][0] + 2 + (13 * 1)
        x3 = coor[i][0] + 2 + (13 * 2)
        x4 = coor[i][0] + 2 + (13 * 3)

        y = coor[i][1]

        if gameObj['site']['P1'] == (i + 1) and turn == 'P1':
            # global point1
            # print('Giliran 1', x1, y)
            point1.place_forget()
            point1.place(x=x1, y=y)


        if gameObj['site']['P2'] == (i + 1) and turn == 'P2':
            # global point2
            # print('Giliran 2', x2, y)
            point2.place_forget()
            point2.place(x=x2, y=y)

        if gameObj['site']['P3'] == (i + 1) and turn == 'P3':
            # global point3
            # print('Giliran 3', x3, y)
            point3.place_forget()
            point3.place(x=x3, y=y)

        if gameObj['site']['P4'] == (i + 1) and turn == 'P4':
            # global point4
            # print('Giliran 4', x4, y)
            point4.place_forget()
            point4.place(x=x4, y=y)

    f.close()
    # point1.place(x=10, y=10)
    # return point1, point2, point3, point4
       

root = Tk()
root.geometry("600x850")

# Header 
labl = Label(root, text="Snake Ladder")
labl.config(font=('Arial', 34, font.BOLD))
labl.pack(
    padx=10,
    pady=5,
    side=TOP
)

# Map
img = ImageTk.PhotoImage(Image.open("src/map/map-1.jpg"))
panel = Label(root, image = img)
panel.pack(side = "top")

# Pion
point1 = Label(root, bg='red', text=" ")
point1.config(borderwidth=3)

point2 = Label(root, bg='green', text=" ")
point2.config(borderwidth=3)

point3 = Label(root, bg='gray', text=" ")
point3.config(borderwidth=3)

point4 = Label(root, bg='blue', text=" ")
point4.config(borderwidth=3)

pl1 = Label(root, text=f"{gameObj['site']['P1']}")
pl1.place(x=70, y=810)

pl2 = Label(root, text=f"{gameObj['site']['P1']}")
pl2.place(x=220, y=810)

pl3 = Label(root, text=f"{gameObj['site']['P1']}")
pl3.place(x=370, y=810)

pl4 = Label(root, text=f"{gameObj['site']['P1']}")
pl4.place(x=510, y=810)


# Button Dadu
dadu('P1', root, point1, point2, point3, point4, pl1, pl2, pl3, pl4)

# Title Windows
root.title("Snake Ladder Game By MRHRTZ")






players(4, root)



root.mainloop()