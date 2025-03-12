package observer;

import java.util.ArrayList;

public class Mom extends Observer {

	public Mom(ArrayList<Baby> babies) {
		super(babies);
	}

	public void update(Cry cry, Baby baby) {

		if(cry.equals(Cry.ANGRY)){
			System.out.println("\nMom hugs " + baby.getName());
			baby.receiveLove();
		} else if(cry.equals(Cry.HUNGRY)){
			System.out.println("\nMom feeds " + baby.getName());
			baby.eat();
		} else if(cry.equals(Cry.WET)){
			System.out.println("\nMom changes " + baby.getName());
			baby.getChanged();
		}
	}

}
