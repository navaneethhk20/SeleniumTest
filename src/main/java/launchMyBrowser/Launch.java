package launchMyBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Navaneeth H K\\Desktop\\Browser\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navaneeth H K\\Desktop\\Driver\\chromedriver-win64\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://so1.replicon.com");
driver.close();
System.out.println("Done");
	}

}
