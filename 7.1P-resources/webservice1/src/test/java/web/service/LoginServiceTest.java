package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginServiceTest {
    private void sleep(long sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private WebDriver setupDriver() {
        System.setProperty(
            "webdriver.chrome.driver", 
            "/path/to/chromedriver");
        return new ChromeDriver();
    }
    
    private void performLogin(WebDriver driver, String username, String password, String dob) {
        driver.navigate().to("file:///path/to/login.html");
        sleep(2);
        
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();
        ele.sendKeys(username);
        
        ele = driver.findElement(By.id("passwd"));
        ele.clear();
        ele.sendKeys(password);
        
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys(dob);
        
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();
        
        sleep(2);
    }
    
    @Test
    public void testLoginSuccess() {
        WebDriver driver = setupDriver();
        performLogin(driver, "khem", "khem_pass", "1998-01-20");
        Assert.assertEquals("success", driver.getTitle());
        driver.close();
    }
    
    @Test
    public void testLoginWrongPassword() {
        WebDriver driver = setupDriver();
        performLogin(driver, "khem", "wrong_pass", "1998-01-20");
        Assert.assertEquals("fail", driver.getTitle());
        driver.close();
    }
    
    @Test
    public void testLoginWrongUsername() {
        WebDriver driver = setupDriver();
        performLogin(driver, "wrong_user", "khem_pass", "1998-01-20");
        Assert.assertEquals("fail", driver.getTitle());
        driver.close();
    }
    
    @Test
    public void testLoginWrongDob() {
        WebDriver driver = setupDriver();
        performLogin(driver, "khem", "khem_pass", "1999-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.close();
    }
    
    @Test
    public void testLoginEmptyFields() {
        WebDriver driver = setupDriver();
        performLogin(driver, "", "", "");
        Assert.assertEquals("fail", driver.getTitle());
        driver.close();
    }
    
    @Test
    public void testLoginInvalidDobFormat() {
        WebDriver driver = setupDriver();
        performLogin(driver, "khem", "khem_pass", "20-01-1998");
        Assert.assertEquals("fail", driver.getTitle());
        driver.close();
    }
}