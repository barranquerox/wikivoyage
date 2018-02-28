import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    public NavigationPanel navigationPanel;
    public Header header;

    @FindBy(id = "firstHeading")
    private WebElement titre;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        navigationPanel = new NavigationPanel(driver);
        header = new Header(driver);

        PageFactory.initElements(driver, this);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(titre));
    }
}
