package Class12;

public class DogCT {

	// attributes
	String breed;
	int weight;
	int age;
	String color;

	// behaviors
	void sleep() {
		System.out.println("dog is sleeping");
	}

	void eat() {
		System.out.println("dog is eating");
	}

	void play() {
		System.out.println("dog likes playing");
	}
     void printCompleteInfo() {
    	 System.out.println("breed name is "+breed);
    	 System.out.println(" age is "+age);
    	 System.out.println(" weight is "+weight+" lb");
    	 System.out.println(" color is "+color);
     }

	public static void main(String[] args) {

		// 3 different objects from DogCT class
		
		DogCT dog1=new DogCT();
		dog1.breed="Husky";
		dog1.weight=45;
		dog1.age=5;
		dog1.color="white";
		dog1.printCompleteInfo();
		dog1.play();
		
		System.out.println("-------");
		DogCT dog2=new DogCT();
		dog2.breed="Bulldog";
		dog2.weight=80;
		dog2.age=9;
		dog2.color="brown";
		dog2.printCompleteInfo();
		dog2.eat();
		System.out.println("-------");
		DogCT dog3=new DogCT();
		dog3.breed="labrador";
		dog3.weight=60;
		dog3.age=3;
		dog3.color="yellow";
		dog3.printCompleteInfo();
		dog3.sleep();
		
		
		

	}

}
