<?php
    $nama = $_POST['pegawai'];
    $golongan = $_POST['golongan'];
    echo "<center><h1>Program Gaji Pegawai</h1><hr>";
    echo "<table border=0><tr><td>Nama lengkap <td>: $nama";
    echo "<tr><td>Golongan <td>: $golongan";

    $transport = 300000;
    $makan = 500000;
    $kesehatan = 400000;
    
    if ($golongan == "I") $gaji_pokok = 2500000;
    else if ($golongan == "II") $gaji_pokok = 3000000;
    else if ($golongan == "III") $gaji_pokok = 3500000;
    else if ($golongan == "IV") $gaji_pokok = 4000000;
    else if ($golongan == "V") $gaji_pokok = 100000000;
    else $gaji_pokok = 0;

    $gaji_total = $transport + $makan + $kesehatan +  $gaji_pokok;
    
    echo "<tr><td colspan=2><hr>";

    echo "<tr><td>Gaji Pokok <td style='text-align: right;'> Rp.$gaji_pokok";
    echo "<tr><td>Transport <td style='text-align: right;'> Rp.$transport";
    echo "<tr><td>Makan <td style='text-align: right;'> Rp.$makan";
    echo "<tr><td>Kesehatan <td style='text-align: right;'> Rp.$kesehatan";
    echo "<tr><td>Gaji Total <td style='text-align: right;'> Rp.$gaji_total";

?>