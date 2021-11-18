import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject{

    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";
    private final String INCORRECT_USERNAME = "hola";
    private final String INCORRECT_PASSWORD = "hola";

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login_button;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement incorrectsInputs_errorMessagge;


    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(){
        this.username.sendKeys(USERNAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void pressLoginButton(){
        this.login_button.click();
    }

    public void enterIncorrectUserName(){
        this.username.sendKeys(INCORRECT_USERNAME);
    }
    
    public void enterIncorrectPassword(){
        this.password.sendKeys(INCORRECT_PASSWORD);
    }

    public String getIncorrectInputsMessage(){
        return this.incorrectsInputs_errorMessagge.getText();
    }

    public String getMessaggeLoginBtn(){
        return this.login_button.getAttribute("name");
    }
}
