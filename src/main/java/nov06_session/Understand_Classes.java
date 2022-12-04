package nov06_session;

public class Understand_Classes {

	public static void main(String[] args) {
		//Collection of similar objects/Attributes. Humans, Animals, Vehicles, Birds, 
		//Objects will define certain behaviors. 
		//Google for some class and object understanding. 
		//Understand public, static and non static.
		//Main is execution engine of Java class.
		//Ctrl+Shift+f - For Code Alignment.
		//Static is the concept of the class.
		//Non-static is the concept of the object.
		//Important to understand. static / non-static
		//Object will occupy memory. Objects consists of Identity, name, State/Attribute, color, breed,age, 
		//Use object reference to call the method (behavior)
		//
		
		Method1(); //Direct calling methods
		Method2();
		Method3();
		Method4();
		
		Understand_Classes.Method5(); //Calling Using Class for static methods
		Understand_Classes.Method6();
		Understand_Classes.Method7();
		
		Understand_Classes ObjectRef = new Understand_Classes(); 
		//Understand_Classes=Declaration, ObjectRef= =Instantitiation, new Understand_Classes=Initialization
		//Understand_Classess is a class, Object is a reference to Object, New is a keyword, 
		//new Understand_classes is the object
		
		ObjectRef.Method8(); // Calling using object for non-static methods
		ObjectRef.Method9();
		ObjectRef.Method10();

	}
	
	public static void Method1() {	
		System.out.println("Method 1");
	}
	public static void Method2() {	
		System.out.println("Method 2");
	}
	public static void Method3() {	
		System.out.println("Method 3");
	}
	public static void Method4() {	
		System.out.println("Method 4");
	}
	public static void Method5() {	
		System.out.println("Method 5");
	}
	public static void Method6() {	
		System.out.println("Method 6");
	}
	public static void Method7() {	
		System.out.println("Method 7");
	}
	public void Method8() {	//non-static
		System.out.println("Method 8");
	}
	public void Method9() {	//non-static
		System.out.println("Method 9");
	}
	public void Method10() {//non-static	
		System.out.println("Method 10");
	}

}
