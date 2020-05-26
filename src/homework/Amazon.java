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
        Amazon.amazonTryPrime();
        Amazon.flag();
        Amazon.account();
        Amazon.orders();
        Amazon.tryPrime();
        Amazon.cart();
        Amazon.sellonamazon();
        Amazon.blog();
        Amazon.aboutAmazon();
        Amazon.pressCenter();
        Amazon.amazonDevices();
        Amazon.amazonTours();
        Amazon.investorRelations();
        Amazon.searchBox();
        Amazon.searchBoxNegative();
        Amazon.bestSellers();

        Amazon.careers();
        Amazon.eastDane();
        Amazon.fabric();
        Amazon.iMDB();


        Amazon.ring();
        Amazon.sellOnAmazon();
        Amazon.shopbop();
        Amazon.woot();
        Amazon.zappos();

        Amazon.aCX();
        Amazon.alexa();
        Amazon.amazonDrive();
        Amazon.amazonFresh();
        Amazon.amazonMusic();
        Amazon.amazonPhotos();

        Amazon.amazonWebServices();
        Amazon.addToCart();
        Amazon.amazonPrime();
        Amazon.selectCologne();
        Amazon.bestSellers();
        Amazon.customerService();
        Amazon.newReleases();
        Amazon.findAGift();
        Amazon.todayDeals();
        Amazon.wholeFoods();
        Amazon.giftCards();
        Amazon.registry();
        Amazon.amazonBasics();
        Amazon.sell();
        Amazon.coupons();
        Amazon.founditonAmazon();
        Amazon.freeShipping();
        Amazon.shooperToolkit();

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

    public static void amazonTryPrime() {
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
    public static void account() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select account on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();


    }
    public static void orders() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Orders on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();


    }

    public static void tryPrime() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select TryPrime on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span")).click();


    }
    public static void cart() {
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


    public static void aboutAmazon() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")).click();


    }

    public static void pressCenter() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")).click();


    }

    public static void investorRelations() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")).click();


    }

    public static void amazonDevices() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[6]/a")).click();


    }

    public static void amazonTours() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a")).click();




    }

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


    public static void amazonPrime() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        myDriver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();


    }

    
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



        public static void customerService() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Select  customerService on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        }


        public static void newReleases() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Search on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        }


        public static void findAGift() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Search on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        }


        public static void todayDeals() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Search on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        }


        public static void wholeFoods() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Select wholeFoods on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        }


        public static void giftCards() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Select giftCards on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        }


        public static void registry() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Search on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        }


        public static void amazonBasics() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");

            //Select amazonBasics on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();
        }


        public static void sell() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Search on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
        }


        public static void coupons() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");

            //Select coupons on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[11]")).click();
        }


        public static void founditonAmazon() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");

            //Select founditonAmazon on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[12]")).click();
        }


        public static void freeShipping() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");

            //Search on click
            myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[13]")).click();
        }



        public static void shooperToolkit() {
            // Set property with browser driver name and path of the driver
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
            myDriver = new ChromeDriver();
            //Navigate to URL
            myDriver.get("https://www.amazon.com/");
            //Search on click
            myDriver.findElement(By.xpath(" //*[@id=\"nav-xshop\"]/a[14]")).click();
        }

    }








