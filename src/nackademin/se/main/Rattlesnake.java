package nackademin.se.main;

public class Rattlesnake extends Animal {

	public Rattlesnake(String name) {
		
		this.predator = true;
		this.appetiteScale = 2;
		this.sound = "Ssssssss";
		this.name = name;
	
	}

	public void sound() {
		
		System.out.println("Hisssss!");
		
	}
	
	public void huntPrey() {
		
		for (int i = 0; i <= 2; i++) {
			
			System.out.println("The Rattlesnake takes notice of a nearby Mouse");
			System.out.println("The Rattlesnake now makes a hissing noise" + " " + sound + " " + "and takes a leap forward at the helpless Mouse!\n");

			}
	}
	
	public void eat() {
		
		System.out.println("The Rattlesnake happily eats the Mouse.");
		
	}
	
}