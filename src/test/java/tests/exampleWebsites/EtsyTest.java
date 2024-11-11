package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class EtsyTest {
    @Test(groups = {"sanity"})
    public void etsyTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
    }

    @Test
    public void etsyTest2() {
        System.out.println("This is test 2 of etsy");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test(groups = {"login"})
    public void etsyTest3() {
        System.out.println("This is test 3 of etsy");
        SeleniumUtils.waitForSeconds(3);

    }

    @Test(groups = {"loginTest", "sanity"})
    public void login1() {
        System.out.println("login etsy test 1");
    }

    @Test(groups = {"loginTest"})
    public void login2() {
        System.out.println("login etsy test 2");
    }
}