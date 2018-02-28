import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiTests {

    WebDriver driver;

    @Before
    public void init()
    {
        driver = new ChromeDriver();
        driver.get("https://www.wikivoyage.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void test1()
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.search("Paris")
                .header.search("Lyon")
                .navigationPanel.goToHomePage()
                .header.search("Venezuela")
                .navigationPanel.goToHelp();
    }

    @Test
    public void test2()
    {

    }

    @Test
    public void test3()
    {

    }

    @After
    public void quit()
    {
        driver.quit();
    }
}
