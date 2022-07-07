<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Hapus Data Barang</title>
    <link rel="stylesheet" href="./bootstrap.css">
</head>

<body>
    <center>
    <h1>Pencarian hapus data barang</h1>
    <hr>
    <div class="col-sm-4">
        <form action="save_delete_barang.php" method="post">
        <table class="table">
            <?php
            $kodebrg = $_POST['kodebrg'];
            // Koneksi SQL
            $conn = mysqli_connect('localhost', 'root', '', 'IF4');
            // SQL QUERY
            $showSql = "select * from barang where kodebrg='$kodebrg'";
            $hasilTampil = mysqli_query($conn, $showSql);
            // if (!mysqli_fetch_row($hasilTampil)) echo "<div class='alert alert-danger'>Data dengan Kode $kodebrg Tidak ditemukan!</div>";
            while ($listBarang = mysqli_fetch_row($hasilTampil)) {
                // Kode Tampil
                list($kodebrg, $namabarang, $harga, $stok) = $listBarang;
                
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
            }
            ?>
        </table>
        <hr>
        <input class="btn btn-outline-danger" type="submit" value="Hapus">
        <a href="editbarang.html" class="btn btn-outline-warning">Kembali</a>
        </form>
    </div>
</body>

</html>