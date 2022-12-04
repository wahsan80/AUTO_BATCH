package conditional_statement_if_else;

public class Practice_If_Else_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		if (a>b && a>c && a>d){	
			System.out.println(a);
		}
		else if (b<a && b>c && c>d) {
			System.out.println(b);
		}
		else if (c>a && c>b && c>d)
			System.out.println(c);
		else {
			
			System.out.println("This is the greatest: "+d);
		}

	}

}
