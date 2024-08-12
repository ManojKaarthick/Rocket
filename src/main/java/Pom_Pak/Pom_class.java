package Pom_Pak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
    public static WebDriver driver;

    public Pom_class(WebDriver driver1){
    this.driver=driver1;
        PageFactory.initElements(driver,this);

    }



     @FindBy(xpath="//a[text()='Log in']")
     private WebElement login;

     @FindBy(xpath = "//input[@id=\"loginusername\"]")
    private WebElement username;


    public WebElement getLogin() {
        return login;
    }

    public void setLogin(WebElement login) {
        this.login = login;
    }

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getPasword() {
        return pasword;
    }

    public void setPasword(WebElement pasword) {
        this.pasword = pasword;
    }

    public WebElement getSignin() {
        return signin;
    }

    public void setSignin(WebElement signin) {
        this.signin = signin;
    }

    @FindBy(xpath="(//input[@type=\"password\"])[2]")
    private WebElement pasword;


     @FindBy(xpath="//button[text()='Log in']")
    private WebElement signin;


}
