import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPanel {

    private WebDriver driver;

    @FindBy(id = "n-mainpage")
    private WebElement homePageLink;

    @FindBy(id = "n-help")
    private WebElement helpLink;

    public NavigationPanel(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(homePageLink));
        wait.until(ExpectedConditions.visibilityOf(helpLink));
    }

    public HomePage goToHomePage()
    {
        homePageLink.findElement(By.tagName("a")).click();
        return new HomePage(driver);
    }

    public void goToHelp()
    {
        helpLink.findElement(By.tagName("a")).click();
    }
}
