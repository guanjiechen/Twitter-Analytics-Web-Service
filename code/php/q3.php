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

$user_id = $_GET["userid"];

echo "Supernova,  6965-1152-3612\n";

$sql = "CALL q3(" . $user_id . ");";

$q = $conn->query($sql);
$q->setFetchMode(PDO::FETCH_ASSOC);

if ($r = $q->fetch()){
    $response = substr($r['retweet'], 0, -1);
    $retweets = preg_split("/,/", $response);
    foreach ($retweets as $id) {
        echo $id . "\n";
    }
}
