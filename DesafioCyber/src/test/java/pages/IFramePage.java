package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import drivers.DriversFactory;

public class IFramePage extends DriversFactory{
	
	
	
	public void selecionarFrame(WebDriver driver) {
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		WebElement caixaTexto = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		caixaTexto.sendKeys("Desafio");
	}

	
}
