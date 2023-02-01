package Utils;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static void intializeProperties()    {
		Properties prop = new Properties();
		try {
		FileInputStream fis = new FileInputStream(System.getProperty(""));
		prop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}

}
