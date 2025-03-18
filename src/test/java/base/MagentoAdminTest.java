package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MagentoAdminTest {

    //Global variable
    String BaseURL = "https://magento2-demo.magebit.com/admin";
    WebDriver driver;
    String expectedText;
    String actualText;

    //before test methode
    @BeforeTest
    public void beforeTestMethod() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void loginWithValidCredentials() throws InterruptedException {

        driver.get(BaseURL);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"username\"]"))
                .sendKeys("magebit");  // Replace with actual credentials
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"login\"]"))
                .sendKeys("Demo123");  // Replace with actual credentials
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[3]/div[1]/button")).click();

        Thread.sleep(2000);

        System.out.println("Login successfull");

    }

    @Test(priority = 2)
    public void loginWithInvalidCredentials() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div[1]/ul/li[3]/a")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"username\"]"))
                .sendKeys("admin");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"login\"]"))
                .sendKeys("admin123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[3]/div[1]/button")).click();

        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed");

        driver.navigate().refresh();
        System.out.println("Invalid login: Succesfull");

    }


    //Methods
    public void adminLogin() throws InterruptedException {
        driver.get(BaseURL);

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"username\"]"))
                .sendKeys("magebit");  // Replace with actual credentials
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"login\"]"))
                .sendKeys("Demo123");  // Replace with actual credentials
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[title='Sign In']"))
                .click();

        Thread.sleep(3000);
        System.out.println("Login successfull");

    }
}
