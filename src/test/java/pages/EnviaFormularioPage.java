package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnviaFormularioPage {

	private WebDriver driver;

	public EnviaFormularioPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enviarFormulario() {
		driver.findElement(
				By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[3]/div/button/div")).click();
	}

	public void recebeMensagemConfirmacao(String mensagemConfirmacaoEnvio) {

		if (mensagemConfirmacaoEnvio.equals("Obrigado!")) {
			String mensagemRecebida = driver
					.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[2]/div[1]/div[1]/span"))
					.getText();

			assertEquals(mensagemConfirmacaoEnvio, mensagemRecebida);
		} else {
			String mensagemRecebida = driver
					.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[4]/div/span"))
					.getText();
			assertEquals(mensagemConfirmacaoEnvio, mensagemRecebida);
		}
	}

}
