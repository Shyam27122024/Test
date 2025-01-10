package ABC;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Shyam\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.get("http://192.168.154.183:8080/DIYPortal/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[text()=' New Transaction']")).click();
	    driver.findElement(By.xpath("//button[text()=' New Transaction']")).click();
	    
	 
//	    WebElement MobNo = driver.findElement(By.id("txtMobileNumber_KYC"));
//	    MobNo.sendKeys("9145043837");
//	    WebElement Aadhar = driver.findElement(By.id("txtAadhaarNumber_KYC"));
//	    Aadhar.sendKeys("872882405897");
//	    
////	    driver.findElement(By.xpath("//*[@id='file_KYCVerification_Doclist3_1']/parent::div")).click();
//	   
//	    driver.findElement(By.xpath("//*[@id='file_KYCVerification_Doclist3_1']/parent::div")).click();
//	    
//	    ProcessBuilder processBuilder = new ProcessBuilder("D:\\Shyam\\FileUploadScript.exe");
//        processBuilder.start();
//      
//	 
	    
	}
}
