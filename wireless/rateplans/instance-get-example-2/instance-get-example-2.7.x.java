// Download the **Next-Gen** twilio-java library from:
// twilio.com/docs/libraries/java#installation-nextgen
import com.twilio.Twilio;
import com.twilio.rest.preview.wireless.RatePlan;

public class Example {

  // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    RatePlan plan = RatePlan.fetcher("us-automotive")
      .fetch();
    
    System.out.println(plan.getSid());
    System.out.println(plan.getAlias());
  }
}