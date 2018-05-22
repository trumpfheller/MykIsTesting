package methods;

 class Person2 {

	    // Instance variables (data or "state")
	    String name;
	    int age;

	    // Classes can contain

	    // 1. Data
	    // 2. Subroutines (methods)
	    
	    void speak() {
	        for(int i=0; i<3; i++) {
	            System.out.println("My name is: " + name + " and I am " + age + " years old ");
	        }
	    }
	    
	    void sayHello() {
	        System.out.println("Hello there!");
	    }
	}

	class SomeOne {

	    public static void main(String[] args) {

	        // Create a Person object using the Person class
	        Person2 person1 = new Person2();
	        person1.name = "Joe Bloggs";
	        person1.age = 37;
	        person1.speak();
	        person1.sayHello();

	        // Create a second Person object
	        Person2 person2 = new Person2();
	        person2.name = "Sarah Smith";
	        person2.age = 20;
	        person2.speak();
	        person1.sayHello();

	        System.out.println(person1.name);

	    }

	}