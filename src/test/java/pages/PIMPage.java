package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PIMPage {


    public PIMPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(xpath = "//label[text()='Employee Id']/../following-sibling::div/input']")
    public WebElement employeeID;

    @FindBy(css = "button[type= submit]")
    public WebElement saveButton;

    @FindBy(css = "h6[class='oxd-text oxd-text--h6 --strong']")
    public WebElement fullNameText;

    Faker faker = new Faker();

    public String fName = faker.name().firstName();
    public String lName = faker.name().lastName();
    public String empID = faker.number().digits(5);


    /**
     * This method adds employee with randomly generated data
     */

    public void addEmployee() {
        addButton.click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        employeeID.sendKeys(empID);

        saveButton.click();
    }
}