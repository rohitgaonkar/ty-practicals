package clock;

public class startclock {

	public static void main(String[] args) {
		clock c = new clock(12,59,59);
				System.out.println(c.getHours());
		c.secondElapsed();
	System.out.println(c.getHours());
	}

}
