<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1, initial-scale=1.0">
    <title>Bandung Motor</title>
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
    <h1>BANDUNG MOTOR DAN AKSESORIS</h1>
    <table>
        <tr>
            <td colspan=2><hr></td>
        </tr>
        <?php
            $merk                   = $_POST['merk'];
            $harga_motor            = 0;
            $harga_helm             = 0;
            $harga_jaket            = 0;
            $harga_sarung_tangan    = 0;
            
            if ($merk == 'HONDA') {
                $harga_motor += 15000000; 
                if (isset($_POST['helm'])) $harga_helm += 350000;
                if (isset($_POST['jaket'])) $harga_jaket += 250000;
                if (isset($_POST['sarung_tangan'])) $harga_sarung_tangan += 50000;
            } else if ($merk == 'YAMAHA') {
                $harga_motor += 10000000; 
                if (isset($_POST['helm'])) $harga_helm += 300000;
                if (isset($_POST['jaket'])) $harga_jaket += 150000;
                if (isset($_POST['sarung_tangan'])) $harga_sarung_tangan += 70000;
            } else if ($merk == 'SUZUKI') {
                $harga_motor += 12000000; 
                if (isset($_POST['helm'])) $harga_helm += 250000;
                if (isset($_POST['jaket'])) $harga_jaket += 200000;
                if (isset($_POST['sarung_tangan'])) $harga_sarung_tangan += 750000;
            }
        ?>      
        <tr>
            <td>BARANG</td>
            <td class="center">HARGA</td>
        </tr>
        <tr>
            <td><?php echo $merk ?></td>
            <td><?php echo $harga_motor ?></td>
        </tr>
        <?php 
            if($harga_helm) {
                echo "<tr><td>HELM<td class=\"right\"> $harga_helm";
            } 
            if($harga_jaket) {
                echo "<tr><td>JAKET<td class=\"right\"> $harga_jaket";
            } 
            if($harga_sarung_tangan) {
                echo "<tr><td>SARUNG TANGAN<td class=\"right\"> $harga_sarung_tangan";
            } 
        ?>
        <tr>
            <td colspan=2><hr></td>
        </tr>
        <tr>
            <td>TOTAL</td>
            <td><?php echo $harga_motor + $harga_helm + $harga_jaket + $harga_sarung_tangan ?></td>
        </tr>
    </table>
</body>
</html>