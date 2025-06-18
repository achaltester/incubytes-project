package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;

    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By email = By.id("email_address");
    By password = By.id("password");
    By confirmPassword = By.id("password-confirmation");
    By createButton = By.cssSelector("button[title='Create an Account']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void enterEmail(String emailAddr) {
        driver.findElement(email).sendKeys(emailAddr);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        driver.findElement(confirmPassword).sendKeys(cpwd);
    }

    public void clickCreateAccount() {
        driver.findElement(createButton).click();
    }
}