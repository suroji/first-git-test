package slider1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ssss {
	public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
     WebDriver d=new FirefoxDriver();
     d.get("https://webapps.tekstac.com/TicketBooking/HotelBooking.html");
  WebElement a=   d.findElement(By.xpath("//*[@id=\'myRange\']"));
  Actions move=new Actions(d);
  

move.dragAndDropBy(a, -150, 0).build().perform();
//  a.click();
/*  a.sendKeys(Keys.ARROW_RIGHT);
  Thread.sleep(2000);
  a.sendKeys(Keys.ARROW_RIGHT);
  Thread.sleep(2000);
  a.sendKeys(Keys.ARROW_RIGHT);
  Thread.sleep(2000);
  a.sendKeys(Keys.ARROW_RIGHT);
  Thread.sleep(2000);
  a.sendKeys(Keys.ARROW_RIGHT);
  Thread.sleep(2000);
  a.sendKeys(Keys.ARROW_RIGHT);
  Thread.sleep(2000);*/
  
  
/* a.sendKeys(Keys.ARROW_LEFT);
  a.sendKeys(Keys.ARROW_LEFT);
  a.sendKeys(Keys.ARROW_LEFT);
  a.sendKeys(Keys.ARROW_LEFT);
  a.sendKeys(Keys.ARROW_LEFT);
  a.sendKeys(Keys.ARROW_LEFT);*/

}
	}

