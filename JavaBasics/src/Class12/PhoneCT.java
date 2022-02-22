package Class12;

public class PhoneCT {

	// 1 first declare attributes/fields/properties
	String brandName;
	double storage;
	int price;

	// 2 create 3 objects with specific attributes and behaviors

	void makeCall() {
		System.out.println("Making a call");
	}

	void takePicture() {
		System.out.println("Taking a picture");
	}
	
	void printCompleteInfo() {
		System.out.println("Brand name is "+ brandName);
		System.out.println("The phone storage is "+storage);
		System.out.println("The phone price is "+price);
	}

	public static void main(String[] args) {
		
		PhoneCT iphone=new PhoneCT();
		iphone.brandName="Apple";
		iphone.storage= 4.5;
		iphone.price=700;
		
		iphone.makeCall();
		iphone.takePicture();
		iphone.printCompleteInfo();
		
		PhoneCT pixel=new PhoneCT();
		pixel.brandName="Samsung";
		pixel.storage=7.6;
		pixel.price=500;
		
		pixel.makeCall();
		pixel.takePicture();
		pixel.printCompleteInfo();
		
		
		PhoneCT nokia = new PhoneCT();
		nokia.brandName="Nokia";
		nokia.storage=3.4;
		nokia.price=200;
		
		nokia.makeCall();
		nokia.takePicture();
		nokia.printCompleteInfo();
		
	}

}
