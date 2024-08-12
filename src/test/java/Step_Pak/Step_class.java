package Step_Pak;

import Base_Pak.Base_Class;
import Pom_Pak.Pom_class;
import Runner_Pak.Runner_class;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Step_class extends Base_Class {
        WebDriver driver=Runner_class.driver;

        Pom_class pc =new Pom_class(driver);

        @Given("user  launches url and user is on home page")
        public void user_launches_url_and_user_is_on_home_page() {
                url(driver,"https://www.demoblaze.com/");
                maximize(driver);

        }
        @Given("user clicking the login button")
        public void user_clicking_the_login_button() {
                clk(pc.getLogin());

        }
        @When("user entering the valid {string}")
        public void user_entering_the_valid(String string) {
                implicitwait(driver);
                credentials(pc.getUsername(),string);

        }
        @When("user entering valid {string}")
        public void user_entering_valid(String string) {
                implicitwait(driver);
                credentials(pc.getPasword(),string);

        }
        @Then("user clicking  the signin button")
        public void user_clicking_the_signin_button() {
                clk(pc.getSignin());

        }








}




