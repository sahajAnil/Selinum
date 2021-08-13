package TestCaseOne;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  


public class Test {
 
	public static void main(String[] args) {

        
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  
		                  
		// Instantiate a ChromeDriver class.      
		WebDriver driver=new ChromeDriver();  
		          
		// Storing the Application Url in the String variable  
		String url = ("http://fortunediabetes.com/");  
		       
		//Launch the ToolsQA WebSite  
		driver.get(url);  
		       
		// Storing Title name in the String variable  
		String title = driver.getTitle();  
		       
		// Storing Title length in the Int variable  
		int titleLength = driver.getTitle().length();  
		       
		// Printing Title & Title length in the Console window  
		System.out.println("Title of the page is : " + title);  
		System.out.println("Length of the title is : "+ titleLength);  
		      
		// Storing URL in String variable  
  
		//Closing browser  
		 driver.close(); 
	}
}



