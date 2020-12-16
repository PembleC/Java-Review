// Cucumber Hooks
// Carson Pemble
// 12/16/2020

@Before hooks will be run before the first step of each scenario under the feature
@After hooks will be run after the last step of each scenario under the feature



package utilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }

	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
