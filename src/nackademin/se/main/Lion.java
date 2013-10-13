package nackademin.se.main;

public class Lion extends Animal{
	
	private int pokedTimes = 0;
	
	public Lion(String name)
	{
		predator = true;
		appetiteScale = 8;
		this.name = name;
		sound = "Roaaar";
	}
	
	public void poke()
	{
		if(pokedTimes>3)
		{
			System.out.println("Tooo much, now I attack you! said the lion " + this.getName());
		}
		else
		{
			System.out.println("Don't poke meee, said the lion " + this.getName());
			pokedTimes++;
		}
	}
	
}
