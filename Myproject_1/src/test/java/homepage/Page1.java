package homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page1 {
	
	@Test
	public void TestNike() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/cart");
		driver.findElement(By.id("VisualSearchInput")).sendKeys("sadansahin",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
	
   
}

}
