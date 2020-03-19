package CalenderTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dataformat {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH mm ss");
			System.out.println(cal.getTime());
			String date = sdf.format(cal.getTime());
			System.out.println(date);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
