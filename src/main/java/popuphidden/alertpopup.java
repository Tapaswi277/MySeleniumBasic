package popuphidden;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		
		d.get("https://magnus.jalatechnologies.com/");
		d.manage().window().maximize();
		WebElement username=d.findElement(By.id("UserName"));
		username.sendKeys("training@jalaacademy.com");
		Thread.sleep(3000);


		WebElement password=d.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("jobprogram");
		Thread.sleep(3000);


		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		WebElement moretab=d.findElement(By.linkText("More"));
		moretab.click();
		Thread.sleep(3000);
		
		WebElement popup=d.findElement(By.linkText("Popups"));
		popup.click();
		Thread.sleep(3000);
		
		WebElement confirmpopup=d.findElement(By.name("confirm"));
		confirmpopup.click();
		
		Alert alertpopup=d.switchTo().alert();
		Thread.sleep(3000);
		alertpopup.accept();
		
		
	}

}