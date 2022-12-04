package FirstAutomationPackage;

public class Increment_Decrement_Combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1; // 1
		int j = ++i - --i; // j = 1+1=2, i=2, 
		int k = j-- - --i + i-- - --j;
		int l = --k - k-- + i-- - --i + j++ - --j;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
