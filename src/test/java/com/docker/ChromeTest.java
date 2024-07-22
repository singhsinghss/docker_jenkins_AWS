package com.docker;

import java.io.IOException;
import java.net.URL;

import org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest extends Utils {
  @Test
  public void test_chrome() throws IOException {
	  
	 ChromeOptions opt=new ChromeOptions();
	 
	 String cloud_url=readTestDataFile(System.getProperty("User.dir")+"\\src\\test\\resources\\TestData\\Config.properties", "url");
     URL url =new URL(cloud_url);
	 RemoteWebDriver driver=new RemoteWebDriver(url,opt);
	 
	 driver.get("https://www.programiz.com/sql/online-compiler/");
	 String title=driver.getTitle();
	 System.out.println("Chrome title: "+title);
	 driver.quit();
	 
  }
}
