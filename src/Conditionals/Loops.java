package Conditionals;

public class Loops {

	public static void main(String[] args) {
		//whileLoop ();
		//doWhileLoop (); 
		//forLoop (); 
	}
	
	static void whileLoop () {
				int counter = 10;
				while (counter < 10) {
					counter = counter +1;
					System.out.println(counter);
				}
		}
	static void doWhileLoop () {
					int counter = 10;
					do{
						counter = counter +1;
						System.out.println(counter);
					} while (counter < 10);
		}
					/*
					 * you evaluate the condition while (true) +> it tells you if you should do the loop again
					 * 
					 * in the doWhileLoop , if you set the counter to 10 and not to 0, it will still give you 11
					 * because the code will go through one time even tho the condition is not correct.
					 * condition is not tested unless the loop runs once
					 * do while you don't see very often
					 */
					static void forLoop () {
						for (int counter =0; counter <10; counter++) {
							System.out.println(counter);
						}
					
					
	}
}

