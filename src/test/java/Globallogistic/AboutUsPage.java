package Globallogistic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutUsPage {

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
		void TopNavAboutUs() throws InterruptedException
		{
		 
		    WebElement AboutUs = driver.findElement(By.xpath("//span[normalize-space()='About']")); 
			boolean displayed = AboutUs.isDisplayed();
			System.out.println(displayed);
			AboutUs.click();
			Thread.sleep(2000);
		}
	 
	 @Test(priority=2)
		void TopNavAboutUsBanner() throws InterruptedException
		{
		 
		    WebElement BannerAboutUs = driver.findElement(By.xpath("//img[@title='team-office']")); 
			boolean displayed31 = BannerAboutUs.isDisplayed();
			System.out.println(displayed31);	
		}
	 @Test(priority=3)
		void MeetOurTeamHeading() throws InterruptedException
		{
		 
		    WebElement Heading = driver.findElement(By.xpath("//h2[contains(@class,'av-special-heading-tag')]")); 
			boolean displayed32 = Heading.isDisplayed();
			System.out.println(displayed32);
			
		}
	 
	 
	 @Test(priority=4)
		void CeoInformation() throws InterruptedException
		{
		 
			WebElement CeoImage = driver.findElement(By.xpath("//img[@alt='Ajay Pratap Singh']")); 
			boolean displayed33 = CeoImage.isDisplayed();
			System.out.println(displayed33);
			
			WebElement CeoInfo = driver.findElement(By.xpath("//p[contains(text(),'Started Global Logistic Service in 2002, it')]")); 
			boolean displayed35 = CeoInfo.isDisplayed();
			System.out.println(displayed35);
			
			WebElement CeoName = driver.findElement(By.xpath("//strong[normalize-space()='Ajay Pratap Singh']")); 
			boolean displayed36 = CeoName.isDisplayed();
			System.out.println(displayed36);
	
		}
	 
	 @Test(priority=5)
		void ManagerInformation() throws InterruptedException
		{
		 WebElement CeoImage = driver.findElement(By.xpath("//img[contains(@alt,'Sharad_kumar_singh')]")); 
			boolean displayed37 = CeoImage.isDisplayed();
			System.out.println(displayed37);
			
			WebElement ManagerInfo = driver.findElement(By.xpath("//p[contains(text(),'s been an immense delight to work in this organisa')]")); 
			boolean displayed38 = ManagerInfo.isDisplayed();
			System.out.println(displayed38);
			
			WebElement ManagerName = driver.findElement(By.xpath("//h3[normalize-space()='Sharad Kumar Singh']")); 
			boolean displayed39 = ManagerName.isDisplayed();
			System.out.println(displayed39);
		}
	 
	 @Test(priority=6)
		void HRInformation() throws InterruptedException
		{
		 WebElement HRImage = driver.findElement(By.xpath("//img[contains(@alt,'ufran_khan')]")); 
			boolean displayed40 = HRImage.isDisplayed();
			System.out.println(displayed40);
			
			WebElement HRInfo = driver.findElement(By.xpath("//h3[normalize-space()='Gufran khan']")); 
			boolean displayed41 = HRInfo.isDisplayed();
			System.out.println(displayed41);
			
			WebElement HRName = driver.findElement(By.xpath("//p[contains(text(),'I believe in the power of this brand for the past ')]")); 
			boolean displayed42 = HRName.isDisplayed();
			System.out.println(displayed42);
			
			driver.quit();
		}
}
	 
