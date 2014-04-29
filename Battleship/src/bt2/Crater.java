package bt2;
/**
 * A Crater object is created each time a Water or Ship cell is fired at.
 * 	- There are two types of craters in the game, water crater and ship crater.
 * 	- For a water crater:
 * 		- ship mode value = "-"
 * 		- board mode value = "O"
 *  - For a ship crater:
 *  		- ship mode value = value of ship hit (A-D)
 *  		- board mode value = "X"
 */
public class Crater extends BoardCell {
	public Crater(String cheatVal, String noCheatVal) {
		super(cheatVal, noCheatVal);
	}
	@Override
	public boolean isOccupied() {
        return true;
    }
	@Override
	public boolean wasHit() {
        return true;
    }
	@Override
	public boolean fireAt() {
		System.err.println("This should never happens");
		assert false;
		return false;
	}
}