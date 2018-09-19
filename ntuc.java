package datapicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ntuc {
	
	public static void main(String args[]) {
		String DOB="18/04/1988";
		String[] dobarray=DOB.split("/");
		String date=dobarray[0];
		String month=Integer.toString(Integer.parseInt(dobarray[1]));
		String year=dobarray[2];
		String dep="5";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://bfa.ntuclink.cloud/#/guidme/getstarted");
		driver.navigate().to("http://bfa.ntuclink.cloud/#/guidme/getstarted");
		driver.navigate().refresh();
		//http://bfa.ntuclink.cloud/#/guideme
		driver.findElementByXPath("//span[@class='navbar__back-btn--web']").click();
		driver.findElementById("prfLbl1").click();
		driver.findElementById("prfBtn1").click();
		driver.findElementById("getStrdInpt3").click();
		WebElement monthele = driver.findElement(By.xpath("(//select[@class='custom-select'])[1]"));
		Select ele1 =new Select(monthele);
		ele1.selectByValue(month);
		WebElement yearele = driver.findElement(By.xpath("(//select[@class='custom-select'])[2]"));
		Select ele2 =new Select(yearele);
		ele2.selectByValue(year);
		driver.findElement(By.xpath("(//div[@class='btn-light'])["+date+"]")).click();
		//driver.findElementByLinkText("15").click();
		driver.findElement(By.id("dropdownBasic1")).click();
		
		driver.findElement(By.xpath("(//button[@id='getStrdBtn2'])["+5+"]")).click();
	}

}
