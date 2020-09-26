package stepDefinations;





import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinations {
	public WebDriver driver;
	
    @Given("^User is on greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Heavenly\\Documents\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
      
    }

    @When("^User search for \"([^\"]*)\" vegetables$")
    public void user_search_for_something_vegetables(String strArg1) throws Throwable {
    	// //tagname[@attribute= 'value']
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" result are displayed$")
    public void something_result_are_displayed(String strArg1) throws Throwable {
       
    driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1);
       
    }

}



