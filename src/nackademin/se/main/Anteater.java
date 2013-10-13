package nackademin.se.main;

public class Anteater extends Animal{

	private boolean isFullUp = false;

	public Anteater(String name)
	{
		predator = false;
		appetiteScale = 1;
		this.name = name;
		sound = "*silense*";
	}

	public void findAnts()
	{
		if(!isFullUp)
		{
			System.out.println("Argh, so now I need to walk all the way to the tree over there");
			isFullUp = true;
		}
		else
		{
			System.out.println("I'm full up!!!");
		}
	}

}
