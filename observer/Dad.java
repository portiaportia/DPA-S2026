package observer;

import java.util.ArrayList;

public class Dad extends Observer {
	
	public Dad(ArrayList<Baby> babies) {
		super(babies);
	}

	public void update(Cry cry, Baby baby) {
		switch (rand.nextInt(3)) {
			case (0):
				System.out.println("\nDad puts a pillow over his head");
				break;
			case (1):
				System.out.println("\nDad nudges mom");
				break;
			case (2):
				System.out.println("\nDad screams....aaaaaaaaaa");
				break;
		}

	}

}
