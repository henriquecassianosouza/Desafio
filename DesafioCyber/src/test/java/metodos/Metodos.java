package metodos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivers.DriversFactory;

public class Metodos extends DriversFactory{
	
	public Metodos(WebDriver webDriver) {
		driver = webDriver;
	}

	/**
	 * metodo para tirar evidencia passando nome que vc deseja no arquivo
	 * @param nomeEvidencia
	 */
	public void evidencia(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * metodo para fechar o browser
	 */
	public void fecharSite() {
		driver.quit();
	}
	/**
	 * metodo para clicar em algum elemento passando By
	 * @param elemento
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	/**
	 * metodo para escrever em elemento passando By e texto desejado
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	/**
	 * metodo para pausar aplicacao passando tempo desejado
	 */
	public void pausa(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * metodo para fazer upload de arquivo passando caminho e tempo de espera 
	 * @param path
	 * @param tempo
	 */
	public void upload(String path, int tempo) {
		try {
			Robot robot = new Robot();
			StringSelection ss = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(tempo);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(tempo);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
}
