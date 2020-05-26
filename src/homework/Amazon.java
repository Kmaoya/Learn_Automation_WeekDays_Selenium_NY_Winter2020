package homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
    public static WebDriver myDriver;
    public static void main(String[] args){
        Amazon.bestSellers();
        Amazon.search();
        Amazon.menu();
        Amazon.AmazonTryPrime();
        Amazon.flag();
        Amazon.Account();
        Amazon.Orders();
        Amazon.TryPrime();
        Amazon.Cart();
        Amazon.sellonamazon();
        Amazon.Blog();
        Amazon.AboutAmazon();
        Amazon.PressCenter();
        Amazon.AmazonDevices();
        Amazon.AmazonTours();
        Amazon.InvestorRelations();
        Amazon.searchBox();
        Amazon.searchBoxNegative();
        Amazon.bestSellers();
        Amazon.blog();
        Amazon.careers();
        Amazon.eastDane();
        Amazon.fabric();
        Amazon.iMDB();
        Amazon.investorRelations();
        Amazon.pressCenter();
        Amazon.ring();
        Amazon.sellOnAmazon();
        Amazon.shopbop();
        Amazon.woot();
        Amazon.zappos();
        Amazon.aboutAmazon();
        Amazon.aCX();
        Amazon.alexa();
        Amazon.amazonDevices();
        Amazon.amazonDrive();
        Amazon.amazonFresh();
        Amazon.amazonMusic();
        Amazon.amazonPhotos();
        Amazon.amazonTours();
        Amazon.amazonWebServices();
        Amazon.addToCart();
        Amazon.amazonPrime();
        Amazon.selectCologne();

    }

   public static void bestSellers() {
       //set property with browser driver name and path of the driver
       //for chrome browser


       System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
       myDriver = new ChromeDriver();
    //Navigate to URL
       myDriver.get("https://www.amazon.com/");
       //Select bestSellers on click
    myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
   }


    public static void search() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select search box on click
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("watch");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    }

    public static void menu() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select menu on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();


    }

    public static void AmazonTryPrime() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazon try prime on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).click();


    }
    public static void flag() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select flag on click
        myDriver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span")).click();


    }
    public static void Account() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select account on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();


    }
    public static void Orders() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Orders on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();


    }

    public static void TryPrime() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select TryPrime on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span")).click();


    }
    public static void Cart() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Cart on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();


    }

    public static void sellonamazon() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a")).click();


    }

    public static void Blog() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click();


    }
    public static void AboutAmazon() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")).click();


    }

    public static void PressCenter() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")).click();


    }

    public static void InvestorRelations() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")).click();


    }

    public static void AmazonDevices() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[6]/a")).click();


    }

    public static void AmazonTours() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a")).click();




    }
    //1
    public static void careers() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Careers on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();

    }

    //2
    public static void blog() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Blog on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click();
    }

    //3
    public static void aboutAmazon() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select aboutAmazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")).click();
    }

    //4
    public static void pressCenter() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select pressCenter on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")).click();
    }

    //5
    public static void investorRelations() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select investorRelations on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")).click();
    }

    //6
    public static void amazonDevices() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonDevices on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[6]/a")).click();
    }

    //7
    public static void amazonTours() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonTours on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a")).click();
    }

    //8
    public static void amazonMusic() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonMusic on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[1]/a")).click();
    }

    //9
    public static void sellOnAmazon() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sellOnAmazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[1]/a")).click();
    }

    //10
    public static void amazonWebServices() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonWebServices on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[1]/a")).click();
    }

    //11
    public static void eastDane() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select eastDane on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[1]/a")).click();
    }

    //12
    public static void amazonPhotos() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonPhotos on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[1]/a")).click();
    }

    //13
    public static void ring() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select ring on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[11]/td[1]/a")).click();
    }

    //14
    public static void fabric() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select fabric on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[3]/a")).click();
    }

    //15
    public static void amazonDrive() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonDrive on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[5]/a")).click();
    }

    //16
    public static void amazonFresh() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonFresh on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[5]/a")).click();
    }

    //17
    public static void shopbop() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select shopbop on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[5]/a")).click();
    }

    //18
    public static void iMDB() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select iMDB on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[7]/a")).click();
    }

    //19
    public static void aCX() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select aCX on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[11]/a")).click();
    }

    //20
    public static void alexa() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select alexa on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[13]/a")).click();
    }

    //21
    public static void zappos() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select zappos on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[13]/a")).click();
    }

    //22
    public static void woot() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select woot on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[11]/a")).click();
    }

    //23
    public static void searchBox() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select SearchBox on click
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("watch");
        //Search product on SearchField
        myDriver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();


    }

    //24
    public static void searchBoxNegative() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select SearchBox on click
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("vodka and ram");
        //Search product on SearchField
        myDriver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();


    }




    // 26th test case :
    public static void selectCologne() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        myDriver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        myDriver.findElement(By.cssSelector("#b6988f18-132d-4b2f-988f-18132ddb2f5e > div > div.sb_2vdjSJEF > div.sb_Azvq332I.sb_ji55L-0S.sb_1-64HM9_ > div > div > a:nth-child(1) > span > span")).click();


    }

    // 27th test case :
    public static void amazonPrime() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        myDriver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();


    }

    // 28th test case :
    public static void addToCart() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        myDriver.manage().window().maximize();
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        myDriver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        myDriver.findElement(By.xpath("//*[@id=\"8921dbd2-0f9e-468b-a1db-d20f9ec68b96\"]/div/div[2]/div[2]/div/div/a[1]/span/span")).click();
        myDriver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();


    }


}

