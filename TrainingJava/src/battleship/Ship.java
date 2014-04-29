package battleship;
/**
 * Created by user on 4/22/14.
 */
public class Ship {
    private String shipType;
    private int shipSize = 1;
    private boolean shipSunk = false;
    private boolean shipHit = false;
    private boolean shipAcross = false;
    private int xcoord = 0;
    private int ycoord = 0;

    public String getShipType() {
        return shipType;
    }
    public int getXcoord(){

        return xcoord;
    }
    public int getYcoord(){
        return ycoord;
    }
    public void setShipType(String stype){
        shipType = stype;
    }
    public void setShipSize(int ssize){
        shipSize = ssize;
    }
    public boolean getShipAcross(){
        return shipAcross;
    }
    public void setShipAcross(boolean across){
        shipAcross = across;
    }
}
