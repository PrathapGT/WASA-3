package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {

	
	WebDriver driver=null;
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
		
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("I want to load the url")
	public void i_want_to_load_the_url() {
		
		driver.get("http://localhost:8888");
	}

	@When("Login page is displayed enter valid credentials")
	public void login_page_is_displayed_enter_valid_credentials() {
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}

	@When("click on Login")
	public void click_on_login() {
		
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("validate if Hommepage is displayed")
	public void validate_if_hommepage_is_displayed() {
		
		
		String exptitle="Administrator";
		
		String acttitle=driver.getTitle();
		
		if(acttitle.equals(exptitle)) {
			
			System.out.println("passed");
		}
		
		else {
			System.out.println("Fail");
		}
	}

	
}