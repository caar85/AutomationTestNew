package com.driver.manager;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeDriver {
	private static final long IMPLICIT_TIMEOUT = 15L;
	private static final long PAGE_TIMEOUT = 30L;
	private WebDriver driver;

	private InitializeDriver() {
		try {
			Logger.getAnonymousLogger().log(Level.INFO, "{0}", "Iniciando browser.");
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.path", System.getProperty("webdriver.chrome.driver"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_TIMEOUT));
		} catch (Exception e) {
			Logger.getAnonymousLogger().log(Level.SEVERE, "There was error intilizing the browser: {0}.",
					e.getMessage());
		}
	}

	public static InitializeDriver initializeDriver() {
		return new InitializeDriver();
	}

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}
}
