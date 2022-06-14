from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def utama():
    return {"Hello" : "World"}

@app.get("/komentar/{komentar_id}")
def baca_komentar(komentar_id: int):
    return {"Komentar": komentar_id}