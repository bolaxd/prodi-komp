from playsound import playsound

dir = './audio antrian/'
def bicara(antrian, loket):
    playsound(dir + 'nomor_antrian.mp3')
    playsound(dir + str(antrian) + '.mp3')
    playsound(dir + 'keloket.mp3')
    playsound(dir + str(loket) + '.mp3')

