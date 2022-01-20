public class WelcomeTest {


 public WebDriver driver;
@BeforeSuite
 public void firsttest() {
  public void welcome1 () {
   WebDriverManager.chromedriver().setup();
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://freecrm.com");
   //creating constructor to call in the page class

   WelcomePage w1 = new WelcomePage(driver);
   //calling the method present in the page class
   w1.clickOnLogin;

  }


 }
}