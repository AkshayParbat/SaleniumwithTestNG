package Globallogistic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CareerPage {
	
    String driverPath ="C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
	
	WebDriver driver = new ChromeDriver();
	
	 @BeforeTest
		void Navigate() throws InterruptedException
		{
		driver.get("https://globallogistic.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		}
      
	 @Test(priority=1)
		void TopNavCareers1() throws InterruptedException
		{
		 
		 WebElement Careers = driver.findElement(By.xpath("//span[normalize-space()='Careers']"));
		 boolean displayed69 = Careers.isDisplayed();
		 System.out.println(displayed69);
		 Careers.click();
			Thread.sleep(2000);	
		}
	 
	 @Test(priority=2)
		void CareersHeading() throws InterruptedException
		{
		 WebElement CareerHeading = driver.findElement(By.xpath("//h3[normalize-space()='Career']")); 
			boolean displayed70 = CareerHeading.isDisplayed();
			System.out.println(displayed70);
		}
	 
	 @Test(priority=3)
		void CareersIamge() throws InterruptedException
		{
		 WebElement CareerImage = driver.findElement(By.xpath("//img[contains(@title,'career')]")); 
			boolean displayed71 = CareerImage.isDisplayed();
			System.out.println(displayed71);
		}
	  
	 @Test(priority=4)
		void CareersContain() throws InterruptedException
		{
		 WebElement CareerContain = driver.findElement(By.xpath("//p[contains(text(),'Join the leading brand in shipping and logistics t')]")); 
			boolean displayed72 = CareerContain.isDisplayed();
			System.out.println(displayed72);
			
			 WebElement CareerApply = driver.findElement(By.xpath("//strong[normalize-space()='Apply Now!']")); 
			 boolean displayed73 = CareerApply.isDisplayed();
				System.out.println(displayed73);	
	
		}

	 
	 @Test(priority=5)
		void FormHeading() throws InterruptedException
		{
		WebElement CareerFormHeading = driver.findElement(By.xpath("//h3[normalize-space()='Fill Your Details']")); 
	     boolean displayed74 = CareerFormHeading.isDisplayed();
		System.out.println(displayed74);
	 
		}
	 @Test(priority=6)
		void FormFillup() throws InterruptedException
		{
		 WebElement AddYourName = driver.findElement(By.xpath("//input[contains(@name,'your-name')]")); 
		 AddYourName.click();
		 AddYourName.sendKeys("Akshay");
		 
		 WebElement YourEmail = driver.findElement(By.xpath("//input[@name='your-email']")); 
		 YourEmail.click();
		 YourEmail.sendKeys("test.parbatakshay022@gmail.com");
		 
		 WebElement ContactNo = driver.findElement(By.xpath("//input[@name='your-email']")); 
		 ContactNo.click();
		 ContactNo.sendKeys("9970783941");
		 
		 WebElement YourEmail1 = driver.findElement(By.xpath("//input[@name='your-email']")); 
		 YourEmail1.click();
		 YourEmail1.sendKeys("test.parbatakshay022@gmail.com");
		 
		 WebElement ChooseFile = driver.findElement(By.xpath("//input[@name='file-877']"));
			ChooseFile.sendKeys("E:\\Pictures\\Saved Pictures\\images.jfif");
        
			
			WebElement Subject = driver.findElement(By.xpath("//input[@name='your-subject']")); 
			Subject.click();
			Subject.sendKeys("TestSubject");
			
			WebElement Message = driver.findElement(By.xpath("//textarea[@name='your-message']")); 
			Message.click();
			Message.sendKeys("TestMessage test message test message");
			
		
			WebElement Submit = driver.findElement(By.xpath("//input[@value='Send']"));
			Submit.click();
		}
	 
}
