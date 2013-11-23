import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 23.11.13
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
public class PravdaObj {
  static   WebDriver driver;

    public PravdaObj(WebDriver driver) {
        this.driver = driver;
    }


    private interface Locators {
        String NAME_SEARCH = "search";

        String ACRICLE_TWO = "//p[2][@class='p']//a[@class='a1']";

        String SEARCH_BTN ="a.but11";
    }

    @FindBy
            (name = Locators.NAME_SEARCH)
   private WebElement mainInput;

    @FindBy
            (xpath = Locators.ACRICLE_TWO)
    private  WebElement artTwo;

    @FindBy
            (css = Locators.SEARCH_BTN)
    private  WebElement searchBtn;


    public void goToPage(String url){
               driver.get(url);
    }

    public void waitInput() {
        System.out.println(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(mainInput));
    }

    public void typeAndClick (String param){
        System.out.println(mainInput);
        mainInput.clear();
        mainInput.sendKeys(param);
        searchBtn.click();
    }


    public void waitSearch() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(By.tagName("body"), "EURO"));
    }

    //euro

}

