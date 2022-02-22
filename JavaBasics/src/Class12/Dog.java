package Class12;

public class Dog {
	
	//attributes/fields/properties ----how it looks like
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	//behaviors/functions/methods
	void bark() {
		System.out.println("Dog is barking...");
	}
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping...");
	}
	
	

	public static void main(String[] args) {
		//creating an object from Dog class
		Dog scooby=new Dog();
		//Dog is a class
		//scooby is an object
		//=is assigment operator
		//new is a keyword that we use to create the objects of the class
		//Dog()we are calling the constructor of the class
		//
		
		scooby.bark();
		scooby.eat();
		scooby.sleep();

	}

}
