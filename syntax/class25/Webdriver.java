package syntax.class25;

public interface Webdriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();


    /*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
     maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver
     and FirefoxDriver.*/
}
class ChromeDriver implements Webdriver{

    @Override
    public void openBrowser() {
        System.out.println("open Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("find element");
    }
}
class FirefoxDriver implements Webdriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox open Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox close Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("Firefox find element");
    }
}
