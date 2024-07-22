package com.docker;

import java.io.IOException;
import java.net.URL;

import org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MSEdgeTest extends SetUpGrid {
  @Test
  public void test_Edge() throws IOException {
	   EdgeOptions opt=new EdgeOptions();
		 //http://52.91.17.64:4445/wd/hub
	   String cloud_url=Utils.readTestDataFile(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Config.properties", "url");
	   System.out.println("url is: "+cloud_url);
	   URL url =new URL(cloud_url);
	   	// URL url=new URL("http://ec2-3-93-146-215.compute-1.amazonaws.com:4445/wd/hub");
		 RemoteWebDriver driver=new RemoteWebDriver(url,opt);
		 
		 driver.get("https://www.programiz.com/sql/online-compiler/");
		 String title=driver.getTitle();
		 System.out.println("Edge title: "+title);
		 driver.quit();
  }
}
