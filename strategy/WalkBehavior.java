package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {

    public WalkBehavior(ArrayList<String> character, int speed) {
        super(character, speed);
    }

    /**
     * Continouly moves the character accross the screen NUM_MOVE times
     * Will pause inbetween moves, and clear the screen
     * 
     * @param character The ArrayList of String that represents the character
     * @param speed     The speed at which the character moves 1, 2, 3. 1 is slow, 3
     *                  is fast
     */
    public void move() {
        move(false);
    }
}
