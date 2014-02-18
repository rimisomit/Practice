package Chapter2;

public class P61_MovieTestDrive {
	public static void main(String[] ags) {
		P61_Movie one = new P61_Movie();
		one.title = "Gone with the stock";
		one.genre = "Tragic";
		one.rating = -2;
		
		P61_Movie two = new P61_Movie();
		two.title = "Lost in Cubicle space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		
		P61_Movie three = new P61_Movie();
		three.title = "Byte Club";
		three.genre = "Tragic2";
		three.rating = 127;
	}
}
