import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigationPanel {

    public NavigationPanel(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
