<?php
    $nama = $_POST['pegawai'];
    $golongan = $_POST['golongan'];
    echo "<center><h1>Program Gaji Pegawai</h1><hr>";
    echo "<table border=0><tr><td>Nama lengkap <td>: $nama";
    echo "<tr><td>Golongan <td>: $golongan";

    $transport  = 300000;
    $makan      = 500000;
    $kesehatan  = 400000;
    
    if ($golongan == "I")           $gaji_pokok = 2500000;
    else if ($golongan == "II")     $gaji_pokok = 3000000;
    else if ($golongan == "III")    $gaji_pokok = 3500000;
    else if ($golongan == "IV")     $gaji_pokok = 4000000;
    else $gaji_pokok = 0;

    

    $gaji_total = $gaji_pokok;
    
    echo "<tr><td colspan=2><hr>";

    echo "<tr><td>Gaji Pokok <td>: Rp.$gaji_pokok";
    if (isset($_POST['transport'])) {
        $gaji_total += $transport;
        echo "<tr><td>Transport <td>: Rp.$transport";
    } 
    if (isset($_POST['makan'])) {
        $gaji_total += $makan;
        echo "<tr><td>Makan <td>: Rp.$makan";
    } 
    if (isset($_POST['kesehatan'])) {
        $gaji_total += $kesehatan;
        echo "<tr><td>Kesehatan <td>: Rp.$kesehatan";
    } 
    echo "<tr><td>Gaji Total <td>: Rp.$gaji_total";

?>