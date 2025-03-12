package observer;

import java.util.ArrayList;
import java.util.Random;

public abstract class Observer {
	protected Random rand;

	public Observer(ArrayList<Baby> babies) {
		rand = new Random();

		for(Baby baby : babies){
			baby.registerObserver(this);
		}
	}


	public abstract void update(Cry cry, Baby baby);
}
