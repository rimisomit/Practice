/*
 * Cell.java
 *
 * Version:
 *     $Id: Cell.java,v 1.6 2005/12/13 16:23:19 sps Exp $
 * 
 * Revisions:
 *     $Log: Cell.java,v $
 *     Revision 1.6  2005/12/13 16:23:19  sps
 *     Checked in a mostly commented version.
 *
 *     Revision 1.5  2005/12/12 22:28:16  sps
 *     Moved some responsibilities from Battleship->Board
 *
 *     Revision 1.4  2005/12/12 14:16:31  sps
 *     Removed extra unused methods.
 *
 *     Revision 1.3  2005/12/10 16:30:46  sps
 *     Command line error handling implemented.
 *
 *     Revision 1.2  2005/12/10 05:24:52  sps
 *     I think this version works...  Need to test now.
 *
 *     Revision 1.1  2005/12/09 15:57:14  sps
 *     Initial revision
 */
package bt2;
/**
 * abstract class, extension for Ship, Crater and Water
 */
public abstract class BoardCell {
	
	public String cheatVal;		// "view/show ships" representation
	public String nocheatVal;		// "view/show board" representation
	public BoardCell(String cheat, String nocheat) {
		cheatVal = cheat;
		nocheatVal = nocheat;
	}
	public String getVal(boolean cheat) {
		return cheat ? cheatVal : nocheatVal;
	}
	// is this cell currently occupied?
	public abstract boolean isOccupied();
	// was the cell already hit by a missile (i.e. it is a crater)?
	public abstract boolean wasHit();
	// does firing at this cell produce a hit?
	public abstract boolean fireAt();
}

