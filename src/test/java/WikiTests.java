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
    }

    @Test
    public void test1()
    {

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

    }
}