package StepDefinitio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome( ) {
		// Write code here that turns the 
		System.out.println("Este paso abre el google chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ricardo\\eclipse-workspace\\ReservaHoraCucuSele\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/ReservaHora3/");
	}
	
	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2 ) {
		// Write code here that turns the 
		System.out.println("En este paso integra las credenciales de usuario");
		System.out.println("Este paso ingresa las credenciales de usuario del login");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	@Then("inicia sesion")
	public void inicio_sesion() {
		// Write code here that turns the 
		System.out.println("Este paso inicia la sesion con los datos ingresados");
		driver.findElement(By.id("loginbtn")).click();
	}

}