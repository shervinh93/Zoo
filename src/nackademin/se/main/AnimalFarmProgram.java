package nackademin.se.main;

public class AnimalFarmProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Two lions where born!");
		System.out.println();
		
		Lion lion = new Lion("August");
		Lion lion2 = new Lion("Ben");
		for(int i = 0; i<5; i++)
		{
			lion.poke();
		}
		System.out.println();
		
		lion.play(lion2);
		System.out.println();
		Wolf wolf = new Wolf("Lenart the wolf");
		System.out.println();
		System.out.println("Let's see what the wolf " + wolf.getName() + " can do!");
		wolf.doTricks();
		
		System.out.println();
		
		System.out.println("A Anteater is joing the party!, let's see what she has to say:");
		Anteater anteater = new Anteater("Angela");
		anteater.roar();
		System.out.println();
		System.out.println("I now order you to go find some food, " + anteater.getName());
		anteater.findAnts();
		System.out.println("Whant find some more ants?");
		anteater.findAnts();
		
		System.out.println();
		System.out.println("A horse was born!");
		Horse horse1 = new Horse("Sven");
		Horse horse2 = new Horse("Stina");
		System.out.println("The horses names are " + horse1.getName() + " and " + horse2.getName());
		
		System.out.println("Do you horses want to get out in the field?");
		System.out.println();
		horse1.goOutInTheFields();
		
		System.out.println("do you horses want to play with each other?");
		horse1.play(horse2);
		
		System.out.println();
		
		System.out.println("Apparently the Lion whanted to play with " + horse1.getName() + ":");
		lion.play(horse1);
		
		System.out.println();
		
		System.out.println("Ohh noo, a snake!");
		Rattlesnake rattlesnake = new Rattlesnake("Per the snake");
		rattlesnake.sound();
		rattlesnake.huntPrey();
		rattlesnake.eat();
		
	}

}

