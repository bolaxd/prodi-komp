from playsound import playsound

def bicara(antrian, loket):
    playsound('nomor_antrian.mp3')
    playsound(str(antrian) + '.mp3')
    playsound('keloket.mp3')
    playsound(str(loket) + '.mp3')

