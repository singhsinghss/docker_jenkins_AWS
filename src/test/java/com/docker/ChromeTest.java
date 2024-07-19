package com.docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest extends SetUpGrid {
  @Test
  public void test_chrome() throws MalformedURLException {
	  
	 ChromeOptions opt=new ChromeOptions();
	 
	 URL url=new URL("http://localhost:4445/wd/hub");
	 RemoteWebDriver driver=new RemoteWebDriver(url,opt);
	 
	 driver.get("https://www.programiz.com/sql/online-compiler/");
	 String title=driver.getTitle();
	 System.out.println("Chrome title: "+title);
	 driver.quit();
	 
  }
}
