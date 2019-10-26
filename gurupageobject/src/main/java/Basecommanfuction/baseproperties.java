package Basecommanfuction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class baseproperties {

	public static WebDriver driver;

	public static Properties properties;

public	ExtentReports extentreport;

public	ExtentHtmlReporter htmlreprot;
	
public	ExtentTest test;
	

	Logger logge = Logger.getLogger(baseproperties.class);

	public Properties loadproperties() throws IOException {

		FileInputStream file = new FileInputStream("Guru.properties");

		properties = new Properties();

		properties.load(file);

		return properties;

	}

	@BeforeSuite
	public void browserlaunch() throws IOException {
		
		extentreport=new ExtentReports();
		
		htmlreprot=new ExtentHtmlReporter("extentreport.html");
		
		extentreport.attachReporter(htmlreprot);

		PropertyConfigurator.configure("log4j.properties");

		loadproperties();

		logge.info("Going to start the function");

		logge.info("Loding the properties file");

		logge.info("configure file loded");

		String url = properties.getProperty("url");

		logge.info("url file upaloed");

		String browser = properties.getProperty("browser");

		logge.info("browser launch");

		if (browser.equals("Chrome")) {

			logge.info("chorme driver going launch");

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browser.equals("firefox")) {

			logge.info("Firefox driver going launch");

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new FirefoxDriver();

		}

		logge.info("Url going to launch");

		driver.get(url);

		driver.manage().window().maximize();

	}

	@AfterSuite
	public void teardown() {
		
		test=extentreport.createTest("Webpage going to close");

		logge.info("browser going to close");

		driver.close();
		extentreport.flush();
		

	}

	public void Screenshots(String result) throws IOException {

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

		File sourcefile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		File file = new File("E://sample.png");

		FileHandler.copy(sourcefile, file);

	}

}
