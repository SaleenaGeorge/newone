package yujatestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogout {

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
		driver.findElement(By.id("bi_userInfoDropdown")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("logoutText")).click();
		

	}

}