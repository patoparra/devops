package runner.browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver/geckodriver");
		driver = new FirefoxDriver();
	}
}
