
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = returnFive(); 
		System.out.println(x);  
		
		int result = square(5);
		System.out.println("5 Square is " + result);  
		/* not working because duplicate 
		int result = square(x);
		System.out.println("5 Square is " + result);  
		*/
		System.out.println(square (returnFive())); 
		sayHelloWorld();
		sayHelloTo ("Charlie");
	}
	
	static int square(int x) {
		return x * x;
	}
	static int returnFive() {
		return 5;
	}
	static void sayHelloWorld () {
		System.out.println("Hello World.");  
	}
	
	static void sayHelloTo (String name) {
		System.out.println("Hello, " + name);  
	}
	
	
}
