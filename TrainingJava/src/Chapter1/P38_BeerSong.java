package Chapter1;
public class P38_BeerSong {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "boutles";
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "boutle";
			}
			//System.out.println(beerNum + " " + word + " on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("One takes down");
			System.out.println("Pass it arround");
			beerNum = beerNum - 1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " on the wall");
			} else {
				System.out.println("No more boutles of beer on the wall");
			}
		}
	}

}
