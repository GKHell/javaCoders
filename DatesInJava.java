
import java.util.*; // calendar
import java.text.*; 
class DatesInJava{
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();


		System.out.println("month : "+cal.get(Calendar.MONTH));
		System.out.println("  day : "+cal.get(Calendar.DATE));

		System.out.println(" TIME : "+cal.get(Calendar.HOUR)+" "+cal.get(Calendar.MINUTE));

		System.out.println(" YEAR (1): "+cal.get(Calendar.YEAR));
				cal.set(Calendar.YEAR,2025);
		System.out.println(" YEAR (2): "+cal.get(Calendar.YEAR));

		/////////////////////////////-----------------/////////////////////
		Date d = new Date();

		DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.UK);
		System.out.println("Date : "+fmt.format(d));
	}
}