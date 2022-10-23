package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features ="src/test/java/features/Login.feature", //features file path
	glue="steps",                                //steps defination pacakage name
	//dryRun=true ,                            //mapping in feature file with stepsdefianation defalt false
	stepNotifications=true ,         //stepwise result status defalt true
	monochrome=true             //clean report genrate
)
public class TestRunner
{

}
