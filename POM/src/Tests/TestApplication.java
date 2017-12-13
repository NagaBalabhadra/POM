package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Libraries.GetScreenShot;
import ObjectRepositories.HomePage;
import ObjectRepositories.LoginPage;

public class TestApplication{
	WebDriver driver;
	@BeforeTest
	public void openUrl()
	{
		/*System.setProperty("webdriver.gecko.driver","C:\\Selenium\\lib\\geckodriver.exe");
		driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
	@Test(priority=0)
	public void loginFacebook() throws InterruptedException, IOException{
		
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().sendKeys("durgaalekya@gmail.com");
		lp.enterPassword().sendKeys("Alekya@3112");
		GetScreenShot.screenshot(driver,"login");
		lp.clickSubmit().click();
		System.out.println(driver.getTitle());
		
		
	}
	/*@Test(priority=1)
	public void logout() throws InterruptedException{
		HomePage hp=new HomePage(driver);
		hp.clickDropdown().click();
		hp.clickLogout().click();
	}*/
	@AfterTest
	public void closeApp(){
		driver.quit();
	}
	

}
