<link rel="stylesheet" href="./bootstrap.min.css">
<center>
<h1>EDIT DATA BARANG</h1>
<hr>
<div class="col col-sm-5">
<table class="table">
<?php
// KONEKSI
$conn = mysqli_connect('localhost', 'root', '', 'IF4');
// INPUT
$kodebrg = $_POST['kodebrg'];
$namabarang = $_POST['namabarang'];
$harga = $_POST['harga'];
$stok = $_POST['stok'];

$sqlAdd = "UPDATE barang SET namabarang='$namabarang', harga='$harga', stok='$stok' WHERE kodebrg='$kodebrg'";
$hasilAdd = mysqli_query($conn, $sqlAdd);
echo "<div class='alert alert-success'>Data telah berubah</div>";
// TAMPIL
echo "<tr>
        <td>KODE BARANG</td>
        <td><input readonly class='form-control' type='text' name='kodebrg' value='$kodebrg'></td>
    </tr>
        <tr>
        <td>NAMA BARANG</td>
        <td><input readonly class='form-control' type='text' name='namabarang' value='$namabarang'></td>
    </tr>
    <tr>
        <td>HARGA</td>
        <td><input readonly class='form-control' type='text' name='harga' value='$harga'></td>
    </tr>
    <tr>
        <td>STOK</td>
        <td><input readonly class='form-control' type='text' name='stok' value='$stok'></td>
    </tr>
</tr>";
?>
</table>
<hr>
<a class="btn btn-outline-warning" href="editbarang.html">Kembali</a>
</div>
