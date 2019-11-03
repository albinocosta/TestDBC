package Test;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abrirnavegadores {

	// instanciando a classe webdriver
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// dizer onde está o exe do driver
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close(); // fecha aba utilizada

	}

}
