import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		WebElement s = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		
		s.sendKeys("standard_user");
		WebElement s1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		s1.sendKeys("secret_sauce");
		
		WebElement s2 = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		String m=driver.getWindowHandle();
		
		//action.dragAndDropBY(ELEMENT,50,50).PERFORM();
        
        //alert
		//xpath relative 
       //xpath absolute
       //select corner square box
       //then 
       //select is visible text used for  to select one of the options in a drop-down box or an option among multiple selection boxes 
		
	   //alert 
       //changing a window
       //iframe
      
        //switch focus -- switch to method
        
        //launch hua
        //launch url
        //maximize hua  
        // click hyperlink link hua 
        //new window
        //email aya
        //login hua
        //close hua child hua 
        //then parent window close hua
        // String MainWindow=driver.getWindowHandle();
        //everything can be automate
		//current window se bahar close()
		//all window quit()
        
		
		//lauch browser
		//launch url
		//maximize
		//scroll page
		//first page should be close
		//then go to new page
		//there are four values then 1 or 4 value give
		//close
		
		//all window can not be run ecksath then use test engine for all
	}

}
