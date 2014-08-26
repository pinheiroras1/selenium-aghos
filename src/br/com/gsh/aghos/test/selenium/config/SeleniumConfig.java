package br.com.gsh.aghos.test.selenium.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumConfig {

	/*
	 * Altere aqui o caminho do servidor (Local ou outro endereço IP)
	 */
	public static final String SERVER_JENKINS = "http://192.168.0.44/aghos";
	public static final String SERVER_LOCAL = "http://127.0.0.1:8080/aghos";
	public static final String SERVER = SERVER_LOCAL;

	/*
	 * Altere aqui o caminho para o driver do Chrome (Windows ou Linux)
	 */
	public static final String PATH_DRIVER_WINDOWS = "C:\\dev\\tools\\chromedriver_win32\\chromedriver.exe";
	public static final String PATH_DRIVER_LINUX = "/home/pinheiro/Downloads/chromedriver";
	public static final String PATH_DRIVER = PATH_DRIVER_LINUX;
	
	
	public static final String LOGIN = "GSH4";
	public static final long TIMER_SLEEP = 600;
	private static WebDriver driver;
	
	public static WebDriver getDriverFirefox() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get(SeleniumConfig.SERVER + "/aghos/login");
		return driver;
	}

	public static WebDriver getDriverChrome() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVER);		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(SeleniumConfig.SERVER + "/login");
		return driver;
	}
	
	public static WebDriver getDriver(){
		/*
		 * Utilize aqui para alterar o browser desejador (Firefox ou GoogleChrome)
		 */
		//driver = getDriverFirefox(); 
		driver = getDriverChrome(); 
		return driver;
	}
	
	public static Boolean isFirefox() {
		return driver instanceof FirefoxDriver;
	}
}
