package Chapter4;

class P110_ClockTestDrive {
	public static void main(String[] args) {
		P110_Clock c = new P110_Clock();
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("Current time: " + tod);
	}

}
