package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PE06 {
    // ilgili kurulumlari tamamlayalim
    // Kullanici https://www.google.com adresine gider
    // Çıkıyorsa Kullanici cookies i kabul eder

    // Karsilastirilacak olan para biriminin 1.5 den kUCUk oldygu test edilir

    static WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void paraKarsilastir(){
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.xpath("//*[@name='q']"));
        // Arama Kutusuna karşilastirma yapmak istedigi para birimlerini girer

        searchBox.sendKeys("USD TO TL" + Keys.ENTER);

        // Para birimlerinin karsilastirmasini alin
        WebElement resultElement = driver.findElement(By.xpath("//*[@class='DFlfde SwHCTb']"));
        String result = resultElement.getText().replace(",",".");
        double resultDouble = Double.parseDouble(result);
        Assert.assertTrue(resultDouble<25);

        if(resultDouble<25){
            System.out.println("Sukur hala 25 tl alti");
        }
        else {
            System.out.println("Dolar aldi basini gidiyor");
        }
    }
    @Test
    public void tearDown(){
        driver.close();
    }
}
