package store.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	//public static WebDriver driver;
	
	// Declare ThreadLocal Driver
		public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
		
		
		
		public static WebDriver getDriver() {
			// Get Driver from threadLocalmap
			return driver.get();
		}

	@BeforeTest
	public void loadConfig() throws IOException{
		 prop = new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\hp\\Documents\\seleniumwork\\Ecommerece_Project\\configuration\\config.properties");
		prop.load(ip);
		}
	
	public void launchApp(String browserName) {
		// String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			// Set Browser to ThreadLocalMap
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver.set(new InternetExplorerDriver());
		}
		//Maximize the screen
				getDriver().manage().window().maximize();
				//Delete all the cookies
				getDriver().manage().deleteAllCookies();
				//Implicit TimeOuts
				getDriver().manage().timeouts().implicitlyWait
				(Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
				//PageLoad TimeOuts
				getDriver().manage().timeouts().pageLoadTimeout
				(Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
				//Launching the URL
				getDriver().get(prop.getProperty("URL"));
			}
}

