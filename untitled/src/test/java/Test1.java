import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 23.11.13
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {
    public static WebDriver driver;
           PravdaObj page;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        page = new PravdaObj(driver);

        PageFactory.initElements(driver, page);
    }

    @After
    public void clear() {
        driver.quit();
    }

    @Test
    public void test1() {
        page.goToPage("http://www.pravda.com.ua");
        page.waitInput();
        page.typeAndClick("euro");
        page.waitSearch();

    }


}
