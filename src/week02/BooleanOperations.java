package week02;

public class BooleanOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == equality operator
		System.out.println(2 == 2);
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		System.out.println(5 < 5 );
		// && and || or
		// && says both need to be true
		// || says one or the other need to be true
		System.out.println(2 == 2 && 1 < 5);
		// the && is saying that in order for this whole boolean expression to be true, 
		// both sides have to be true
		System.out.println(true && true);
		System.out.println(true && false);
		// both of them are not true so it is false
		System.out.println(true || false);
		// one of them is true so therefore it is true
		System.out.println(false || false);
		System.out.println(2 == 2 || 1 == 5);
		// one of them is true so the whole expression becomes true
		String name = "Sam";
		
		if (name == "Sam") {
			System.out.println("Hello Sam");
		} else {
			System.out.println("You are not Sam");
		}
			int age = 13;
			
			if (age >= 16) {
					System.out.println("You can get your license!");
	} else {
		System.out.println("Please wait " + (16 - age) + " year(s) to get your license.");
		
		
	
	}
			double costOfMilk = 2.5;
			if (costOfMilk <= 2) {
				System.out.println("Buying 2");
				
			} else if (costOfMilk <= 3) {
				System.out.println("Buying 1");
	
			} else {
				System.out.println("Not buying any milk");
			}
			
			char grade = 'D';
			
			switch (grade) {
			case 'A' :
				System.out.println("90%");
				break;
			case 'B' :
				System.out.println("80%");
				break;
			case 'C' :
				System.out.println("70%");
				break;
			
				default:
					System.out.println("0%");
				
			}
			if (5==5) {
				if (4 == 3) {
					System.out.println("5 is 5 and 4 is 4");
					} else {
						System.out.println("5 is 5");
					}
			}
			if ( 5 == 5 && 4 ==4) {
				System.out.println("Yes");
			}
	}
}
