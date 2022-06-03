import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) throws InterruptedException, IOException {
	
//Register Scenario 1
WebDriverManager.chromedriver().driverVersion("102.0.5005.61").setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); 
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.navigate().to("http://demo.guru99.com/test/newtours/");
System.out.print(driver.getCurrentUrl());
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("ahmed");
driver.findElement(By.name("lastName")).sendKeys("ben dhaya");
driver.findElement(By.name("phone")).sendKeys("55485815");
driver.findElement(By.name("userName")).sendKeys("ahmed.baha.eddine@talan.com");
driver.findElement(By.name("address1")).sendKeys("46 rue de lenvironnement");
driver.findElement(By.name("city")).sendKeys("hammam lif");
driver.findElement(By.name("state")).sendKeys("ben arous");
driver.findElement(By.name("postalCode")).sendKeys("2050");
driver.findElement(By.name("country")).sendKeys("TUNISIA");
driver.findElement(By.id("email")).sendKeys("ahmedben");
driver.findElement(By.name("password")).sendKeys("22080023Ah");
driver.findElement(By.name("confirmPassword")).sendKeys("22080023Ah");
driver.findElement(By.name("submit")).click();
System.out.print(driver.getCurrentUrl());
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile, new File("./image.png"));
Thread.sleep(5000);

//Scenario 2
 driver.findElement(By.linkText("SIGN-OFF")).click();
 driver.findElement(By.linkText("SIGN-ON")).click();
 driver.findElement(By.name("userName")).sendKeys("ahmedbendhaya");
 driver.findElement(By.name("password")).sendKeys("22080023Ah");
 driver.findElement(By.name("submit")).click();
 System.out.print(driver.getCurrentUrl());
 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(scrFile1, new File("./image1.png"));
Thread.sleep(20000);
driver.close();
	}

}
