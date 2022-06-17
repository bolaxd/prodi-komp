<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Tiket KAI</title>
    <style>
        td.center {
            text-align: center;
        }

        td.right {
            text-align: right;
        }
    </style>
</head>
<body>
    <center>
    <h1>PENJUALAN TIKET KERETA API</h1>
    <table>
        <tr>
            <td colspan=2><hr></td>
        </tr>
        <?php
            $kota_tujuan        = $_POST['tujuan'];
            $kelas              = $_POST['kelas'];
            $jumlah_tiket       = $_POST['jumlah_tiket'];
            $harga_tiket        = 0;
            $total_harga        = 0;
            
            if ($kota_tujuan == 'BANDUNG') {
                if ($kelas == 'EKONOMI')    $harga_tiket = 100000;
                if ($kelas == 'BISNIS')     $harga_tiket = 125000;
                if ($kelas == 'EKSEKUTIF')  $harga_tiket = 150000;

                $total_harga = $harga_tiket * $jumlah_tiket;
            } else if ($kota_tujuan == 'JAKARTA') {
                if ($kelas == 'EKONOMI')    $harga_tiket = 150000;
                if ($kelas == 'BISNIS')     $harga_tiket = 175000;
                if ($kelas == 'EKSEKUTIF')  $harga_tiket = 200000;

                $total_harga = $harga_tiket * $jumlah_tiket;
            } else if ($kota_tujuan == 'CIREBON') {
                if ($kelas == 'EKONOMI')    $harga_tiket = 200000;
                if ($kelas == 'BISNIS')     $harga_tiket = 250000;
                if ($kelas == 'EKSEKUTIF')  $harga_tiket = 300000;

                $total_harga = $harga_tiket * $jumlah_tiket;
            }
        ?>      
        <tr>
            <td>KOTE TUJUAN</td>
            <td><?php echo $kota_tujuan ?></td>
        </tr>
        <tr>
            <td>KELAS</td>
            <td><?php echo $kelas ?></td>
        </tr>
        <tr>
            <td colspan=2> <hr> </td>
        </tr>
        <tr>
            <td>HARGA TIKET</td>
            <td class="right"><?php echo $harga_tiket ?></td>
        </tr>
        <tr>
            <td>JUMLAH</td>
            <td class="right"><?php echo $jumlah_tiket ?></td>
        </tr>
        <tr>
            <td colspan=2> <hr> </td>
        </tr>
        <tr>
            <td>TOTAL HARGA</td>
            <td class="right"><?php echo $total_harga ?></td>
        </tr>
    </table>
</body>
</html>