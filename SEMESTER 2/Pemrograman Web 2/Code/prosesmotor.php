<style>
    .text-right {
        text-align: right;
    }
</style>
<?php

    echo "<center><h1>BANDUNG MOTOR DAN AKSESORIS</h1><hr>";

    $merk = $_POST['merk'];

    echo "<table border=0><tr><td>MERK MOTOR <td>: $merk";
    echo "<tr><td colspan=3><hr>";

    if ($merk == "Honda") {
        $harga          = 15000000;
        $helm           = 350000;
        $jaket        = 250000;
        $sarung_tangan  = 50000;
        $total_harga = $harga + $helm   + $jaket + $sarung_tangan;
    } else if ($merk == "Yamaha") {
        $harga          = 10000000;
        $helm           = 300000;
        $jaket          = 150000;
        $sarung_tangan  = 70000;
        $total_harga = $harga + $helm + $jaket + $sarung_tangan;
    } else if ($merk == "Suzuki") {
        $harga          = 12000000;
        $helm           = 250000;
        $jaket          = 200000;
        $sarung_tangan  = 750000;
        $total_harga = $harga + $helm + $jaket + $sarung_tangan;
    } else if ($merk == "Corsa") {
        $harga          = 750000000;
        $helm           = 5000000;
        $jaket          = 4200000;
        $sarung_tangan  = 550000;
        $total_harga = $harga + $helm + $jaket + $sarung_tangan;
    } else if ($merk == "Tesla") {
        $harga          = 985000000;
        $helm           = 45000000;
        $jaket          = 65000000;
        $sarung_tangan  = 2850000;
        $total_harga = $harga + $helm + $jaket + $sarung_tangan;
    }


    echo "<tr><td>HARGA <td class='text-right'>Rp.<td class='text-right'> $harga";
    echo "<tr><td>HELM <td class='text-right'>Rp.<td class='text-right'> $helm";
    echo "<tr><td>JAKET <td class='text-right'>Rp.<td class='text-right'> $jaket";
    echo "<tr><td>SARUNG TANGAN <td class='text-right'>Rp.<td class='text-right'> $sarung_tangan";
    // 
    echo "<tr><td colspan=3><hr>";
    // 
    echo "<tr><td>TOTAL HARGA <td class='text-right'>Rp.<td class='text-right'> $total_harga";

    echo "</table><hr>"
?>
<a href="jualmotor.html">< Kembali</a>