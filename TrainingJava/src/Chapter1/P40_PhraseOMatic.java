package Chapter1;
public class P40_PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = {"24/7", "multi-Tier"};
		String[] wordListTwo = {"empowered", "sticky"};
		String[] wordListThree = {"process", "tipping-point"};
		
		int oneLenght = wordListOne.length;
		int twoLenght  = wordListTwo.length;
		int threeLenght = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLenght);
		int rand3 = (int) (Math.random() * threeLenght);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("We need is a " + phrase);
	}
}