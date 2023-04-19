package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@cadastro",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)

public class Executa {

	public static WebDriver abrirNavegador(String pagina) {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    DesiredCapabilities dp = new DesiredCapabilities();
	    dp.setCapability(ChromeOptions.CAPABILITY, options);
	    options.merge(dp);
	    driver.get("https://demo.automationtesting.in/"+ pagina +".html");
	    return driver;
	
	}
}
