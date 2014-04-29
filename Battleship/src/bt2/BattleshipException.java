/*
 * BattleshipException.java
 *
 * Version:
 *     $Id: BattleshipException.java,v 1.4 2005/12/13 16:23:19 sps Exp $
 * 
 * Revisions:
 *     $Log: BattleshipException.java,v $
 *     Revision 1.4  2005/12/13 16:23:19  sps
 *     Checked in a mostly commented version.
 *
 *     Revision 1.3  2005/12/12 22:28:16  sps
 *     Moved some responsibilities from Battleship->Board
 *
 *     Revision 1.2  2005/12/10 16:30:46  sps
 *     Command line error handling implemented.
 *
 *     Revision 1.1  2005/12/10 05:24:51  sps
 *     I think this version works...  Need to test now.
 *
 */
package bt2;
/**
 * Exception class
 */
public class BattleshipException extends Exception {
	public BattleshipException(String msg) {
		super(msg);
	}
}

