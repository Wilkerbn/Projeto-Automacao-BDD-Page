package suport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wilker.nogueira\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://forms.office.com/Pages/ResponsePage.aspx?id=tD1UhxPfNU-ZXwV-eqmUNz7y0v7ZqAVMjqPZwmxf7TJUNDFIVldFR1daUUhJMlFQSElZS1pSV0ZJWi4u");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
