package automation_using_conditions;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5;
		int sum = 0;
		
		while (i<=5*100) {
			System.out.print(i + " ");
			sum = sum+i;
			i = i + 5;	
		}
		System.out.println();
		System.out.println("Final sum is " + sum);
	}

}
