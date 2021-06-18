package runner;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests; 
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/Features"},
							glue= {"Steps"},monochrome=true, 
							tags = {"@sanity, @Functional"}
							)
public class Runner extends AbstractTestNGCucumberTests{
	
}
