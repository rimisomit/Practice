package bt2;
import java.util.*;

/**
 * Main class
 *  main loop
 *  checking input commands
 */
public class Battleship {
	// Predefined error messages
	private final static String error_ILLEGAL_NUM_ARGS = "Usage: java Battleship N [config-file]" +
                                                    "\nWhere:" +
                                                    "\n  N - count of ships" +
                                                    "\n  [config-file] is optional";
	private final static String error_BOARD_TOO_SMALL = "Board must be at least 5 by 5.";
	private final static String error_BOARD_TOO_LARGE = "Board must be at most 100 by 100.";
	private final static String error_ILLEGAL_COMMAND = "Illegal command.";
	private final static String error_WRONG_ARGUMENTS = "Wrong number of arguments.";
	private final static String error_INVALID_VIEW_COMMAND = "Can only view boards or ships.";
	private final static String error_SAME_COORDINATES = "Coordinates previously fired upon.";
	private final static String error_ILLEGAL_COORDINATES = "Illegal coordinates.";
    //Feedback
	public final static String msg_HIT = "Hit!";
	public final static String msg_MISS = "Miss!";
	public final static String msg_SUNK = "Sunk!";
	public final static String msg_WIN = "You win!";
	// User cmd input commands
	private final static String cmd_BLANK = "";
	private final static String cmd_VIEW = "view";
    private final static String cmd_SHOW = "show";
	private final static String cmd_BOARD = "board";
	private final static String cmd_SHIPS = "ships";
	private final static String cmd_FIRE = "fire";
	private final static String cmd_STATS = "stats";
	private final static String cmd_HELP = "help";
	private final static String cmd_QUIT = "quit";
    private final static String cmd_EXIT = "exit";
	private Board board;
    // > - as a prompt
	private final String PROMPT = "> ";
/*
	public Battleship(int dim) throws BattleshipException {
		this(dim, null);
	}
*/
	public Battleship(int dim, String configFile) throws BattleshipException {
		// create board from file
		board = new Board(dim, configFile);
	}
    // >help output
	private void printHelpMsg() {
		System.out.println("List of commands:");
		System.out.println(" view/show board - displays the user's board");
		System.out.println(" view/show ships - displays the placement of the ships");
		System.out.println(" fire 0 2 - fires a missile at the cell at [0,2]");
		System.out.println(" stats - prints out the game statistics");
		System.out.println(" quit/exit - exits the game");
	}
    // >stats show statistic
	private void printStats() {
		int numFired = board.getMissilesFired();
		System.out.println("Number of missiles fired: " + board.getMissilesFired());
		System.out.println("Hit ratio: " + 
				(numFired == 0 ? 0 : (double)board.getNumHits() / board.getMissilesFired() * 100) + "%");
		System.out.println("Number of ships sunk: " + board.getShipsSunk());
	}
	
	private void mainLoop() {
		// display board w/o cheat
		board.display(false);
		// wait for user input
		Scanner lineScanner = new Scanner(System.in);
		String cmd;
		do {
			cmd = cmd_BLANK;
			System.out.print(PROMPT);
			Scanner wordScanner = new Scanner(lineScanner.nextLine());
			if (wordScanner.hasNext()) {
				cmd = wordScanner.next();
	            // >view/show handle
				if (cmd.equals(cmd_VIEW)|cmd.equals(cmd_SHOW)) {
					if (wordScanner.hasNext()) {
						String type = wordScanner.next();
						if (wordScanner.hasNext()) {
							System.out.println(error_WRONG_ARGUMENTS);
							continue;
						}
                        // >view/show board or ships
						if (type.equals(cmd_BOARD)) {
							board.display(false);
						} else if (type.equals(cmd_SHIPS)) {
							board.display(true);
						} else {
							System.out.println(error_INVALID_VIEW_COMMAND);
						}
					} else {
						System.out.println(error_WRONG_ARGUMENTS);
					}
                // >fire
				} else if (cmd.equals(cmd_FIRE)) {
					int row=0, col=0;
					if (wordScanner.hasNextInt()) {
                        row = wordScanner.nextInt();
                    }
					else {
						System.out.println(error_ILLEGAL_COMMAND);
						continue;
					}
					if (wordScanner.hasNextInt()) {
                        col = wordScanner.nextInt();
                    }
					else {
						System.out.println(error_ILLEGAL_COMMAND);
						continue;
					}
					if (wordScanner.hasNext()) {
						System.out.println(error_WRONG_ARGUMENTS);
						continue;
					}
					if (!board.isValid(row, col)) {
                        System.out.println(error_ILLEGAL_COORDINATES);
                    }
					else {
						if (board.fire(row, col)) {
							if (board.checkWin()) {
								System.out.println(msg_WIN);
								board.display(false);
								printStats();
								return;
							}
							board.display(false);
						} else {
							System.out.println(error_SAME_COORDINATES);
						}
					}
                // >stats
				} else if (cmd.equals(cmd_STATS)) {
					if (wordScanner.hasNext()) {
						System.out.println(error_WRONG_ARGUMENTS);
					} else {
						printStats();
					}
				} else if (cmd.equals(cmd_HELP)) {
					if (wordScanner.hasNext()) {
						System.out.println(error_WRONG_ARGUMENTS);
					} else {
						printHelpMsg();
					}
				} else if (cmd.equals(cmd_QUIT) | cmd.equals(cmd_EXIT)) {
					if (wordScanner.hasNext()) {
						System.out.println(error_WRONG_ARGUMENTS);
						cmd = cmd_BLANK;
					}
				} else if (!cmd.equals(cmd_BLANK)){
					System.out.println(error_ILLEGAL_COMMAND);
				}
			}
		} while (!(cmd.equals(cmd_QUIT)|cmd.equals(cmd_EXIT)));
	}
	
	public static void main(String[] args) {
		try {
			// Check arguments. >java Battleship N [config-file]
			if (args.length < 1 || args.length > 2) {
				throw new BattleshipException(error_ILLEGAL_NUM_ARGS);
			}
			// check min..max size
			int dim = Integer.parseInt(args[0]);
			if (dim < Board.MIN_BOARD_SIZE) {
				throw new BattleshipException(error_BOARD_TOO_SMALL);
			} else if (dim > Board.MAX_BOARD_SIZE) {
				throw new BattleshipException(error_BOARD_TOO_LARGE);
			}
		    // create Battleship instance
			Battleship bs;
			String configFile = args.length == 1 ? null : args[1];
			bs = new Battleship(dim, configFile);
			// enter main loop
			bs.mainLoop();
		}
		catch (BattleshipException e) {
			System.err.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.err.println(error_ILLEGAL_NUM_ARGS);
		} 
	}
}
