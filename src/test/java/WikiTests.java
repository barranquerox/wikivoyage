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
        mainPage.search("Paris");
    }

    @Test
    public void test2()
    {
        MainPage mainPage = new MainPage(driver);
        String recherche = System.getProperty("recherche");
        mainPage.search(recherche);
    }

    @Test
    public void test3()
    {
        MainPage mainPage = new MainPage(driver);
        DestinationPage destination = mainPage.search("Paris");
        HomePage home = destination.navigationPanel.goToHomePage();
    }

    @Test
    public void test4()
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.search("Paris").navigationPanel.goToHomePage();
    }

    @Test
    public void test5()
    {
        MainPage mainPage = new MainPage(driver);
                mainPage.search("Paris")
                .header.search("Lyon")
                .header.search("Madrid")
                .navigationPanel.goToHomePage();
    }

    @After
    public void quit()
    {
        driver.quit();
    }
}
