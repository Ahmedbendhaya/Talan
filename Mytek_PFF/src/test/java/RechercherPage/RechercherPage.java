package RechercherPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RechercherPage {
	WebDriver driver; 
	By Search_btn = By.id("search");
	By Item_displayed = By.className("amsearch-autocomplete-image");
	
	
	public void Rechercher (WebDriver driver) {
		this.driver=driver;
	}
	
	public void OpenPage() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);			
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mytek.tn");
		System.out.print(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Boxsearch() {
		driver.findElement(Search_btn).click();
	}
	
	
	public void AddSearchParameter(String parameter) throws InterruptedException {
		driver.findElement(Search_btn).sendKeys(parameter);
		Thread.sleep(2000);
		driver.findElement(Search_btn);
		Thread.sleep(2000);
		driver.findElement(Search_btn).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		
		if (driver.findElement(By.xpath("//*[@id=\"amasty-shopby-product-list\"]/div/div/div/div[2]/div/div/a/span[1]")).getText().contains("PC")==true) {
			System.out.print("item found");
		}
		else System.out.println("item not found");
		driver.quit();
	}
		
		
	public void SelectElement() throws InterruptedException {
		driver.findElement(Item_displayed).click();
		Thread.sleep(2000);	
	}
	public void VerifyTheItemSelected(String URL) {
		String VerifyItem= driver.getCurrentUrl();
		if(VerifyItem.contains(URL)==true) {
			System.out.print("Article trouvé en utilisant ce paramétre");
			driver.close();
		}
		else {
			driver.findElement(null);
			System.out.print("la page de l article n'est accesible");
			System.out.print("Echec du scénario");
			driver.close();
			}
	}
}
