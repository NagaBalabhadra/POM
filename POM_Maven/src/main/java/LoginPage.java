import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By username=By.xpath(".//*[@id='email']");
	By password=By.xpath(".//*[@id='pass']");
	By submit=By.xpath("//*[@class='uiButton uiButtonConfirm']");
	

	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement clickSubmit()
	{
		return driver.findElements(submit).get(0);
	}
	
}
