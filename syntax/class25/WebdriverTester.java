package syntax.class25;

public class WebdriverTester {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.openBrowser();
        chromeDriver.closeBrowser();
        chromeDriver.maximizeWindow();
        chromeDriver.findElement();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.openBrowser();
        firefoxDriver.closeBrowser();
        firefoxDriver.maximizeWindow();
        firefoxDriver.findElement();
    }
}
