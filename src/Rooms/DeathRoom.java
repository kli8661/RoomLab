package Rooms;

import Game.Runner;
import People.Person;

public class DeathRoom extends Room{

    //New constructor for the 2 coordinates a and b for the death room instead of x and y.
    public DeathRoom(int a, int b) {
        super(a, b);
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You've entered the wrong room, now you're dead, try again next time.");
        Runner.gameOff();
    }
}
