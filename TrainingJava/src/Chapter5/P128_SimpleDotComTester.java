package Chapter5;

public class P128_SimpleDotComTester {
	public static void main(String[] args) {
		P128_SimpleDotCom dot = new P128_SimpleDotCom();
		int locations[] = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "1";
		String result = dot.checkYourself(userGuess);
	}

}
