package common_utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileUtil {
	public String getDataFromPropertyFile(String keyname) throws IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Login_crendencial.properties.txt");	
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(keyname);
		return value;
	

}

	}




