package sit707_week2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Khem Raj Gurung
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/khemrajgurung/Downloads/chromedriver-mac-arm64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Khem");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement lName = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lName);
		// Send last name
		lName.sendKeys("Gurung");
		
		WebElement phNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phNumber);
		// Send phone number
		phNumber.sendKeys("0449013280");
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		// Send email
		email.sendKeys("khem.grg.360@gmail.com");
		
		WebElement pWord = driver.findElement(By.id("password"));
		System.out.println("Found element: " + pWord);
		// Send password
		pWord.sendKeys("Khem@89");
		
		WebElement confPassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + confPassword);
		// Send confirm password
		confPassword.sendKeys("Khem@89");
		sleep(2);
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
//		WebElement button = driver.findElement(By.cssSelector("button[data-test-id='login-action-btn']"));
//		button.click();
		WebElement create_account_button = driver.findElement(By.cssSelector("[data-testid='account-action-btn']"));
		System.out.println("Found element:" + create_account_button);
				create_account_button.click();
				sleep(2);
				System.out.println("button clicked");
				sleep(7);
		/*
		 * Take screenshot using selenium API.
		 */
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			File saveLocation = new File("/Users/khemrajgurung/Documents/SIT707/task2_1P/task2_1.png");
			FileUtils.copyFile(screenShot, saveLocation);
			sleep(2);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void amazon_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/khemrajgurung/Downloads/chromedriver-mac-arm64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("ap_customer_name"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Khem");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		WebElement phNumber_email = driver.findElement(By.id("ap_email"));
		System.out.println("Found element: " + phNumber_email);
		// Send phone number
		phNumber_email.sendKeys("0449013280");
		
		WebElement pWord = driver.findElement(By.id("ap_password"));
		System.out.println("Found element: " + pWord);
		// Send password
		pWord.sendKeys("Kh@89");
		
		WebElement confPassword = driver.findElement(By.id("ap_password_check"));
		System.out.println("Found element: " + confPassword);
		// Send confirm password
		confPassword.sendKeys("Kh@89");
		sleep(2);
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
//		WebElement button = driver.findElement(By.cssSelector("button[data-test-id='login-action-btn']"));
//		button.click();
		WebElement create_account_button = driver.findElement(By.id("continue"));
		System.out.println("Found element:" + create_account_button);
				create_account_button.click();
				sleep(2);
				System.out.println("button clicked");
				sleep(7);
		/*
		 * Take screenshot using selenium API.
		 */
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			File saveLocation = new File("/Users/khemrajgurung/Documents/SIT707/task2_1P/tsk2.png");
			FileUtils.copyFile(screenShot, saveLocation);
			sleep(2);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
}
