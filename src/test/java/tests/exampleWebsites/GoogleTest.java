package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.Driver;
import utilities.SeleniumUtils;

public class GoogleTest {

    @BeforeMethod(groups = {"login"})
    public void beforeMethod() {
        System.out.println("Before method in Google");
    }

    @Test
    public void googleTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test(groups = {"login"})
    public void googleTest2() {
        System.out.println("This is test 2 of google");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test(groups = {"sanity"})
    public void googleTest3() {
        System.out.println("This is test 3 of google");
        SeleniumUtils.waitForSeconds(3);

    }

    @Test(groups = {"loginTest"})
    public void login1() {
        System.out.println("login google test 1");
    }

    @Test(groups = {"loginTest"})
    public void login2() {
        System.out.println("login google test 2");
    }

    @BeforeSuite
    public static void beforeSuiteMethod() {
        System.out.println("This is before suite inside Google test");

    }

    @AfterSuite
    public static void afterSuiteMethod() {
        System.out.println("This is after suite inside Google test");
    }

    @BeforeTest
    public static void beforeTest() {
        System.out.println("before test method google");
    }

    @AfterTest
    public static void afterTest() {
        System.out.println("after test method google");
    }

    @BeforeGroups(groups = "sanity")
    public static void beforeGroup() {
        System.out.println("before group  method google");
    }
}


