# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "AC228ba32a3c49700934481addd5ce1659"
auth_token  = "{{ auth_token }}"
client = TwilioRestClient(account_sid, auth_token)

caller_id = client.caller_ids.update("PNe536d32a3c49700934481addd5ce1659", friendly_name="My Second Line")
print caller_id.phone_number
