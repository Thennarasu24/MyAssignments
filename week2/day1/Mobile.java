package week2.day1;

public class Mobile {

	public String sendSMS(String sms) {
		System.out.println("SMS is sending " +sms);
		return sms;
	}
	
	protected boolean allowVoiceCall(boolean var) {
		System.out.println("Voice call is allowed");
		return var;
	}
	
	private void takeVideo() {
		System.out.println("Video is recording");
	}
}
