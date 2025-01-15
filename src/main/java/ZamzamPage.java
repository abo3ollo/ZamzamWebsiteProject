import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZamzamPage extends BasePage{
    public ZamzamPage(WebDriver driver) {
        super(driver);
    }

    //locators

    By saudiCityLocators = By.xpath("//input[@id='HotelCity']");
    By selectCityLocators = By.cssSelector("ul[id=\"ui-id-1\"] li[class=\"ui-menu-item\"]:nth-child(29)");
    By stayDatesLocators = By.xpath("//input[@id='hotelStayDates']");
    By startDateLocators = By.cssSelector("span[aria-label=\"February 2, 2025\"]");
    By endDateLocators = By.cssSelector("span[aria-label=\"February 7, 2025\"]");
    By paxAndRoomDetailLocators = By.cssSelector("input[id=\"paxAndRoomDetail\"]");
    By roomCountLocators = By.xpath("//select[@id='roomCount']");
    By selectNoOfRoomsLocators = By.cssSelector("select[id=\"roomCount\"] option[value=\"2\"]");
    By searchNationalityLocators = By.xpath("//select[@id='searchNationality']");
    By selectEgyptLocators = By.xpath("//option[@value='EG']");
    By searchBtnLocator = By.xpath("//button[@id='searchBtn']");
    //
    By firstSearchedResultLocator =By.xpath("//div[@id='resultBox-1067450']//span[@id='linkHotelDetails']");
    By checkAvailabilityLocator = By.xpath("//button[@id='checkAvailabilityBtn']");




        //Methods

    public void saudiCity() throws InterruptedException {
        myClick(saudiCityLocators);
    }
    public void selectCity() throws InterruptedException {
        myClick(selectCityLocators);
    }
    public void stayDates() throws InterruptedException {
        myClick(stayDatesLocators);
    }
    public  void startDate() throws InterruptedException {
        myClick(startDateLocators);
    }
    public void endDate() throws InterruptedException {
        myClick(endDateLocators);
    }
    public void paxAndRoomDetail() throws InterruptedException {
        myClick(paxAndRoomDetailLocators);
    }
    public void roomCount() throws InterruptedException {
        myClick(roomCountLocators);
    }
    public void selectNoOfRooms() throws InterruptedException {
        myClick(selectNoOfRoomsLocators);
    }
    public void searchNationality() throws InterruptedException {
        myClick(searchNationalityLocators);
    }

    public void selectEgypt() throws InterruptedException {
        myClick(selectEgyptLocators);
    }
    public void searchBtn() throws InterruptedException {
        myClick(searchBtnLocator);
    }

    public void firstSearchedResult() throws InterruptedException {
        myClick(firstSearchedResultLocator);
    }
    public void checkAvailability() throws InterruptedException {
        myClick(checkAvailabilityLocator);
    }


}
