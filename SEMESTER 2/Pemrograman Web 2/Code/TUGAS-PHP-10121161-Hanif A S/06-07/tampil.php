<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
</head>

<body>
    <center>
    <h1>Tampil data perwalian</h1>
    <hr>
    <div class="col-sm-8">
        <table class="table table-striped table-bordered">
            <tr>
                <th>No</th>
                <th>Nama Mahasiswa</th>
                <th>Matakuliah</th>
                <th>SKS</th>
                <th>Tahun Akademik</th>
            </tr>

            <?php
            // Koneksi SQL
            $conn = mysqli_connect('localhost', 'root', '', 'if4');
            // SQL QUERY
            $showSql = "SELECT MAHASISWA.NAMA, MATAKULIAH.NAMAMK, MATAKULIAH.SKS, PERWALIAN.TAHUNAKADEMIK FROM MAHASISWA, MATAKULIAH, PERWALIAN WHERE MAHASISWA.NIM = PERWALIAN.NIM AND MATAKULIAH.KODEMK = PERWALIAN.KODEMK";
            $hasilTampil = mysqli_query($conn, $showSql);

            $count = 0;
            while ($listPerwalian = mysqli_fetch_row($hasilTampil)) {
                // Kode Tampil
                list($namaMhs, $matakuliah, $sks, $tahunakademik) = $listPerwalian;
                $count++;
                echo "<tr>
                    <td>$count</td>
                    <td>$namaMhs</td>
                    <td>$matakuliah</td>
                    <td>$sks</td>
                    <td>$tahunakademik</td>
                </tr>";
            }
            ?>
        </table>
        <hr>
    </div>
</body>

</html>