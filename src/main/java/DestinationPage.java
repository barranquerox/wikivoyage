import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DestinationPage {

    public DestinationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
