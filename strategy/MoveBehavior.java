package strategy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class MoveBehavior {
    private static final int NUM_MOVES = 30;
    protected int speed;
    private ArrayList<String> character;

    public MoveBehavior(ArrayList<String> character, int speed){
        this.character = character;
        this.speed = speed;
    }
    /**
     * Moves the character across the screen
     * 
     * @param character The String represtation of the character.
     */
    public abstract void move();

    protected void move(boolean jump) {    
        clear();

        //draw each step
        for (int i = 0; i < NUM_MOVES; i++) {
            if(i % 2 == 0 && jump){
                character.addFirst("");
            }

            displayCharacter();
            sleep((int) (100 / speed));
            clear();
            if(i % 2 == 0 && jump){
                character.removeFirst();
            }

            pushCharacterForward();
        }
        clear();
    }
    /**
     * Displays the character, e.g.
     *  o
     * -|-
     * / \
     * 
     * @param character An arrayList were index 0 is the first line of character,
     *                  1 is the second line of the character...
     */
    private void displayCharacter() {
        for (int j = 0; j < character.size(); j++) {
            System.out.println(character.get(j));
        }
    }

    /**
     * Advances each item in the arraylist 1 space forward
     * 
     * @param character The list to move forward
     */
    private void pushCharacterForward() {
        for (int j = 0; j < character.size(); j++) {
            character.set(j, " " + character.get(j));
        }
    }

    /**
     * Pauses the program
     * 
     * @param num The miliseconds to pause the program for
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    /**
     * Clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
