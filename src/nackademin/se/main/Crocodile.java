package nackademin.se.main;

public class Crocodile extends Animal{
	
	public Crocodile(){
		this.predator = true;
		this.appetiteScale = 5;
		this.sound = "grunt...";
		this.name = "Rex";
	}
	
	public void Hunt(){
		System.out.println("The " + this.getClass().getName() + " descends into the pool of water and starts the hunt!");
	}
}

