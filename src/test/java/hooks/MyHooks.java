package hooks;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import Utils.ConfigReader;
import driverFactory.MyDrivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	@Before
	public void setup() {
	
		
		
	}
		@After
		public void tearDown() {
			
		}

}
