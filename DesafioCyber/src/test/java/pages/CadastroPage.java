package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriversFactory;
import elementos.ElementosWeb;
import metodos.Metodos;

public class CadastroPage extends DriversFactory {

	Metodos metodos;
	ElementosWeb el = new ElementosWeb();

	public CadastroPage(WebDriver webDriver) {
		driver = webDriver;
		metodos = new Metodos(driver);
	}

	public void preencherDadosIniciais() throws InterruptedException {
		Thread.sleep(500);
		metodos.escrever(el.firstName, "Henrique");
		metodos.escrever(el.lastName, "Cassiano");
		metodos.escrever(el.endereco, "Av. Paulista");
		metodos.escrever(el.email, "teste@desafio.com");
		metodos.escrever(el.telefone, "1122334455");
	}

	public void generoHobbie() {
		metodos.clicar(el.generoHomem);
		metodos.clicar(el.HobbieFilme);
	}

	public void language() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]")).click();
	}

	public void skills() {
		WebElement dropBox = driver.findElement(By.id("Skills"));
		Select selectElement = new Select(dropBox);
		selectElement.selectByVisibleText("Android");
	}
	public void country(){
		WebElement boxCountry = driver.findElement(By.id("country"));
		Select selectElement = new Select(boxCountry);
		selectElement.selectByVisibleText("Australia");
		
	}
	
	public void aniversarioAno() {
		WebElement dropBox = driver.findElement(By.id("yearbox"));
		Select selectElement = new Select(dropBox);
		selectElement.selectByVisibleText("2001");
	}

	public void aniversarioMes() {
		WebElement boxMes = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select selectElement = new Select(boxMes);
		selectElement.selectByVisibleText("April");
	}

	public void aniversarioDia() {
		WebElement boxDia = driver.findElement(By.id("daybox"));
		Select selectElement = new Select(boxDia);
		selectElement.selectByVisibleText("20");
	}

	public void senhas() throws InterruptedException {
		metodos.escrever(el.senha, "12345");
		Thread.sleep(300);
		metodos.escrever(el.confSenha, "12345");
	}

	public void uploadFoto() throws Exception{
		Robot robot = new Robot();
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-6'][2]")).click();
		robot.setAutoDelay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\João Carlos\\Desktop\\Henrique\\Tecnologia\\modelocnh.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public void evidencia() {
		metodos.evidencia("Cadastro");
	}
}
