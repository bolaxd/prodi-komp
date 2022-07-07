<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Tampil Data Barang</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/bootstrap.min.js"></script>
</head>

<body>
    <center>
        <h1>Tampil data barang</h1>
        <hr>
        <div class="col-sm-8">
            <div class="alert alert-success alert-dismissible fade show" role="alert">
                Data Perwalian Berhasil Ditambahkan!
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
            <table class="table table-striped table-bordered">
                <tr>
                    <th>No</th>
                    <th>Nama Mahasiswa</th>
                    <th>Matakuliah</th>
                    <th>SKS</th>
                    <th>Tahun</th>
                </tr>

                <?php
                $nim = $_POST['nim'];
                $kodemk = $_POST['kodemk'];
                $tahun = $_POST['tahun'];

                // Koneksi SQL
                $conn = mysqli_connect('localhost', 'root', '', 'IF4');

                // SIMPAN
                $saveSQL = "INSERT INTO perwalian VALUES('', '$nim', '$kodemk', '$tahun')";
                mysqli_query($conn, $saveSQL);

                // TAMPIL
                $showSQL = 'SELECT PERWALIAN.ID, MAHASISWA.NAMA, MATAKULIAH.NAMAMK, MATAKULIAH.SKS, PERWALIAN.TAHUNAKADEMIK FROM MAHASISWA, MATAKULIAH, PERWALIAN WHERE MAHASISWA.NIM = PERWALIAN.NIM AND MATAKULIAH.KODEMK = PERWALIAN.KODEMK';

                $hasilTampil = mysqli_query($conn, $showSQL);

                $totalHarga = 0;
                $count = 0;
                while ($listBarang = mysqli_fetch_row($hasilTampil)) {
                    // Kode Tampil
                    list($no, $nama, $matakuliah, $sks, $tahun) = $listBarang;

                    echo "<tr>
                    <td>$no</td>
                    <td>$nama</td>
                    <td>$matakuliah</td>
                    <td>$sks</td>
                    <td>$tahun</td>
                </tr>";
                }
                ?>
            </table>
            <hr>
            <a href="input_perwalian.php" class="btn btn-warning">Kembali</a>
            <p></p>
        </div>
</body>

</html>