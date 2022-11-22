package week1.day1;

public class Mobile {
	
	public void makeCall () {
		System.out.println("Make a phone call");
	}

	public void sendMsg () {
		System.out.println( "Send a phone message");
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile ();
		obj.makeCall();
		obj.sendMsg();
	}
}
