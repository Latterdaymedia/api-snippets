// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = 'AC3094732a3c49700934481addd5ce1659';
var authToken = "{{ auth_token }}";
var client = require('twilio')(accountSid, authToken);

client.sms.messages.create({
    body: "All in the game, yo",
    to: "+14108675309",
    from: "+15005550006"
}, function(err, sms) {
    process.stdout.write(sms.sid);
});