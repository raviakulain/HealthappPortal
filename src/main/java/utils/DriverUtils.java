package utils;

public class DriverUtils
{
    public void navigateToUrl(String url)
    {
        DriverFactory.driver.navigate().to(url);
    }

    public String getPageTitle()
    {
        return DriverFactory.driver.getTitle();
    }
    public String getAlertTextMessage()
    {
        return DriverFactory.driver.switchTo().alert().getText();
    }
}
