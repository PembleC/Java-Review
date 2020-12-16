// Sample Test Runner Class
// Carson Pemble
// 12/15/2020

package demos;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\demos"},
		glue={"src\\demos"},
		plugin={"html:src\\reports\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\reports\\rep2.json"},
		format = {"pretty"},
		format = {"html:Folder_Name"},			// generates an html report in the folder listed
		format = {"json:Folder_Name/cucumber.json"},		// Report with all Gherkin source in JSON
		format = {"junit:Folder_Name/cucumber.xml"},		// Report for CI Servers in XML

	}


		)
public class TaggedHooksRunner {

}

// Create new package called "reports"
// Run as Junit TestNg
// Refresh project
