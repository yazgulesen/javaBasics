package com.class11;

public class Greeting {
	void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	void sayHelloManyTimes(String name) {
		for(int i=0;i<3;i++) {
			System.out.println("Bye "+name);
		}
	}
	
	void sayHelloNumberOfTimes(String name, int times) {
		for(int i=0;i<times;i++) {
		System.out.println("hello "+name);
	}
}
	public static void main(String[] args) {

		Greeting greeter = new Greeting();
		greeter.sayHelloNumberOfTimes("Yazgul",3);

	}

}
