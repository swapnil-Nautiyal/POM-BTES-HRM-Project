package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public static Properties read_property_file() throws IOException {
		String path= System.getProperty("user.dir")+"\\src\\main\\java\\Configuration\\DefineProperties.properties";
		FileInputStream f1= new FileInputStream(path);
		prop= new Properties();
		prop.load(f1);
		return prop;

	}
	//initialization of driver class
	public static void initialize() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties p= read_property_file();
		driver.get(p.getProperty("url"));

	}

	public void closure()
	{
		driver.quit();
	}

}
