package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
					 System.setProperty("webdriver.chrome.driver","C:\\Users\\Hajrul Fathima\\Desktop\\phase 5\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						
						driver.get("http://demo.guru99.com/test/newtours/register.php");	
						
						driver.manage().window().maximize();
						
						System.out.println("Title:"+driver.getTitle());
						
						System.out.println("------------------------");
						
						
						//entering the first name
						driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("HAJRUL");
						Thread.sleep(10000);
						//entering the last name
						driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("H");Thread.sleep(10000);
						//entering the phone number
						driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7339536170");Thread.sleep(10000);
						//entering the email id
						WebElement email=driver.findElement(By.id("userName"));
						email.sendKeys("hajrul@gmail.com");
						Thread.sleep(10000);
						//entering the address
						driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("153, JEEVA NAGAR");Thread.sleep(10000);
						//entering the city
						driver.findElement(By.xpath("//input[@name='city']")).sendKeys("TIRUVANNAMALAI");Thread.sleep(10000);
						//entering the state
						driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamilnadu");Thread.sleep(10000);
						//entering the postal code
						driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("606601");Thread.sleep(10000);
						//selecting the country from dropdown list
						Select drpCountry = new Select(driver.findElement(By.name("country")));
						drpCountry.selectByVisibleText("INDIA");
						Thread.sleep(10000);
						//entering the username
						WebElement user=driver.findElement(By.id("email"));
						user.sendKeys("hajrul@gmail.com");
						Thread.sleep(10000);
						//entering the password
						driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");Thread.sleep(1000);
						//re-enter the password
						driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");Thread.sleep(1000);
						//submit
						driver.findElement(By.xpath("//input[@name='submit']")).click();
						Thread.sleep(3000);
						
						
						//-----------------SIGN IN PAGE--------------------//
						
						driver.get("https://demo.guru99.com/test/newtours/login.php");
						driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("hajrul@gmail.com");Thread.sleep(1000);
						driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");Thread.sleep(1000);
						driver.findElement(By.xpath("//input[@name='submit']")).click();
						Thread.sleep(10000);
						driver.quit();
						System.out.println("Testing done successfully");
						
						
			}

		}


	


