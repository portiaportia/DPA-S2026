package strategy;

import java.util.ArrayList;

public abstract class Animal {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    public Animal(String name) {
        this.name = name;
        character = new ArrayList<>();
    }

    public void move() {
        moveBehavior.move();
    }

    public String toString(){
        return name;
    }
}
