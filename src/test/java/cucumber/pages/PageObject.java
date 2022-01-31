package cucumber.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {
	protected WebDriver driver;

	public PageObject(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		if (driver == null) 
		{
            this.driver = new ChromeDriver();
            //WebDriverWait wait = new WebDriverWait(browser,time);
        } 
		else 
		{
            this.driver = driver;
            //WebDriverWait wait = new WebDriverWait(browser,time);
        }
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	} 
}
