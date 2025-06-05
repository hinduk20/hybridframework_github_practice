package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	  public static Properties prop;
	public  ConfigDataProvider(String excelfilename) {
		try {
		File fs=new File("./Config"+excelfilename+".properties");
		FileInputStream fis=new FileInputStream(fs);
		prop=new Properties();
		prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		        }
	 }
	 public String Searchkey(String key) {
		 return prop.getProperty(key);
	 }

}
