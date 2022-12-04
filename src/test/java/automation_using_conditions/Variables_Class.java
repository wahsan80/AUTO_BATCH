package automation_using_conditions;

public class Variables_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 23;
		int year = 2000;
		
		if (num % 2 == 0){
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}	
		
		if (year%4 == 0 && year%100 == 0 || year%400 == 0) {
			System.out.println(year + " is a leap year");
		}
			else {
				System.out.println(year + " is not a leap year");
			}
	}

}
