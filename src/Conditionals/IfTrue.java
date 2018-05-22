package Conditionals;

public class IfTrue {

	public static void main(String[] args) {
		if(true) {
			System.out.println("Hello");
			
		}
		System.out.println("Goodbye");
		
		boolean sayHello = true;
		if(sayHello) {
			System.out.println("Hello");
			
		}
		boolean sayHelo = false;
		boolean sayHey = false;
		if(sayHelo) {
			System.out.println("Hello");
		} else if (sayHey) {
			System.out.println("Hey");
		}else {
			System.out.println("Goodbye");
		}
		
	}	

}
