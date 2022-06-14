def removeArticle(judul):
    # 1. Split judul
    judulPisah = judul.split()

    # 2. Buat daftar ulang tanpa article "The", "A", "An"
    kataArticle = ['the', 'a', 'an']
    daftarJudulTanpaArticle = [kata for kata in judulPisah if kata.lower() not in kataArticle]

    # 3. Susun ulang kata tanpa article 
    judulTersusun = ' '.join(daftarJudulTanpaArticle)
    
    # 4. Returnkan langkah 3 
    return judulTersusun 

def urutkanJudulFilm(data):
    return sorted(data, key=removeArticle)

data = ["An American Crime", "The Shawshank Redeption", 
        "A Beautiful Mind", "Swallow", "The Crown",
        "American Beauty", "Pacific Rim"]

print('Data Sebelum diurutkan :\n', data)
data = urutkanJudulFilm(data)
print('Data Sebelum diurutkan :\n', data)
