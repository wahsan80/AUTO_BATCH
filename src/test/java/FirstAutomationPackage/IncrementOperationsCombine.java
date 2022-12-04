package FirstAutomationPackage;

public class IncrementOperationsCombine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1; //i = 1
		int j = i++ + ++i; //j = 1, i = 5
		int k = ++j + j++; //k = 2, j = 5
		int l = k++ + ++k + k++ + i++; // l = 2, k = 3+4+5=12, i = 6
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
