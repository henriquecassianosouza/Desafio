package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import drivers.DriversFactory;

public class DatePickerPage extends DriversFactory {

	
	
	public void datePicker2(WebDriver driver) {
		driver.findElement(By.id("datepicker2")).sendKeys("04/20/2001");
	    driver.findElement(By.id("datepicker2")).sendKeys(Keys.ENTER);
	}

	public void datePicker1(WebDriver driver) {
		String mesAno = "April 2001";

		driver.findElement(By.id("datepicker1")).click();
		

		while (true) {
			String textoMesAno = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();

			if (textoMesAno.equals(mesAno)) {
				break;
			} else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
			}
		}
		// data dia aniversario
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]")).click();
		
	}

}
