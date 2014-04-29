package battleship;

/**
 * Created by user on 4/22/14.
 */
public class BattleShipGame {
    public static void main(String[] args) {
        Board b = new Board();
        Fleet f = new Fleet();
        //b.setBoardColumns(20);
        //b.setBoardRows(10);
        //System.out.println(b.getBoardColumnts());
        //b.drawEmptyBoard();
        //b.setBoardArray(5,2);
        //b.printBoardArray();
        f.randomizeCoord(5,5,2);
        System.out.println(f.randomizeCoord(5,5,2) );
    }


}
