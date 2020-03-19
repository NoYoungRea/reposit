package CalenderTest;

import java.text.DecimalFormat;

public class FormatTest {
	public static void main(String[]args) {
		int money=10000000;
		double pi=31231.14195;
		DecimalFormat df=new DecimalFormat("#,###");
		System.out.println(df.format(money));
		DecimalFormat df2=new DecimalFormat("#,##,#,###");
		System.out.println(df2.format(pi));

	}
}
