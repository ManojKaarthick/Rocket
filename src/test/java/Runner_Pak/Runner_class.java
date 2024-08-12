package Runner_Pak;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Manoj\\IdeaProjects\\Demo_Blaze\\src\\test\\java\\Feature",
               glue="Step_Pak",tags="@Tc1",dryRun = false)


public class Runner_class {

    public static WebDriver driver;

    @BeforeClass

    public static void Browser_open() {
        driver = new ChromeDriver();


    }
    
    @After class
    
    public static void Browser_close(){
        driver.close
    }
    
    
}