package com.docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void test_FireFox() throws MalformedURLException, InterruptedException {
	  
	  FirefoxOptions opt=new FirefoxOptions();
		 
		// URL url=new URL("http://ec2-3-93-146-215.compute-1.amazonaws.com:4445/wd/hub");
	     URL url =new URL("http://localhost:4445/wd/hub");
		 RemoteWebDriver driver=new RemoteWebDriver(url,opt);
		
		 driver.get("https://www.programiz.com/sql/online-compiler/");
		 String title=driver.getTitle();
		 System.out.println("firefox title: "+title);
		 driver.quit();
  }
}
