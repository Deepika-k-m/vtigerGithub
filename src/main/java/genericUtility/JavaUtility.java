package genericUtility;



import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility<SimpleDateFormat> {
	/**
	 * *This is a generic method to generate random number for a given bound
	 * @param bound
	 * @return
	 */

	public int generateRandomNumber(int bound) {
		Random random = new Random();
		int value = random.nextInt(bound);
		return value;


	}
	/**
	 * This is a generate method to fetch calendar details
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;



	}


}
