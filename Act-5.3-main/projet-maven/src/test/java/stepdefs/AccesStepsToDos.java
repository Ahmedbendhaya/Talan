package stepdefs;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccesStepsToDos {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
			System.out.println("Inside Step - browser is open");		
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is : "+projectPath);			
		    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().window().maximize();				
	}

	@When("user put the link of the website")
	public void user_put_the_link_of_the_website() {
		System.out.println("Inside Step - user put the link");
		
		driver.navigate().to("http://todomvc.com/examples/react/#/");
	     
	}

	@Then("show homepage")
	public void show_homepage() {
		System.out.println("Inside Step - show homepage");
		driver.findElement (By.className ("new-todo")).isDisplayed();
		
	}
	
	
	@Given("user write(.*)$")
	public void user_write_what_you_needs_to_be_done(String entry) {
		
		driver.findElement (By.className("new-todo")).sendKeys(entry);
		
	   }

	@When("user hits enter")
	public void user_hits_enter() {
			
			driver.findElement (By.className("new-todo")).sendKeys(Keys.ENTER);
	}

	@Then("the element is added to the To do list")
	public void the_element_is_added_to_the_To_do_list() {
		boolean taskFlag = driver.getPageSource().contains("homework");
		assertEquals(true, taskFlag);			
	    
	}
	
	
	}


