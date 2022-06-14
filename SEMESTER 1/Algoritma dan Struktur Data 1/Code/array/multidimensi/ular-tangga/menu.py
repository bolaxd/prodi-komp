from tkinter import *
from tkinter.font import BOLD
from PIL import ImageTk, Image

def start():
    print('ok')

def left_map():
    pass

def right_map():
    pass

root = Tk()
root.geometry("600x700")


button = Button(root, text='Start Game!')
button.config(command=start, font=('Ink Free', 20, 'bold'), bg='green', borderwidth=5)
button.pack()


button = Button(root, text='<')
button.config(command=left_map, font=('Ink Free', 10), bg='orange', borderwidth=5)
button.pack(padx=30, side=LEFT)

button = Button(root, text='>')
button.config(command=right_map, font=('Ink Free', 10), bg='orange', borderwidth=5)
button.pack(padx=30, side=RIGHT)

map_name = Label(root, text='Green Sanctuary')
map_name.config(font=('Arial', 20, BOLD))
map_name.pack(side = TOP, pady=20)

map_img = ImageTk.PhotoImage((Image.open('src/map/map-1.jpg')).resize((300,300)))
panel = Label(root, image = map_img)
panel.pack(pady=20, side = TOP)

player_label = Label(root, text='Players')
player_label.pack()

select = StringVar(root)
select.set("2") # default value
w = OptionMenu(root, select, "2", "3", "4")
w.pack()

root.mainloop()