<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Tampil Data Barang</title>
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
</head>

<body>
    <center>
    <h1>Tampil data barang</h1>
    <hr>
    <div class="col-sm-8">
        <table class="table table-striped table-bordered">
            <tr>
                <th>No</th>
                <th>Kode Barang</th>
                <th>Nama Barang</th>
                <th>Harga</th>
                <th>Stok</th>
                <th>Total</th>
            </tr>

            <?php
            // Koneksi SQL
            $conn = mysqli_connect('localhost', 'root', '', 'if4');
            // SQL QUERY
            $showSql = "select * from barang";
            $hasilTampil = mysqli_query($conn, $showSql);

            $totalHarga = 0;
            $count = 0;
            while ($listBarang = mysqli_fetch_row($hasilTampil)) {
                // Kode Tampil
                list($kodebrg, $namabarang, $harga, $stok) = $listBarang;
                $count++;
                $total = $harga * $stok;
                $totalHarga += $total;
                echo "<tr>
                    <td>$count</td>
                    <td>$kodebrg</td>
                    <td>$namabarang</td>
                    <td>$harga</td>
                    <td>$stok</td>
                    <td>$total</td>
                </tr>";
            }
            echo "<tr><td colspan=5>Total Semua Harga Barang</td><td>$totalHarga</td></tr>";
            ?>
        </table>
        <hr>
        <a href="tambah.html" class="btn btn-primary">Tambah Data</a>
    </div>
</body>

</html>