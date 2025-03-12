package observer;

import java.util.ArrayList;
import java.util.Random;

public class Baby implements Subject {
	private String name;
	private ArrayList<Observer> observers;
	private Random rand;

	public Baby(String name) {
		observers = new ArrayList<Observer>();
		this.name = name;
		rand = new Random();
	}

	public String getName() {
		return name;
	}

	public void receiveLove() {
		if(rand.nextBoolean()){
			System.out.println("\n" + name + " feels appreciated and loved.");
		} else {
			System.out.println("\n" + name + " pushes everyone away and continues to cry.");
		}
	}

	public void eat() {
		if(rand.nextBoolean()){
			System.out.println("\n" + name + " has a happy full tummy.");
		} else {
			System.out.println("\n" + name + " throws all his food on the floor.");
		}
	}

	public void getChanged() {
		System.out.println("\n" + name + " is having a diaper change. ");
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers(Cry cry) {
		for(Observer observer : observers) {
			observer.update(cry, this);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	
	
	public void angryCry() {
		System.out.println("\nWaaaaaaaaaa! " + name + " is feeling abandoned and angry.");
		notifyObservers(Cry.ANGRY);
	}

	public void hungryCry() {
		System.out.println("\nNeh Neh Neh! " + name + " is starving!!!!");
		notifyObservers(Cry.HUNGRY);
	}

	public void wetCry() {
		System.out.println("\nAaaaaaaa! " + name + " is WET!");
		notifyObservers(Cry.WET);
	}

}
