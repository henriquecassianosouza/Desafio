package steps;

import drivers.DriversFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.IFramePage;
import runner.Executa;

public class IFrameTest extends DriversFactory{

	IFramePage framePage = new IFramePage();
	Metodos metodos;
	
	public IFrameTest() {
		driver = Executa.abrirNavegador("Frames");
		metodos = new Metodos(driver);
	}

	@Given("que eu esteja na pagina do frame")
	public void queEuEstejaNaPaginaDoFrame() {
		metodos.pausa(100);
	}

	@When("acessar a caixa html")
	public void acessarACaixaHtml() {
		framePage.selecionarFrame(driver);
	}


	@Then("tiro uma evidencia da tela")
	public void tiroUmaEvidenciaDaTela() {
       metodos.evidencia("frame");
       metodos.fecharSite();
	}

}
