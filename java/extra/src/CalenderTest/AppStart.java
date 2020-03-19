package CalenderTest;

import java.util.Calendar;

public class AppStart {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR)).append("year")
		.append(cal.get(Calendar.MONTH)+1).append("month")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append("day")
		.append(cal.get(Calendar.HOUR)).append("hour")
		.append(cal.get(Calendar.MINUTE)).append("minute")
		.append(cal.get(Calendar.SECOND)).append("second");
		System.out.println(sb);
		
		cal.set(Calendar.HOUR, cal.get(Calendar.HOUR)+500);
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)+10000);
		sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR)).append("year")
		.append(cal.get(Calendar.MONTH)+1).append("month")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append("day")
		.append(cal.get(Calendar.HOUR)).append("hour")
		.append(cal.get(Calendar.MINUTE)).append("minute")
		.append(cal.get(Calendar.SECOND)).append("second");
		System.out.println(sb);
		
	}
}
