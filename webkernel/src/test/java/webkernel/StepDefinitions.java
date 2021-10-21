package webkernel;

import org.openqa.selenium.By;		
import org.openqa.selenium.Keys;
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
        System.setProperty("webdriver.chrome.driver", "D://2021//1021-webcu//bdd03//webkernel//target//dependency//chromedriver.exe");					
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("http://demo.guru99.com/v4");	        
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 	{		
       driver.findElement(By.name("uid")).sendKeys("username12");							
       driver.findElement(By.name("password")).sendKeys("password12");							
   }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable {    		
        driver.findElement(By.name("btnReset")).click();					
    }		

    //-------------  A new Scenario -------------------------------------------------------------

    @Given("^Open Chrome set to google$")				
    public void open_chrome_set_to_google() throws Throwable	{		
        System.out.println("Open Chrome set to google");
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("https://google.com/ncr");	        
    }		

    @When("^Enter cheese into search$")					
    public void enter_cheese_into_search() throws Throwable 	{		
        System.out.println("Enter chees into search");
        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
        //driver.findElement(By.name("uid")).sendKeys("username12");							
        //driver.findElement(By.name("password")).sendKeys("password12");							
   }		

    @Then("^Hit enter$")					
    public void hit_enter() throws Throwable {    		
        System.out.println("Hit enter");
        //driver.findElement(By.name("btnReset")).click();					
    }		




}
