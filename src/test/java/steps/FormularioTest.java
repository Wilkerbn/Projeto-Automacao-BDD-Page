package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.EnviaFormularioPage;
import pages.InfoFormPage;
import pages.LoginPage;
import suport.Web;

public class FormularioTest {

	WebDriver driver = null;

	@Dado("^que estou na aplicação$")
	public void queEstouNaAplicação() {
		driver = Web.createChrome();
	}

	@Quando("^informo o login \"([^\"]*)\"$")
	public void informoOLogin(String login) {
		new LoginPage(driver).login(login);
	}

	@Quando("^seleciono em avançar$")
	public void selecionoEmAvançar() throws Exception {
		new LoginPage(driver).btnEntrar();
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String senha) {
		new LoginPage(driver).senha(senha);
	}

	@Quando("^seleciono em entrar$")
	public void selecionoEmEntrar() throws Exception {
		new LoginPage(driver).btnEntrar();
	}

	@Quando("^seleciono na opção sim para continuar conectado$")
	public void selecionoNaOpçãoSimParaContinuarConectado() {
		new LoginPage(driver).btnAceitar();
	}

	@Quando("^preencho o primeiro nome \"([^\"]*)\"$")
	public void preenchoOPrimeiroNome(String nome) {
		new InfoFormPage(driver).campoNome(nome);
	}

	@Quando("^preencho o sobrenome \"([^\"]*)\"$")
	public void preenchoOSobrenome(String sobrenome)  {
		new InfoFormPage(driver).campoSobrenome(sobrenome);
	}

	@Quando("^seleciono a empresa que trabalho$")
	public void selecionoAEmpresaQueTrabalho() {
		new InfoFormPage(driver).selecioneEmpresa();
	}

	@Quando("^avalio o meu ambiente de trabalho$")
	public void avalioOMeuAmbienteDeTrabalho() {
		new InfoFormPage(driver).avalioEmpresa();
	}

	@Quando("^insiro a data de nascimento$")
	public void insiroADataDeNascimento() {
		new InfoFormPage(driver).insiroDataNascimento();
	}

	@Quando("^seleciono as linguagens de programação que conheço$")
	public void selecionoAsLinguagensDeProgramaçãoQueConheço() {
		new InfoFormPage(driver).selecionoLinguagens();
	}

	@Quando("^seleciono o botão enviar$")
	public void selecionoOBotãoEnviar() {
		new EnviaFormularioPage(driver).enviarFormulario();
	}

	@Então("^devo receber a mensagem \"([^\"]*)\"$")
	public void devoReceberAMensagem(String mensagemConfirmacaoEnvio) {
		new EnviaFormularioPage(driver).recebeMensagemConfirmacao(mensagemConfirmacaoEnvio);
	}
	
	@After
	public void screenshot() {
	
	}
	
	@After
	public void fechar() {
		driver.quit();
	}

}
