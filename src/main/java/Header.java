import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Header {

    public Header(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
