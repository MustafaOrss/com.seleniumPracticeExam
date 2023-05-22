package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PE01 {
    public static void main(String[] args) throws InterruptedException {

        ///....Exercise-1:...
        //   Create a new class with main method
        //   Set Path
        //   Create a chrome driver
        //   Maximize window
        //   Open google home page https://www.google.com
        //   On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        //   Wait about 4 sn
        //   Navigate forward to amazon
        //   Refresh page
        //   Close/quit the browser
        //   And Last step print "All is well" on console
        //

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe"); // Bu satirda driver'imizi tanittik ve yonunu gosterdik

        WebDriver driver = new ChromeDriver(); // Bu satirda acilan pencerimizi maximum boyuta ulastirdik (fullscreen degil)

        driver.manage().window().maximize();

        driver.get("https://www.google.com"); // Gidilecek adres'in belirlendigi satir

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(4000);

        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit(); // Close son acik sayfayi kapatir Quit ise tum acik saylari yani pencereyi kapatir.

        System.out.println("All is well.");

    }
}
