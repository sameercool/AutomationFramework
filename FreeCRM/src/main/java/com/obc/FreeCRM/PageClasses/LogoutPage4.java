public LogoutPage{
    public void LogoutPage(driver){
        super(driver);
        }
        public void logoutElement(){
        driver.findElement(By.xpath("//*[@class='settings icon']")).click();

        driver.findElement(By.xpath("//*[@class='power icon']")).click();
        }