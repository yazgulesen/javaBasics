package com.syntax.javaclass005;

public class SwitchDemo2 {

	public static void main(String[] args) {

		char choice='d';
		String answer;
		switch (choice) {
		case'y':
			answer="Yes";
			break;
		case 'n':
			answer="no";
			break;
		case 'm':
		answer="maybe";
		break;
		default:
			answer="I don't know";
			break;
		
	}System.out.println(answer);

	// declare a variable to store a car
	//based on the value define the country of origin
	String car="BMW";
	String country;
	
	switch (car.toLowerCase()) {
	case "bmw":
		country="Germany";
		break;
	case "ford":
		country="USA";
		break;
	case"lada":
	country="Russion";
	break;
	case"tayota":
		country="Japan";
		break;
		default:
			country="Unknown";
		
	}System.out.println(car+" is from "+country);
	
	
	String country1="France";
	String language=null;
	switch(country1.toLowerCase()) {
	case"Turkmenistan":
		language="Turkmen";
		break;
	case "France":
		language="French";
		break;
		default:
		language="not known";
	}System.out.println(country1+" speak "+ language);
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}
}