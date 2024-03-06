package GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils
{
	/**
	 * This method is used to generate random no
	 * @return
	 */
	public int getRandomNo()
	{
		Random ran = new Random();
		int Random = ran.nextInt(500);//it will generate the random number from 0 to 500
		return Random;
	}
	
	public String getSystemDate()
	{
		Date dt = new Date();
		String Date = dt.toString();
		return Date;
	}
	public String getSystemDateInFormat()
	{
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
	Date dt = new Date();
	String date = dateformat.format(dt);
	return date;
	
		
	}
	
	

}
