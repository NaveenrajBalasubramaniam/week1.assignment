package week1.day2;

public class MyMobile {

	public static void main(String[] args) {
		MyMobile mobile = new MyMobile();
		mobile.makeCall();
		mobile.sendMsg();
		mobile.payBills();

	}
	public void makeCall() {
		System.out.println("Calling...");
		
	}
	public void sendMsg() {
		System.out.println("Sending Message...");
		
	}
	private void payBills() {
		System.out.println("Paying bill...");
		
	}
}
