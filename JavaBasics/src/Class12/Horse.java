package Class12;

public class Horse {
	String name;
	String breed;
	int age;
	double weight;

	void run() {
		System.out.println(name + " is running");
	}

	void eat() {
		System.out.println(name + " is eating");
	} void printCompleteInfo() {
    	 System.out.println("name= "+name); 
    	 System.out.println("breed= "+breed); 
    	 System.out.println("age= "+age); 
    	 System.out.println("weight= "+weight);
    
     }
	public static void main(String[] args) {
		Horse lilysHorse = new Horse();
		lilysHorse.name = "spirit";
		lilysHorse.breed = "stallion";
		lilysHorse.age = 25;
		lilysHorse.weight = 400;
		lilysHorse.run();
		lilysHorse.printCompleteInfo();
		
		System.out.println("---------");
		
        Horse mraHorse=new Horse();
        mraHorse.name="Tuzik";
        mraHorse.breed="Mustang";
        mraHorse.age=13;
        mraHorse.weight=400;
        mraHorse.run();
        
	}

}
