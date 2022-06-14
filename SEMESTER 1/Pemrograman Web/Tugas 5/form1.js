var nama = document.getElementById('nm').value
var jenis_kelamin = document.getElementById('jk').value
var musik = document.getElementById('mk').value
var jalan = document.getElementById('jl').value
var baca = document.getElementById('bc').value
var agama = document.getElementById('ag').value
var asal_sekolah = document.getElementById('as').value
var keterangan = document.getElementById('ket').value


document.getElementById('sub').onclick = () => {

    console.log({
        nama,
    jenis_kelamin,
    musik,
    jalan,
    baca,
    agama,
    asal_sekolah,
    keterangan,
    });
}