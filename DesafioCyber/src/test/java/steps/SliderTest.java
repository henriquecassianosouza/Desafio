package steps;

import drivers.DriversFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.SliderPage;
import runner.Executa;

public class SliderTest extends DriversFactory {
	SliderPage slPg = new SliderPage();
	Metodos metodos;

	public SliderTest() {
		driver = Executa.abrirNavegador("Slider");
		metodos = new Metodos(driver);

	}

	@Given("que eu esteja na pagina do slider")
	public void queEuEstejaNaPaginaDoSlider() {
		metodos.pausa(200);
	}

	@When("deslizar a barra")
	public void deslizarABarra() throws InterruptedException {
		slPg.deslizarSlider(driver);
	}

	@When("tirar uma evidencia da tela")
	public void tirarUmaEvidenciaDaTela() {
		metodos.evidencia("slider");
	}

	@Then("fecho a aba")
	public void fechoAAba() {
		metodos.fecharSite();
	}

}
