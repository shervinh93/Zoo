package nackademin.se.main;

public class Horse extends Animal{
	
	public Horse(String name)
	{
		predator = false;
		appetiteScale = 5;
		this.name = name;
		sound = "gnägggg";
	}
	
	public void goOutInTheFields()
	{
		System.out.println("Yayyy, I'm happy <3");
	}

}
