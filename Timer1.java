package labbook;

import java.time.LocalDateTime;

public class Timer1 implements Runnable {

	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(10000);
				LocalDateTime dateTime = LocalDateTime.now();
				System.out.println("Hour :" + dateTime.getHour() + " " + "Minutes :" + dateTime.getMinute() + " " + "Seconds :"
						+ dateTime.getSecond());
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}