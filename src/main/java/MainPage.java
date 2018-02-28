import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    @FindBy(className = "lang1")
    private WebElement englishLink;

    @FindBy(className = "lang4")
    private WebElement frenchLink;

    @FindBy(className = "lang3")
    private WebElement spanishLink;

    public MainPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openEnglishHomePage()
    {
        englishLink.click();
    }

    public HomePage openFrenchHomePage()
    {
        frenchLink.click();
        return new HomePage(driver);
    }

    public void openSpanishHomePage()
    {
        spanishLink.click();
    }

    public DestinationPage search(String search)
    {
        searchInput.sendKeys(search);
        searchButton.click();
        return new DestinationPage(driver);
    }
}
