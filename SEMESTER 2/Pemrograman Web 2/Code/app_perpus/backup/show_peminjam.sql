SELECT 
	anggota.NAMA_ANGGOTA, 
	buku.JUDUL,
    pengarang.NAMA_PENGARANG,
    penerbit.NAMA_PENERBIT,
    peminjaman.TGL_KEMBALI
FROM 
	anggota, buku, peminjaman, penerbit, pengarang
WHERE 
	peminjaman.PEMINJAM = anggota.KODE_ANGGOTA
AND 
	peminjaman.KODE_BUKU = buku.KODE_BUKU
AND 
	buku.KODE_PENERBIT = penerbit.KODE_PENERBIT
AND 
	buku.KODE_PENGARANG = pengarang.KODE_PENGARANG