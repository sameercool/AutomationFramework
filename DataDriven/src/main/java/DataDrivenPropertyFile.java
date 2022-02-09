import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class DataDrivenPropertyFile {
@Test
public void login() throws IOException {
    // TODO Auto-generated method stub
    //we are creating fileinputstream to access the location of our property file
    FileInputStream fis = new FileInputStream("src/main/resources/Login.properties");
//we are creating a properties class so that we could load the properties inside the filestream
    Properties p = new Properties();
//I will load the file inside my property class
    p.load(fis);
    String myacctlocator = p.getProperty("myacct1");
    String emaillocator = p.getProperty("email1");
    String passlocator = p.getProperty("pass1");
    String loginlocator = p.getProperty("login1");
    String logoutlocator = p.getProperty("logout1");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohds\\Desktop\\AutomationFramework\\DataDriven\\src\\main\\utilities\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.magento.com");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.xpath(myacctlocator)).click();
    driver.findElement(By.xpath(emaillocator)).sendKeys("sameersameer638@gmail.com");
    driver.findElement(By.xpath(passlocator)).sendKeys("Innova@12345");
    driver.findElement(By.xpath(loginlocator)).click();
    driver.findElement(By.xpath(logoutlocator)).click();

}
    public static void main(String[] args) throws IOException, IOException {
        DataDrivenPropertyFile d1=new DataDrivenPropertyFile();
        d1.login();

    }

}