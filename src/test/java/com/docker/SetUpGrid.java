package com.docker;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SetUpGrid {
  //@BeforeSuite
  public void run_Docker_composeV3() throws IOException, InterruptedException {
	  	  
	  Runtime.getRuntime().exec("cmd /c start start-docker-compose-v3.bat");
		/*
		 * ProcessBuilder pb = new ProcessBuilder("start_docker_compose.sh"); Process p
		 * = pb.start();
		 */
	  Thread.sleep(15000);
  }
  
  //@AfterSuite    
  public void stop_Docker_composeV3() throws IOException, InterruptedException {
	  
	  Runtime.getRuntime().exec("cmd /c start stop_docker_compose_V3.bat");
		/*
		 * ProcessBuilder pb = new ProcessBuilder("stop_docker_compose.sh"); Process p =
		 * pb.start();
		 */
	   Thread.sleep(15000);
  }
}
