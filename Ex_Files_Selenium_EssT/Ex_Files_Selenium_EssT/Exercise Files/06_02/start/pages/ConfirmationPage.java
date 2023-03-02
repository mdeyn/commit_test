public class ConfirmationPage {
    public static void waitForAlertBanner(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.visibilityOfElementLocated((By.className("alert")))));
    }

    public static String getAlertBannertext(WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();
    }
}