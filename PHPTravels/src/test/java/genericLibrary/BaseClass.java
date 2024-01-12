package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void quitBrowser() {
		driver.quit();
	}
	
	public void selectMethod(WebElement element, String country) {
		Select s = new Select(element);
		s.selectByVisibleText(country);
	}
	
	public void getTitle() {
		driver.getTitle();
	}
}
