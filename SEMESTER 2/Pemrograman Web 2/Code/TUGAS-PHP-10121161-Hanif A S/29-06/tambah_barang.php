<link rel="stylesheet" href="../assets/css/bootstrap.min.css">
<center>
<h1>MENAMPILKAN DATA BARANG</h1>
<hr>
<div class="col col-sm-5">
<table class="table table-striped">
<thead class="table-light"><tr><th>NO</th><th>KODE BARANG</th><th>NAMA BARANG</th><th>HARGA</th><th>STOK</th><th>TOTAL</th></tr></thead>
<?php
// KONEKSI
$conn = mysqli_connect('localhost', 'root', '', 'IF4');
// INPUT
$kodebrg = $_POST['kodebrg'];
$namabarang = $_POST['namabarang'];
$harga = $_POST['harga'];
$stok = $_POST['stok'];

$sqlAdd = "INSERT INTO barang values('$kodebrg', '$namabarang', '$harga', '$stok')";
$hasilAdd = mysqli_query($conn, $sqlAdd);
echo "<div class='alert alert-success'>Data telah disimpan</div>";
// TAMPIL
$sql = "select * from barang";
$hasil = mysqli_query($conn, $sql);
$row = mysqli_fetch_row($hasil);

$n = 1;
$totalHarga = 0;
echo "";
do {
    list($kodebrg, $namabarang, $harga, $stok) = $row;
    $total = $harga * $stok;
    $totalHarga += $total;
    echo "<tr><td>$n</td><td>$kodebrg</td><td>$namabarang</td><td>$harga</td><td>$stok</td><td>$total</td></tr>";
    $n++;
}
while ($row=mysqli_fetch_row($hasil));
echo "<tr><td colspan=5>Total Seluruh Harga</td><td>$totalHarga</td></tr>";
?>
</table>
<hr>
<a class="btn btn-outline-success" href="tambah.html">Kembali</a>
</div>
