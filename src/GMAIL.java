
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class GMAIL {
	
	public static void main(String[] args) throws SikuliException {
		
		Screen s=new Screen();
		Pattern img4=new Pattern("C:\\Users\\VALI\\Desktop\\loginclick.PNG");
		Pattern img=new Pattern("C:\\Users\\VALI\\Desktop\\usrname.PNG");
		Pattern img2=new Pattern("C:\\Users\\VALI\\Desktop\\password.PNG");
		Pattern img3=new Pattern("C:\\Users\\VALI\\Desktop\\signin.PNG");
		System.setProperty("webdriver.chrome.driver", "D:\\T\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.millionclouds.com");
		s.click("img4");
		s.type("img","meravali@gmail.com");
		s.type("img2","vali");
		s.click("img3");
		
		
				
		
	}

}
