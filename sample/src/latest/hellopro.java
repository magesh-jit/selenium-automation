package latest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class hellopro {

	public static void main(String[]args) throws InterruptedException, IOException
	{
		System.out.println("hello ji");
		System.setProperty("webdriver.chrome.driver.", "/All details/Desktop files/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Login the application
		driver.get("https://dev2639.medicalbook.in/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("sukul@mailinator.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Navigate to  Upload /Edit Data and click it
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@href='addMedicalHistory']")).click();	
		
		//Thread.sleep(5000);
		//Click to add new medical history and enter ongoing conditions values
		driver.findElement(By.xpath("//a[@id='medicalHistoryAdd']")).click();	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("cond");
		WebElement press=driver.findElement(By.xpath("(//select[@name='yos1[]'])[1]"));
		Select s=new Select(press);
		s.selectByValue("2020");
		
		//Add one more ongoing conditions values
		driver.findElement(By.xpath("//button[@class='btn btn-default addButton1']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("qwerty");
		WebElement tress=driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select t=new Select(tress);
		t.selectByValue("2018");
		Thread.sleep(5000);
		
		//Navigate to ongoing treatments  and enter values
		driver.findElement(By.xpath("(//input[@name='ctname[]'])[1]")).sendKeys("abc");
		 WebElement cress=driver.findElement(By.xpath("(//select[@name='times1[]'])[1]"));
		 Select c=new Select(cress);
		 c.selectByValue("2");
		 WebElement bress=driver.findElement(By.xpath("(//select[@name='times2[]'])[1]"));
		 Select b=new Select(bress);
		 b.selectByValue("3");
		 WebElement qress=driver.findElement(By.xpath("(//select[@name='times3[]'])[1]"));
		 Select q=new Select(qress);
		 q.selectByValue("3");
		 driver.findElement(By.xpath("(//input[@name='bfaf[]'])[1]")).sendKeys("abcd");
		 Thread.sleep(5000);
		 
		 //Add one more ongoing treatments values
		 driver.findElement(By.xpath("(//button[@class='btn btn-default addButton2'])[1]")).click();
		 driver.findElement(By.xpath("(//input[@name='ctname[]'])[2]")).sendKeys("abcde");
		 WebElement yress=driver.findElement(By.xpath("(//select[@name='times1[]'])[2]"));
		 Select y=new Select(yress);
		 y.selectByValue("2");
		 WebElement oress=driver.findElement(By.xpath("(//select[@name='times2[]'])[2]"));
		 Select o=new Select(oress);
		 o.selectByValue("1");
		 WebElement mress=driver.findElement(By.xpath("(//select[@name='times3[]'])[2]"));
		 Select m=new Select(mress);
		 m.selectByValue("0");
		 driver.findElement(By.xpath("(//input[@name='bfaf[]'])[2]")).sendKeys("abcdef");
		 
		//Navigate to past events and enter values 
		 driver.findElement(By.xpath("(//input[@name='event[]'])[1]")).sendKeys("abcdefg");
		 WebElement kress=driver.findElement(By.xpath("(//select[@name='yos2[]'])[1]"));
		 Select k=new Select(kress);
		 k.selectByValue("2015");
	
		 //Add one more past events  values
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@class='btn btn-default addButton3']")).click();
		 driver.findElement(By.xpath("(//input[@name='event[]'])[2]")).sendKeys("abcdefgh");
		 WebElement zress=driver.findElement(By.xpath("(//select[@name='yos2[]'])[2]"));
		 Select z=new Select(zress);
		 z.selectByValue("2014");
		 
		 //Navigate to allergies and enter values
		 Thread.sleep(7000);
		 driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("allergies");
		 driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("medium");
		 driver.findElement(By.xpath("(//input[@name='description[]'])[1]")).sendKeys("small description");

		 //Add one more allergies values
		 driver.findElement(By.xpath("//button[@class='btn btn-default addButton4']")).click();
		 driver.findElement(By.xpath("//input[@data-bv-field='Allergy[]']")).sendKeys("bllergies");
		 driver.findElement(By.xpath("//input[@data-bv-field='Severity[]']")).sendKeys("low");
		 driver.findElement(By.xpath("//input[@data-bv-field='description[]']")).sendKeys("large description");
		 
		 
		 //Choose past date
		driver.findElement(By.xpath("//input[@class='form-control dp']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[@class='day'])[26]")).click();
		driver.findElement(By.xpath("(//button[@id='submitMedicalHistory'])[1]")).click();
		
		driver.navigate().refresh();
		
		//Click edit button
		driver.findElement(By.xpath("//button[@title='Edit']")).click();
		
		//Taking screenshot of edit page
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("D://All details//Desktop files//edit.jpeg");
		FileUtils.copyFile(src, dst);
		
		
		


		 
		
		
		
		}
}
