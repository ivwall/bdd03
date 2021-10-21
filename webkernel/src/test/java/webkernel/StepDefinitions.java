package webkernel;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
     
    WebDriver driver;	

    @Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable	{		
        System.out.println("This Step open the Firefox and launch the application.");					
        System.setProperty("webdriver.chrome.driver", "D://2021//1021-webcu//bdd03//webkernel//target//dependency//chromedriver.exe");					
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("http://demo.guru99.com/v4");	        
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 	{		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable {    		
        System.out.println("This step click on the Reset button.");					
    }		

}
