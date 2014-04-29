/*
 * Water.java
 *
 * Version:
 *     $Id: Water.java,v 1.5 2005/12/13 16:23:19 sps Exp $
 * 
 * Revisions:
 *     $Log: Water.java,v $
 *     Revision 1.5  2005/12/13 16:23:19  sps
 *     Checked in a mostly commented version.
 *
 *     Revision 1.4  2005/12/12 22:28:16  sps
 *     Moved some responsibilities from Battleship->Board
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
 *
 */
public class Water extends BoardCell {
	
	public Water(String cheat, String nocheat) {
		super(cheat, nocheat);
	}
	@Override
	public boolean isOccupied() {
        return false;
    }
	@Override
	public boolean wasHit() {
        return false;
    }
	@Override
	public boolean fireAt() {
		System.out.println(Battleship.msg_MISS);
		return false;
	}
}

