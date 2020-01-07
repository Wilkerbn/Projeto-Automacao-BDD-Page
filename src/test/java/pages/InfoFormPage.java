package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoFormPage {

	private WebDriver driver;
	
	public InfoFormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void campoNome(String nome) {
		driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[3]/div/div/div/input")).sendKeys(nome);
	}
	
	public void campoSobrenome(String sobrenome) {
		driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[3]/div/div/div/input")).sendKeys(sobrenome);
	}
	
	public void selecioneEmpresa() {
		WebElement empresa = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div[3]/div")).findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div[3]/div/div[1]/div/label/input"));
		empresa.click();
	}
	
	public void avalioEmpresa() {
		WebElement avalioEmpresa = driver.findElement(By.xpath("//*[@id=\"rateit-range-1\"]/div[1]")).findElement(By.xpath("//*[@id=\"rateit-range-1\"]/div[1]/span[5]"));
		avalioEmpresa.click();
	}
	
	public void insiroDataNascimento() {
		WebElement insiroDataNascimento = driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[5]/div[2]/div[3]/div/div/div/input[1]"));
		insiroDataNascimento.sendKeys("22/11/1990");
	}
	
	public void selecionoLinguagens() {
		WebElement selecionoLinguagens = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[6]/div[2]/div[3]/div")).findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[6]/div[2]/div[3]/div/div[5]/div/label/input"));
		selecionoLinguagens.click();
	}
	
}
