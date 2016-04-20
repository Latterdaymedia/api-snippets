// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;
class Example 
{
  static void Main(string[] args) 
  {
    // Find your Account Sid and Auth Token at twilio.com/user/account
    string AccountSid = "AC81e0ca4b0af06b833b6726957613c5d4";
    string AuthToken = "{{ auth_token }}";
    var twilio = new TwilioRestClient(AccountSid, AuthToken);

    var connectApps = twilio.ListConnectApps(null, null);
    
    foreach (var connectApp in connectApps.ConnectApps)
    {
      Console.WriteLine(connectApp.FriendlyName);
    }
  }
}