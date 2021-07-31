package activities;

public class Activity1 {
	
	

	public static void main(String[] args) {
		
		Car toyata = new Car();

		toyata.make = 2014;
		toyata.doors = 2;
		toyata.color = "Black";
		toyata.transmission = "Manual";
		toyata.displayCharacteristics();
		toyata.accelerate();
		toyata.brake();


	}

}
