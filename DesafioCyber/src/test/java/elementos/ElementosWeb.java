package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// Register
		public By firstName = By.xpath("//input[@placeholder='First Name']");
		public By lastName = By.xpath("//input[@placeholder='Last Name']");
		public By endereco = By.xpath("//textarea[@rows='3']");
		public By email = By.xpath("//input[@ng-model='EmailAdress']");
		public By telefone = By.xpath("//input[@ng-model='Phone']");
		public By generoHomem = By.xpath("//input[@value='Male']");
		public By HobbieFilme = By.xpath("//input[@value='Movies']");
		public By language = By.xpath("//div[@id='msdd']");
		public By languageEN = By.xpath("//a[text()='English']");
		public By skill = By.xpath("//select[@id='Skills']");
		public By skillAndroid = By.xpath("//*[@id=\"Skills\"]/option[5]");
		public By country = By.xpath("//span[@role='presentation']");
		public By countryAustralia = By.xpath("//li[text()='Australia']");
		public By senha = By.xpath("//input[@id='firstpassword']");
		public By confSenha = By.xpath("//input[@id='secondpassword']");
		public By foto = By.xpath("//input[@type='file']");
	}

