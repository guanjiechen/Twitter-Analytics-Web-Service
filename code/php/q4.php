<?php
    $host = 'localhost';
    $dbname = 'twitter_db';
    $username = 'root';
    $password = 'supernova';
    $option = array(PDO::ATTR_PERSISTENT=>true);

try {
    $conn = new PDO("mysql:host=$host;dbname=$dbname;charset=utf8", $username, $password, $option);
    //echo "Connected to $dbname at $host successfully.\n";
} catch (PDOException $pe) {
    die("Could not connect to the database $dbname :" . $pe->getMessage());
}

$time = $_GET["time"];

echo "Supernova, 6965-1152-3612\n";

$sql = "CALL q4('" . $time . "')";
$q = $conn->query($sql);
$q->setFetchMode(PDO::FETCH_ASSOC);

if ($r = $q->fetch()){
    $response = substr($r['tweet_text'], 0, -1);
    $tweets = preg_split("/;/", $response);
    foreach ($tweets as $id) {
        echo urldecode($id) . "\n";
    }
