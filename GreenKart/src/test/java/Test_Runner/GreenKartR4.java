package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Features\\GreenKart4.feature",
		glue= {"Step_Definitions"}
		)
public class GreenKartR4 {

	
	
}
