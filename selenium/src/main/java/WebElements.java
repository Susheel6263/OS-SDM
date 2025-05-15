import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		radio1.click();
		System.out.println("opt 1 selected");
		radio2.click();
		System.out.println("opt 2 selected");
		radio3.click();
		System.out.println("opt 3 selected");
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		checkbox1.click();
		System.out.println("hgdjgdsfh");
	}

}
