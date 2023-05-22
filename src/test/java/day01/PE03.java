package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PE03 {
    public static void main(String[] args) throws InterruptedException {

        //         ...Exercise3...
        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        //Click on  Calculater under Micro Apps
        //Type any number in the first input
        //Type any number in the second input
        //Click on Calculate
        //Get the result
        //Print the result
        //

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculatorClick = driver.findElement(By.id("calculatetest"));
        calculatorClick.click();

        WebElement firstInput = driver.findElement(By.id("number1"));
        firstInput.sendKeys("6");
        WebElement secondInput = driver.findElement(By.id("number2"));
        secondInput.sendKeys("7");

        WebElement calculateButton = driver.findElement(By.id("calculate"));
        calculateButton.click();

        WebElement result = driver.findElement(By.id("answer"));
        System.out.println("Sonuc : "+result.getText());

        Thread.sleep(2000);
        driver.close();
    }
}
