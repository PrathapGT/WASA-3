package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(    
		
		features={".\\src\\test\\java\\features\\Myaccount.feature" },

		 glue={"stepdefinition"},//will bind feature file with step definition

			dryRun= false

		
		
		)





public class RunnerIO2 extends AbstractTestNGCucumberTests{

}
