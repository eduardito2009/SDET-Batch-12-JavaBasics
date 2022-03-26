package syntax.comclass24;

public class Browser {
    void openBrowser(){
        System.out.println("opening the browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("opening the GoogleChrome browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+ "in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page in GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("Closing the GoogleChrome browser");
    }

}
//shortcut to find and replace is ctrl+r on windows and cmd+r for mac
class FireFox extends Browser {
    void openBrowser() {
        System.out.println("opening the FireFox browswer");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the website" + websiteLink + "in FireFox");
    }

    void testThePage() {
        System.out.println("Testing the page in FireFox");
    }

    void closeBrowser() {
        System.out.println("Closing the FireFox browser");
    }
}
class Safari extends Browser {
    void openBrowser() {
        System.out.println("opening the Safari browswer");
    }

    void loadPage(String websiteLink)
    {
        System.out.println("loading the website" + websiteLink + "in Safari");
    }

    void testThePage() {
        System.out.println("Testing the page in Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}

class IE extends Browser {
    void openBrowser() {
        System.out.println("opening the IE browswer");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the website" + websiteLink + "in IE");
    }

    void testThePage() {
        System.out.println("Testing the page in IE");
    }

    void closeBrowser() {
        System.out.println("Closing the IE browser");
    }
}
