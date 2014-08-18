<?php
/**
 * Created by PhpStorm.
 * User: Zhang
 * Date: 4/20/14
 * Time: 8:06 PM
 */
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

$min_user_id = $_GET["userid_min"];
$max_user_id = $_GET["userid_max"];


echo "Supernova, 6965-1152-3612\n";

$minnum = "SELECT added_num FROM tweets_q6_added WHERE user_id =" . $min_user_id;
$maxnum = "SELECT added_num FROM tweets_q6_added WHERE user_id =" . $max_user_id;
$onemore = "SELECT num FROM tweets_q6 WHERE user_id =" . $min_user_id;

$smaller = $conn->query($minnum);
$smaller->setFetchMode(PDO::FETCH_ASSOC);

$larger = $conn->query($maxnum);
$larger->setFetchMode(PDO::FETCH_ASSOC);

$plusone = $conn->query($onemore);
$plusone->setFetchMode(PDO::FETCH_ASSOC);
$first = 0;
$second = 0;
$third = 0;
if ($largernum = $larger->fetch()) {
    $first = (int)$largernum['added_num'];
}

if ($smallernum = $smaller->fetch()) {
    $second = (int)$smallernum['added_num'];
}

if ($onemorenum = $plusone->fetch()) {
    $third = (int)$onemorenum ['num']; 
}

$result = $first - $second + $third;
echo $result . "\n";
