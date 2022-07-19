<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Tambah Data Peminjam</title>
    <link rel="stylesheet" href="./css/bootstrap.css">
</head>

<body>
    <center>
        <h1>Tambah data Peminjam</h1>
        <hr>
        <div class="col-sm-4">
            <form action="tambahpeminjam.simpan.php" method="post">
                <table class="table">
                    <tr>
                        <td>
                            Peminjam
                        </td>
                        <td>
                            <input type="text" class="form-control" name="peminjam" maxlength="4">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Kode Buku
                        </td>
                        <td>
                            <input type="text" class="form-control" name="kodebuku" maxlength="5">
                        </td>
                    </tr>
                        <?php
                        $currentDate = date('Y-m-d');
                        ?>
                    <tr>
                        <td>
                            Tanggal Pinjam
                        </td>
                        <td>
                            <?php echo "<input class='form-control' type='date' name='tgl_pinjam' id='datePicker' value='$currentDate'>"; ?>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Tanggal Kembali
                        </td>
                        <td>
                            <?php echo "<input class='form-control' type='date' name='tgl_kembali' id='datePicker' value='$currentDate'>"; ?>
                        </td>
                    </tr>
                </table>
                <hr>
                <input type="submit" class="btn btn-outline-success" value="Simpan">
                <input type="Reset" class="btn btn-outline-danger" value="Reset">
            </form>
        </div>
</body>

</html>