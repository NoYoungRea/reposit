package CalenderTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dataformat {
	public static void main(String[]args) {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy MM dd HH mm ss");
		String date=sdf.format(cal.getTime());
		System.out.println(date);
	}
}
