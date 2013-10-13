package nackademin.se.main;

public class Animal {
	protected boolean predator;
	protected int appetiteScale;
	protected String name;
	protected String sound;

	
	public void eat() {
		for(int i = 0; i<appetiteScale;i++) {
			System.out.println(this.getClass().getSimpleName()+" " +name+" äter mat, nom nom!");
		}
	}
	public String getName() {
		return name;
	}
	public void roar() {
		System.out.println(sound);
	}
	public void sleep() {
		System.out.println(name+ " the " + this.getClass().getSimpleName()+" took a nap!");
	}
	public boolean isPredator() {
		return predator;
	}
	public void play(Animal a)
	{
		System.out.println(this.getName() + " of the type " + this.getClass().getSimpleName() + " plays with " + a.getName() + " of the type " + a.getClass().getSimpleName());
		if(a.isPredator() && this.isPredator())
		{
			System.out.println("-dangerous game they're playing, hope no one gets hurt!");
		}else if (a.isPredator() && !(this.isPredator())){
			System.out.println("The " + a.getClass().getSimpleName() + " will eat the " + this.getClass().getSimpleName() + " 'cause that's the way he plays it");
		}else if (!(a.isPredator()) && this.isPredator()){
			System.out.println("The " + this.getClass().getSimpleName() + " will eat the " + a.getClass().getSimpleName() + " 'cause that's the way he plays it");
		}else{
			System.out.println("Such a cute game ther're playing");
		}
	}
	
}