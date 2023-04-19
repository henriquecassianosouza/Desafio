package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import drivers.DriversFactory;

public class SliderPage extends DriversFactory{
	
	public void deslizarSlider(WebDriver driver) throws InterruptedException {
		WebElement slider = driver.findElement(By.cssSelector("#slider > a"));
		WebElement barraFundo = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		System.out.println(barraFundo.getRect().width + " - "+barraFundo.getSize().width);
		Thread.sleep(500);
		Actions actions = new Actions(driver);
		Thread.sleep(500);
		actions.clickAndHold(slider).moveByOffset((barraFundo.getSize().width/2),0).release().perform();
		slider.click();
	}

}
