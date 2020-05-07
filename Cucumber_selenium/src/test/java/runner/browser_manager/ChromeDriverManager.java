package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
}
