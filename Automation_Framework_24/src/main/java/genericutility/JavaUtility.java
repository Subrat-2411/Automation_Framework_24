package genericutility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Subrat
 */
public class JavaUtility {
	
	/**
	 *  This Method is used to capture current system date and time.
	 * @return String date and time
	 */
	public String getSystemTime()
	{
		
		return LocalDateTime.now().toString().replace(':', '-');
	}
	
	/**
	 * This method will return random numbers 
	 * @return int
	 */
	public int getRandomNumber()
	{
		
		Random ran=new Random();
		
		return ran.nextInt(1000);
		
	}
}
