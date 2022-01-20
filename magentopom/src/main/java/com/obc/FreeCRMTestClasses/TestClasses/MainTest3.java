public class MainTest extends WelcomeTest{
    @Test
    //we are adding one more method to include test
public void maintestng() {
    Main m1 = new Main(driver);
    m1.freeAccount();
}
}