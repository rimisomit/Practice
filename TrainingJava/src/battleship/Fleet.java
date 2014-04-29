package battleship;
//import
/**
 * Created by user on 4/22/14.
 */
public class Fleet {
    //Board[] boa = new Board[5];
    public void createRandomFleet() {
        Board b = new Board();
        Ship[] rShip = new Ship[5];
        rShip[0].setShipType("Type1");
        rShip[0].setShipAcross(randomizeBoolean());
    }
    public boolean randomizeBoolean(){
        return (Math.random() > 0.5);
    }
    public int[] randomizeCoord(int maxCol, int maxRow, int size){
        int rcol=0, rrow=0;
        int[] coords = new int[3];
        //boolean isAcross;
        while( ((rrow+size)< maxRow) | ((rrow+size) < maxCol)) {
            rcol = (int) (maxCol * Math.random());
            rrow = (int) (maxRow * Math.random());
          //  isAcross = Math.random() > 0.5;
        }
        //if rrow

        coords[0]=rrow;
        coords[1]=rcol;
        return coords;
    }
}
