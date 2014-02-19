package Chapter2;

public class P67_DrumKitTestDrive {
	public static void main(String[] args) {
		P67_DrumKit d = new P67_DrumKit();
		
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
		d.playSnare();
		d.playTopHat();
	}

}
