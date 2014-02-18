package Chapter2;

public class P66_TapeDeckTestDrive {
	public static void main(String[] args) {
		P66_TapeDeck t = new P66_TapeDeck();
		
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true) {
			t.recordType();
		}		
	}
}
