<?php
    $barang = $_POST['barang'];
    echo "<tr><td>Nama Barang <td>: $barang";

    $handsfree = $_POST['handsfree'];
    $powerbank = $_POST['powerbank'];
    $casing = $_POST['casing'];

    if (isset($_POST['handsfree'])) echo "<tr><td>Handsfree";
    // echo "<tr><td>Tambahan <td>: $handsfree";
    // echo "<tr><td>Handsfree";
    // echo "<tr><td>Handsfree";

    if ($handsfree) {
        echo "<tr><td>Handsfree";
    }

    if ($powerbank) {
        echo "<tr><td>PowerBank";
    }

    if ($casing) {
        echo "<tr><td>Casing";
    }
?>