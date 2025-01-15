import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ZamzamTest extends BaseTest {

    ZamzamPage obj = new ZamzamPage(driver);
    Faker fake = new Faker();
    SoftAssert soft = new SoftAssert();


    @Test
    public void TC_001() throws InterruptedException {
        reportTest = report.createTest("WUZZUF Test");
        obj = new ZamzamPage(driver);


        soft.assertEquals(driver.getCurrentUrl(),"https://zamzam.com/");
        reportTest.pass("You are in home page");

        reportTest.info("start asserting Media icons");


// Scroll down until footer element is visible (more reliable)
        WebElement footer = driver.findElement(By.xpath("//footer[@class='main_footer']"));
        ((JavascriptExecutor) driver).executeScript (  "arguments[0].scrollIntoView(true);", footer);
        Thread.sleep( 2000);

// Locate Facebook icon element
        WebElement facebookIcon = driver.findElement(By.cssSelector("a[href='https://www.facebook.com/zamzamtrips']"));
        soft.assertTrue(facebookIcon.isDisplayed(), "Facebook icon is not displayed in the footer");
        String facebookUrl = facebookIcon.getAttribute(  "href");
        soft.assertTrue(facebookUrl.contains("zamzam"),"Facebook URL does not contain 'zamzam'");
        reportTest.pass("Facebook URL contains zamzam word");

// Locate and verify Instagram icon
        WebElement instagramIcon= driver.findElement(By.cssSelector("a[href=\"https://www.instagram.com/zamzamtrips\"]"));
        soft.assertTrue(instagramIcon.isDisplayed(),  "Instagram icon is not displayed in the footer");
        String instagramUrl = instagramIcon.getAttribute(  "href");
        soft.assertTrue(instagramUrl.contains("zamzam"),  "Instagram URL does not contain 'zamzam'");
        reportTest.pass("Instagram URL contains zamzam word");

// Locate and verify LinkedIn icon (modify selector if needed)
        WebElement linkedinIcon = driver.findElement(By.cssSelector("a[href=\"https://www.linkedin.com/company/zamzamtrips\"]"));
        soft.assertTrue(linkedinIcon.isDisplayed(), "LinkedIn icon is not displayed in the footer");
        String linkedinUrl = linkedinIcon.getAttribute(  "href");
        soft.assertTrue(linkedinUrl.contains("zamzam"),  "LinkedIn URL does not contain 'zamzam'");
        reportTest.pass("Linkedin URL contains zamzam word");

// Locate and verify YouTube icon
        WebElement youtubeIcon = driver.findElement(By.cssSelector("a[href=\"https://www.youtube.com/channel/UCc5uQ4hwnLgNsXhxv8pQtYQ\"]"));
        soft.assertTrue(youtubeIcon.isDisplayed(),  "Youtube icon is not displayed in the footer");
        String youtubeUrl = youtubeIcon.getAttribute(  "href");
        soft.assertTrue(youtubeUrl.contains("zamzam"),"Youtube URL does not contain 'zamzam'");
        reportTest.fail("Youtube URL doesn't contain zamzam word");

// Locate and verify twitter icon
        WebElement twitterIcon = driver.findElement(By.cssSelector("a[href=\"https://twitter.com/zamzamtrips\"]"));
        soft.assertTrue(twitterIcon.isDisplayed(), "twitter icon is not displayed in the footer");
        String twitterUrl = twitterIcon.getAttribute(  "href");
        soft.assertTrue(twitterUrl.contains("zamzam"), "twitter URL does not contain 'zamzam'");
        reportTest.pass("twitter URL contains zamzam word");

//Scroll To Header
        WebElement header = driver.findElement(By.xpath("//header[@class='main_header']"));
        ((JavascriptExecutor) driver).executeScript (  "arguments[0].scrollIntoView(true);", header);
        Thread.sleep( 2000);

//Testing
        reportTest.info("start testing website");

        obj.saudiCity();
        reportTest.pass("You selected saudi city");
        obj.selectCity();
        reportTest.pass("You selected makkah city");
        obj.stayDates();
        reportTest.pass("You selected Check In/Check Out container");
        obj.startDate();
        reportTest.pass("You selected start date");
        obj.endDate();
        reportTest.pass("You selected end date");
        obj.paxAndRoomDetail();
        reportTest.pass("You selected No of Rooms and Guests");
        obj.roomCount();
        reportTest.pass("You selected room count");
        obj.selectNoOfRooms();
        reportTest.pass("You selected 2 rooms");
        obj.searchNationality();
        reportTest.pass("You selected nationality");
        obj.selectEgypt();
        reportTest.pass("You selected EGYPT");
        obj.searchBtn();
        reportTest.pass("You clicked on search hotel button");


        obj.firstSearchedResult();
        reportTest.pass("You clicked on first hotel (Al Noor Hotel)");

        //scrolling
        Actions actions = new Actions(driver);
        WebElement overlappingElement = driver.findElement(By.xpath("//button[@id='checkAvailabilityBtn']"));
        actions.moveToElement(overlappingElement).perform();


        obj.checkAvailability();
        reportTest.pass("You clicked on check availability Btn");

        //
        WebElement errorMessageLocator = driver.findElement( By.xpath("//h5[@class='pt-3 pb-3']"));
        String errorMessageText = errorMessageLocator.getText();
        soft.assertTrue(errorMessageText.contains("We can’t find the page you are looking for"));
        reportTest.pass("Asserting error Massage successfully");


















    }
}
