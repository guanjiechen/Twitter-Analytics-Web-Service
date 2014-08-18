<?php
    $host = 'localhost';
    $dbname = 'twitter_db';
    $username = 'root';
    $password = 'supernova';
    $option = array(PDO::ATTR_PERSISTENT=>true); 
try {
    $conn = new PDO("mysql:host=$host;dbname=$dbname", $username, $password, $option);
    //echo "Connected to $dbname at $host successfully.\n";
} catch (PDOException $pe) {
    die("Could not connect to the database $dbname :" . $pe->getMessage());
}


$place = $_GET["place"];
$stime = $_GET["start_time"];
$etime = $_GET["end_time"];

echo "Supernova, 6965-1152-3612\n";

$sql = "CALL q5('" . $stime . "','" . $etime ."','" . $place . "');";

$q = $conn->query($sql);
$q->setFetchMode(PDO::FETCH_ASSOC);

while ($r = $q->fetch()):
    $response = $r['tweet_id'];
    echo $response . "\n";
endwhile;
