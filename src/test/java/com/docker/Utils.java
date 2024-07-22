package com.docker;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Utils {

 
	  public static String readTestDataFile(String filePath,String key) throws IOException
		{
			File file=new File(filePath);
			FileReader fr=new FileReader(file);
			Properties pFile=new Properties();
			pFile.load(fr);
			return pFile.getProperty(key);
		}
  
}
