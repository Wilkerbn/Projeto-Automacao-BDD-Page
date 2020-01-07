package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String login) {
		driver.findElement(By.xpath("//*[@id=\"i0281\"]/div/div/div[1]")).findElement(By.name("loginfmt")).sendKeys(login);
	}
	
	public void btnAvancar() {
		driver.findElement(By.xpath("//*[@id=\"i0281\"]/div/div/div[1]")).findElement(By.id("idSIButton9")).click();
	}
	
	public void senha(String senha) {
		driver.findElement(By.xpath("//*[@id=\"i0281\"]/div/div/div[1]")).findElement(By.id("i0118")).sendKeys(senha);
	}
	
	public void btnEntrar() throws Exception {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"i0281\"]/div/div/div[1]")).findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
	}

	public void btnAceitar() {
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div[1]")).findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
	}
}
