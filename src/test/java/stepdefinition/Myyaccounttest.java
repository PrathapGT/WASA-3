package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Myyaccounttest {

	
	WebDriver driver=null;
	@Given("I want to Launch the browser")
	public void i_want_to_launch_the_browser() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		
	}
	@When("Homepage of qafox is displayed navigate to myaccount icon")
	public void homepage_of_qafox_is_displayed_navigate_to_myaccount_icon() {
		
		driver.findElement(By.xpath("//span[@class='caret']")).click();

		
	}
	@When("click on icon")
	public void click_on_icon() {
		
		
		
		
	}
	@Then("then validate if myaccount dropdown is displayed")
	public void then_validate_if_myaccount_dropdown_is_displayed() {
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
