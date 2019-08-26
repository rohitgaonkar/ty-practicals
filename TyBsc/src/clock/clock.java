package clock;

public class clock {
	private int hours,minutes,seconds;
	public clock(int h,int m,int s) {
		hours = h;
		minutes = m;
		seconds = s;
	}
	public void secondElapsed() {
		if (seconds<59)seconds++;
		else {
			seconds = 0;
			if(minutes <59) minutes++;
			else {
				minutes = 0;
			      hours = hours < 12 ? hours+1 : 1;
			}
		}
	}
	public int getHours() {
		   return hours;
		}

		public int getMinutes() { 
		   return minutes;
		}

		public int getSeconds() { 
		   return seconds;
		}
}
