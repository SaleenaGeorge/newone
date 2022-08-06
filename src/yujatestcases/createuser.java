package yujatestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createuser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://staging-demo.yuja.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("loginuserid")).sendKeys("saleena_george");
		driver.findElement(By.id("password")).sendKeys("aiden1noah2!");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("mainMenuBtn")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title=\"Admin Panel - Manage organization options\"]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Roster']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@title='Create User']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("rosterNewUserFirstName")).sendKeys("autosaleena1");
		driver.findElement(By.id("rosterNewUserLastName")).sendKeys("instructor");
		driver.findElement(By.id("rosterNewUserEmail")).sendKeys("saleena.george+autosaleena1@yuja.com");
		driver.findElement(By.id("rosterNewUserUserID")).sendKeys("autosaleena1_instructor");
		driver.findElement(By.id("rosterNewUserStudentID")).sendKeys("autosaleena1_instructor");
		driver.findElement(By.id("rosterNewUserPassword")).sendKeys("Saleena.george+autosaleena1@yuja.com1");
		driver.findElement(By.id("rosterNewUserPassword2")).sendKeys("Saleena.george+autosaleena1@yuja.com1");
		
		
		
		WebElement dropdown=driver.findElement(By.id("rosterNewUserTypeSelect"));
		Select sele=new Select(dropdown);
		sele.selectByValue("Instructor");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='Confirm']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@title='No, do it later']")).click();
		
		
		
	}

}
