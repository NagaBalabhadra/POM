package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver=driver;
}
By dropdown=By.xpath(".//*[@id='userNavigationLabel']");
By logout=By.xpath(".//*[@id='js_9m']/div/div/ul/li[14]/a/span/span");
public WebElement clickDropdown()
{
	return driver.findElement(dropdown);
}
public WebElement clickLogout()
{
	return driver.findElement(logout);
}

}
