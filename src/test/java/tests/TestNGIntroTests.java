package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntroTests {

    @BeforeTest(groups = "sanity")
    public static void beforeTestMethod() {
        System.out.println("This is before test in TestNGIntro class");
    }

    @AfterTest
    public static void afterTestMethod() {
        System.out.println("This is after test in TestNGIntro class");
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("THis is before class");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is before method");
    }

    @Test
    public void test1() {
        System.out.println("I am test 1");
        Assert.assertTrue(5 > 2);

    }

    @Test
    public void test2() {
        Assert.assertFalse(2 > 5);
        System.out.println("I am test 2");

    }

    @Test
    public void test3() {
        System.out.println("I am test 3");
    }

    @Test
    public void test4() {
        System.out.println("I am test 4");
    }

}
