package battleship;

/**
 * Created by user on 4/22/14.
 */
public class Board {
    private int boardRows = 6;
    private int boardColumnts = 5;
    private int[][] boardArray;
    public int getBoardRows() {
            return boardRows;
    }
    public void setBoardRows(int bRows) {
        if (bRows < 20) {
            boardRows = bRows;
        } else {
            System.out.println("<20, set default to 10");
        }
    }
    public int getBoardColumnts() {
        return boardColumnts;
    }
    public void setBoardColumns(int bColumns) {
        if (bColumns < 20) {
            boardColumnts = bColumns;
        } else {
            System.out.println("<20, set default to 10");
        }
    }
    public void drawEmptyBoard(){
        System.out.println("\t\t Board");
        System.out.print("\t  ");
        for(int i = 0; i < boardRows; i++){
           System.out.print(i + "   ");
        }
        System.out.println();
        for(int i = 0; i < boardRows; i++){
            System.out.print(i+1 + "\t");
            for(int j = 0; j < boardRows; j++) {
                System.out.print("|___");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
