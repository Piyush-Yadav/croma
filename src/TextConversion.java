import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextConversion {

	public static void main(String a[]) throws IOException{
		
		
		Map map = new HashMap();
		FileInputStream file = new FileInputStream(new File("/home/piyushyadav/workspace/Demo/src/input.txt"));
		
	
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(file));
	String line;
		while ((line = reader.readLine()) != null) {
			//System.out.println(line);
			String[] str = line.split(">>"); 
			map.put(str[0], str[1]);
		
		}
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/piyushyadav/Downloads/Localization%20Chinise/strings%20%281%29%20%281%29.xml");
		List<WebElement> e = driver.findElements(By.tagName("string"));
		
		for (WebElement webElement : e) {
			if(map.containsKey(webElement.getText())){
			System.out.println("<string name=\""+webElement.getAttribute("name")+"\">"+map.get(webElement.getText())+"</string>");
			}
			else{
			System.out.println("<string name=\""+webElement.getAttribute("name")+"\">"+webElement.getText()+"</string>");
			}
		}
		
	}
	
	
}
