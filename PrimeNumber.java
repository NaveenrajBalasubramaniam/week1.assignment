package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int value =13;
		boolean flag = false;
		for (int i =2;i<=value/2; i++) {
			int reminder = value%i;
			
			if(reminder == 0) {
				flag = true;
				
			}
			break;
			
			
			
		}
		if(flag) {
			System.out.println("Not a Prime");
		}
		else {
			System.out.println(value+" is a Prime Number");
		}
	}

}
