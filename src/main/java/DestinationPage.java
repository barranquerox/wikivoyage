import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DestinationPage {

    WebDriver driver;

    public NavigationPanel navigationPanel;
    public Header header;

    @FindBy(id = "Comprendre")
    private WebElement comprendreTitre;

    @FindBy(id = "Faire")
    private WebElement faireTitre;

    @FindBy(id = "Aller")
    private WebElement allerTitre;

    @FindBy(id = "Circuler")
    private WebElement circulerTitre;

    public DestinationPage(WebDriver driver)
    {
        this.driver = driver;
        navigationPanel = new NavigationPanel(driver);
        header = new Header(driver);

        PageFactory.initElements(driver, this);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(comprendreTitre));
        wait.until(ExpectedConditions.visibilityOf(faireTitre));
        wait.until(ExpectedConditions.visibilityOf(allerTitre));
        wait.until(ExpectedConditions.visibilityOf(circulerTitre));
    }
}
