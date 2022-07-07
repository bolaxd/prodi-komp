<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>INPUT PERWALIAN</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<?php
// Koneksi SQL
$conn = mysqli_connect('localhost', 'root', '', 'IF4');
?>

<body>
    <center>
    <h1>INPUT DATA PERWALIAN</h1>
    <hr>
    <div class="col-sm-4">
        <form action="input_perwalian_save.php" method="POST">
            <table class="table">
                <tr>
                    <td><label for="nim">NAMA SISWA</td>
                    <td>
                        <select class="form-select" name="nim" id="nim">
                            <?php
                            // SQL QUERY
                            $showSql = "select NIM, NAMA from mahasiswa";
                            $hasilTampil = mysqli_query($conn, $showSql);

                            while ($mhs = mysqli_fetch_row($hasilTampil)) {
                                // Kode Tampil
                                list($nim, $nama) = $mhs;
                                echo "<option value='$nim'>$nama</option>";
                            }
                            ?>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><label for="kodemk">MATAKULIAH</td>
                    <td>
                        <select class="form-select" name="kodemk" id="kodemk">
                            <?php
                            // SQL QUERY
                            $showSql = "select KODEMK, NAMAMK from matakuliah";
                            $hasilTampil = mysqli_query($conn, $showSql);

                            while ($mhs = mysqli_fetch_row($hasilTampil)) {
                                // Kode Tampil
                                list($kode, $nama) = $mhs;
                                echo "<option value='$kode'>$nama</option>";
                            }
                            ?>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><label for="tahun">TAHUN</td>
                    <td>
                        <select class="form-select" name="tahun" id="tahun">
                            <option value="10181">10181</option>
                            <option value="10181">10182</option>
                            <option value="10181">10191</option>
                            <option value="10181">10192</option>
                        </select>
                    </td>
                </tr>
            </table>
            <hr>
            <input class="btn btn-success" type="submit" value="Simpan">
            <input class="btn btn-danger" type="reset" value="Reset">
        </form>
    </div>

</body>

</html>