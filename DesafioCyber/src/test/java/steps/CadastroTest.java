package steps;

import drivers.DriversFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.CadastroPage;
import runner.Executa;

public class CadastroTest extends DriversFactory {

	private CadastroPage cadastroPg;
	Metodos metodos;

	public CadastroTest() {
		cadastroPg = new CadastroPage(driver);
		driver = Executa.abrirNavegador("Register");
		metodos = new Metodos(driver);
	}

	@Given("que eu esteja na pagina de cadastro")
	public void queEuEstejaNaPaginaDeCadastro() {
		metodos.pausa(200);
	}

	@Given("preencher as informacoes iniciais")
	public void preencherAsInformacoesIniciais() throws Exception {
		cadastroPg.preencherDadosIniciais();
	}

	@Given("selecionar genero e hobbie")
	public void selecionarGeneroEHobbie() {
		cadastroPg.generoHobbie();
	}

	@Given("informar ling skill pais e data")
	public void informarLingSkillPaisEData() throws InterruptedException {
		cadastroPg.language();
		cadastroPg.skills();
		cadastroPg.country();
		cadastroPg.aniversarioAno();
		cadastroPg.aniversarioMes();
		cadastroPg.aniversarioDia();
	}

	@Given("informar as senhas")
	public void informarAsSenhas() throws InterruptedException {
		cadastroPg.senhas();
	}

	@When("fizer upload da foto")
	public void fizerUploadDaFoto() throws Exception {
		cadastroPg.uploadFoto();
	}

	@Then("tiro uma evidencia do cadastro completo")
	public void tiroUmaEvidenciaDoCadastroCompleto() {
		cadastroPg.evidencia();
	}

	@Then("encerro o site")
	public void encerroOSite() {
		metodos.fecharSite();
	}

}
