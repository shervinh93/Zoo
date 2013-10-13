package nackademin.se.main;

public class Wolf extends Animal {
	
	private String color = "Gray";
	private boolean rabbitConsumed = false;

	public Wolf(String name)
	{
		predator = true;
		appetiteScale = 4;
		sound = "AAOOOUUUUUUUUU...!";
		System.out.println("I'm a "+color+" wolf!");
		this.name = name;
	}
	
	public void giveRabbit(){
		rabbitConsumed = true;
		System.out.println("Mmmmm tasty!");
	}
	
	public void doTricks(){
		if (rabbitConsumed = true){
			System.out.println("Look! I can stand on my feet! *happy*");
		}
		else {
			System.out.println("GRR! Get lost i don't do tricks.");
		}
	}
	
	
}