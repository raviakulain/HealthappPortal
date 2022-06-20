import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Login.feature"},
        plugin = {"pretty","html:target/report.html"}
        // dryRun = true,
       //  monochrome = true
)
public class TestRunner
{

}

