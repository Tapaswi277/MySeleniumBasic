package popuphidden;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childwindowpopup {

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
		
		WebElement onewindow=d.findElement(By.id("btn-one"));
		onewindow.click();
		
		Set <String> windows=d.getWindowHandles();
		System.out.println(windows);
		
		Iterator <String> itr=windows.iterator();
		String mainwindow=itr.next();
		System.out.println("Main window id is"+mainwindow);
		String childwindow=itr.next();
		System.out.println("Child window id is"+childwindow);
		Thread.sleep(3000);

		d.switchTo().window(childwindow);
		d.manage().window().maximize();
		
		WebElement clickongmail=d.findElement(By.linkText("Gmail"));
		clickongmail.click();
		
		String url=d.getCurrentUrl();
		d.switchTo().window(mainwindow);
		WebElement clickonconfirm=d.findElement(By.name("confirm"));
		clickonconfirm.click();
	}

}
