package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils { 
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IpathConstants.Filepath);
		Properties pobj = new Properties();
		pobj.load(fis);
		
		return pobj.getProperty(key);
	}
	

}
