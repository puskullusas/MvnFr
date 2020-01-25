package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReaderDontUse {

	public static Properties prop;
	/*prop has all data:
	 * browser=Chrome
		url=http://166.62.36.207/Syntax_HRM/symfony/web/index.php/auth/login
		username=Admin
		password=Syntax@123
	 */
	//Properties cred=readProperties(credentials.properties);
	//Properties configs=readProperties(configurations.properties)

	// mehtod to read properties file
	public static void readProperties(String configFileName) {
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configs/"+configFileName+".properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// method to get info from file
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
