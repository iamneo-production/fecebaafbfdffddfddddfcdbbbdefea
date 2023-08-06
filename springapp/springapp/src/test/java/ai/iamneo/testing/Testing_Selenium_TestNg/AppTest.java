package ai.iamneo.testing.Testing_Selenium_TestNg;

public class AppTest {
    // public static void main (String[] args) {
    //     System.out.println("Hello World!");
    // }
    
    

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Set the path to the chromedriver executable for Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testBrowserNavigation() {
        // Navigate to "http://iamneo.ai"
        driver.get("http://iamneo.ai");

        // Print PASS if the title matches "We are Hiring!", else FAIL
        String pageTitle = driver.getTitle();
        String expectedTitle = "We are Hiring!";
        Assert.assertEquals(pageTitle, expectedTitle, "FAIL");

        // Navigate to "https://www.facebook.com"
        driver.navigate().to("https://www.facebook.com");

        // Navigate back to "http://iamneo.ai"
        driver.navigate().back();

        // Print the URL of the current page
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}
