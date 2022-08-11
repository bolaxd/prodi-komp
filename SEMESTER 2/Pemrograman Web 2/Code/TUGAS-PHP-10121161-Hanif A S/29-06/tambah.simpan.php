<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Tambah Data Barang</title>
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
</head>
<?php
// Koneksi
$conn = mysqli_connect('localhost', 'root', '', 'if4');

$kodebrg = $_POST['kodebrg'];
$namabarang = $_POST['namabarang'];
$harga = $_POST['harga'];
$stok = $_POST['stok'];

$sqlTambah = "INSERT INTO barang VALUES('$kodebrg', '$namabarang', '$harga', '$stok')";
$hasilTambah = mysqli_query($conn, $sqlTambah);
?>
<body>
    <center>
        <h1>Tambah data barang</h1>
        <hr>
        <div class="col-sm-4">
            <form action="tambah.simpan.php" method="post">
                <table class="table table-bordered">
                    <tr>
                        <td>
                            Kode Barang
                        </td>
                        <td>
                            <input type="text" class="form-control" name="kodebrg" maxlength="6" disabled value="<?php echo $kodebrg ?>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Nama Barang
                        </td>
                        <td>
                            <input type="text" class="form-control" name="namabarang" maxlength="25" disabled value="<?php echo $namabarang ?>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            harga
                        </td>
                        <td>
                            <input type="number" class="form-control" name="harga" disabled value="<?php echo $harga ?>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            stok
                        </td>
                        <td>
                            <input type="number" class="form-control" name="stok" disabled value="<?php echo $stok ?>">
                        </td>
                    </tr>
                </table>
                <hr>
                <div class="alert alert-success">Penambahan data berhasil!</div>
                <a href="tampil.php" class="btn btn-primary">Tampil Data</a>
                <a href="tambah.html" class="btn btn-warning">Kembali</a>
            </form>
        </div>
</body>

</html>