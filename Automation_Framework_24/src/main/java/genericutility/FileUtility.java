package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Subrat
 */
public class FileUtility {
	/**
	 * This Method is used to read data from property file
	 * by taking key from caller.
	 * @param String key
	 * @return String value
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		return pro.getProperty(key);
	}
}




