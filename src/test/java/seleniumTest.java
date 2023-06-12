import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class seleniumTest {
    public static WebDriver driver;
    public void login(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
    @Test
    public void firstTest(){
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("EGaga23r" + Math.random() * 100);
        driver.findElement(By.id("last-name")).sendKeys("Emaxerewq");
        driver.findElement(By.id("postal-code")).sendKeys(String.valueOf(Math.random() * 10000));
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }
@Test
public void secondTest(){
    driver.get("https://www.saucedemo.com/inventory.html");
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
    driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    driver.findElement(By.id("checkout")).click();
    driver.findElement(By.id("first-name")).sendKeys("EGaga23r" + Math.random() * 100);
    driver.findElement(By.id("last-name")).sendKeys("Emaxerewq");
    driver.findElement(By.id("postal-code")).sendKeys(String.valueOf(Math.random() * 10000));
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("finish")).click();
}
    @Test
    public void thirdTest(){// cia ketvirtas testas man atrodo. paskaityk salygas
        driver.get("https://www.saucedemo.com/inventory.html");
        String itemName = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        String itemNameInCart = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart,itemName);
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("EGaga23r" + Math.random() * 100);
        driver.findElement(By.id("last-name")).sendKeys("Emaxerewq");
        driver.findElement(By.id("postal-code")).sendKeys(String.valueOf(Math.random() * 10000));
        driver.findElement(By.id("continue")).click();
        String itemNameInCheckout = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart, itemNameInCheckout);
        driver.findElement(By.id("finish")).click();
    }
    @Test
    public void forthTest(){
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        String backpack = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        String bikeLight= driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        String boltTshirt= driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        String fleesejacket= driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        String labsonesize= driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        String redTshirt= driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

        String itemNameInCart1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart1,backpack);

        String itemNameInCart2 = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart2,bikeLight);

        String itemNameInCart3 = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart3,boltTshirt);

        String itemNameInCart4 = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart4,fleesejacket);

        String itemNameInCart5 = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart5,labsonesize);

        String itemNameInCart6 = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
        Assert.assertEquals (itemNameInCart6,redTshirt);
    }
@Test
public void fifthTest() {
    driver.get("https://www.saucedemo.com/inventory.html");
    String backpack1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
    driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
    String itemNameInCart11 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
    Assert.assertEquals(itemNameInCart11, backpack1);
    driver.get("https://www.saucedemo.com/inventory.html");

    String bikeLight11 = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
    driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).click();
    String itemNameInCart12 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
    Assert.assertEquals(itemNameInCart12, bikeLight11);
    driver.get("https://www.saucedemo.com/inventory.html");

    String boltTshirt11 = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
    driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).click();
    String itemNameInCart13 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
    Assert.assertEquals(itemNameInCart13, boltTshirt11);
    driver.get("https://www.saucedemo.com/inventory.html");

    String fleesejacket11 = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
    driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).click();
    String itemNameInCart14 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
    Assert.assertEquals(itemNameInCart14, fleesejacket11);
    driver.get("https://www.saucedemo.com/inventory.html");

    driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
    String labsonesize11 = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
    driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).click();
    String itemNameInCart15 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
    Assert.assertEquals(itemNameInCart15, labsonesize11);
    driver.get("https://www.saucedemo.com/inventory.html");

    String redtr11 = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
    driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).click();
    String itemNameInCart16 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
    Assert.assertFalse(Boolean.parseBoolean(itemNameInCart16), redtr11);
    driver.get("https://www.saucedemo.com/inventory.html");
}
    @Test
    public void sixtTest() {
        driver.get("https://www.saucedemo.com/inventory.html");
        WebElement container = driver.findElement(By.className("inventory_list"));
        List<WebElement> cards = container.findElements(By.className("inventory_item"));
        for (WebElement card : cards) {
            String cardTitle = card.findElement(By.className("inventory_item_name")).getText();
            boolean containsSauce = cardTitle.toLowerCase().contains("sauce");
            if (!containsSauce) {
                System.out.println(cardTitle);
            }
        }
        System.out.println("------------------------");
        for (WebElement card : cards) {
            String cardTitle = card.findElement(By.className("inventory_item_name")).getText();
            String priceText = card.findElement(By.className("inventory_item_price")).getText();
            double price = Double.parseDouble(priceText.replace("$", "").trim());
            if (price > 20.0) {
                System.out.println(cardTitle);
            }
        }
    }
@AfterMethod
public void afterMethod(){
    driver.get("https://www.saucedemo.com/inventory.html");
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("reset_sidebar_link")).click();
}
@BeforeClass
    public void beforeLenta(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
        login();
}
@AfterClass
    public void afterAllTests(){
        driver.quit();
}
}