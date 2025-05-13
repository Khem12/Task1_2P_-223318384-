package web.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class TestSTEMGame {
    private WebDriver driver;
    private WebDriverWait wait;
    private String baseUrl = "http://localhost:8080";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/khemrajgurung/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testSuccessfulLoginAndMathQuestions() {
        // Test login
        driver.get(baseUrl + "/login");
        driver.findElement(By.name("username")).sendKeys("ahsan");
        driver.findElement(By.name("passwd")).sendKeys("ahsan_pass");
        driver.findElement(By.name("dob")).sendKeys("2000-01-01");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        
        // Wait for Q1 page to load by checking for a unique element
        WebElement number1Input = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("number1")));
        
        // Test Q1 (Addition)
        WebElement number2 = driver.findElement(By.name("number2"));
        WebElement result = driver.findElement(By.name("result"));
        
        number1Input.sendKeys("5");
        number2.sendKeys("3");
        result.sendKeys("8");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());
        
        // Wait for Q2 page to load
        WebElement q2Number1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("number1")));
        
        // Test Q2 (Subtraction)
        WebElement q2Number2 = driver.findElement(By.name("number2"));
        WebElement q2Result = driver.findElement(By.name("result"));
        
        q2Number1.sendKeys("10");
        q2Number2.sendKeys("4");
        q2Result.sendKeys("6");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());
        
        // Wait for Q3 page to load
        WebElement q3Number1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("number1")));
        
        // Test Q3 (Multiplication)
        WebElement q3Number2 = driver.findElement(By.name("number2"));
        WebElement q3Result = driver.findElement(By.name("result"));
        
        q3Number1.sendKeys("7");
        q3Number2.sendKeys("6");
        q3Result.sendKeys("42");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());
        
 
    }

    @Test
    public void testingWrongAnswerFlow() {
        // Login
        driver.get(baseUrl + "/login");
        driver.findElement(By.name("username")).sendKeys("ahsan");
        driver.findElement(By.name("passwd")).sendKeys("ahsan_pass");
        driver.findElement(By.name("dob")).sendKeys("2000-01-01");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        
        // Submit wrong answer for Q1
        driver.findElement(By.name("number1")).sendKeys("5");
        driver.findElement(By.name("number2")).sendKeys("3");
        driver.findElement(By.name("result")).sendKeys("7"); // Wrong answer
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        
        // Should stay on Q1 with error message
        assertTrue(driver.getCurrentUrl().contains("/q1"));
        assertTrue(driver.getPageSource().contains("Wrong answer"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}