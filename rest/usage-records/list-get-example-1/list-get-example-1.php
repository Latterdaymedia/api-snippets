<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "ACed732a3c49700934481addd5ce1659f0"; 
$token = "{{ auth_token }}"; 
$client = new Services_Twilio($sid, $token);

// Loop over the list of records and echo a property for each one
foreach ($client->account->usage_records->last_month as $record) {
    echo $record->count;
}
