package steps;

import drivers.DriversFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.DatePickerPage;
import runner.Executa;

public class DatePickerTest extends DriversFactory{
	
	DatePickerPage datePg = new DatePickerPage();
	Metodos metodos;
	
	public DatePickerTest() {
		driver = Executa.abrirNavegador("Datepicker");
		metodos = new Metodos(driver);
	}


	@Given("que eu esteja na aba de datepicker")
	public void queEuEstejaNaAbaDeDatepicker() {
	metodos.pausa(100);
	}
	
	@When("selecionar meu aniversario no primeiro calendario")
	public void selecionarMeuAniversarioNoPrimeiroCalendario() throws InterruptedException {
	 datePg.datePicker1(driver);
	}
	@When("no segundo calendario")
	public void noSegundoCalendario() {
	datePg.datePicker2(driver);
	}
	
	@Then("tiro uma evidencia")
	public void tiroUmaEvidencia() {
	   metodos.evidencia("datePicker");
	}

	@Then("fecho o site")
	public void fechoOSite() {
	   metodos.fecharSite();
	}



}
