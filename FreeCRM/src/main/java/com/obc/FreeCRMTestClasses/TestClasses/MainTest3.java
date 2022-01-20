public class MainTest extends WelcomeTest{
    @Test
    //we are adding one more method to add testng annotations

public void maintestng() {
    Main m1 = new Main(driver);
    m1.freeAccount();
}
}