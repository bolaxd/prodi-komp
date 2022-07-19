<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Tampil Data Peminjaman</title>
    <link rel="stylesheet" href="./css/bootstrap.css">
</head>

<body>
    <center>
    <h1>Tampil data Peminjaman</h1>
    <hr>
    <div class="col-sm-8">
        <table class="table table-striped table-bordered">
            <tr>
                <th>NO</th>
                <th>NAMA PEMINJAMAN</th>
                <th>JUDUL BUKU</th>
                <th>PENGARANG</th>
                <th>PENERBIT</th>
                <th>TGL KEMBALI</th>
            </tr>

            <?php
            // Koneksi SQL
            $conn = mysqli_connect('localhost', 'root', '', 'if4');
            // SQL QUERY
            $showSql = "SELECT anggota.NAMA_ANGGOTA, buku.JUDUL, pengarang.NAMA_PENGARANG, penerbit.NAMA_PENERBIT, peminjaman.TGL_KEMBALI FROM anggota, buku, peminjaman, penerbit, pengarang WHERE peminjaman.PEMINJAM = anggota.KODE_ANGGOTA AND peminjaman.KODE_BUKU = buku.KODE_BUKU AND buku.KODE_PENERBIT = penerbit.KODE_PENERBIT AND buku.KODE_PENGARANG = pengarang.KODE_PENGARANG";
            
            $hasilTampil = mysqli_query($conn, $showSql);

            $count = 0;
            while ($listPeminjam = mysqli_fetch_row($hasilTampil)) {
                // Kode Tampil
                list($anggota, $judul, $pengarang, $penerbit, $tgl_kembali) = $listPeminjam;
                $count += 1;
                echo "<tr>
                    <td>$count</td>
                    <td>$anggota</td>
                    <td>$judul</td>
                    <td>$pengarang</td>
                    <td>$penerbit</td>
                    <td>$tgl_kembali</td>
                </tr>";
            }
            ?>
        </table>
        <hr>
    </div>
</body>

</html>