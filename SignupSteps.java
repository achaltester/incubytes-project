package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.SignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupSteps {
    WebDriver driver;
    SignupPage signupPage;

    @Given("user is on the signup page")
    public void user_on_signup_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        signupPage = new SignupPage(driver);
    }

    @When("user enters valid first name, last name, email and password")
    public void enter_valid_details() {
        signupPage.enterFirstName("Achal");
        signupPage.enterLastName("Tester");
        signupPage.enterEmail("achalt" + System.currentTimeMillis() + "@test.com");
        signupPage.enterPassword("Testing@123");
        signupPage.enterConfirmPassword("Testing@123");
    }

    @When("user submits the signup form")
    public void submit_form() {
        signupPage.clickCreateAccount();
    }

    @Then("user should be registered successfully")
    public void registration_successful() {
        System.out.println("Account creation success message should be displayed.");
        driver.quit();
    }
}