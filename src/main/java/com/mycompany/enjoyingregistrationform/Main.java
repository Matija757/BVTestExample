
package com.mycompany.enjoyingregistrationform;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    private static WebDriver driver;

    public static void main(String[] args) {
        initialiseEnv();

        driver.get("https://courses.ultimateqa.com/users/sign_in");

        // Input email address
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("matijalosic@yahoo.com");

        // Input password
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("1234abcd");

        // Perform login click
        WebElement loginButton = driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[4]/input"));
        loginButton.click();

        releaseEnv();
    }

    /**
     * Initialize environment
     */
    private static void initialiseEnv() {
        // set Driver to Chrome
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        // wait 10 seconds for driver
        new WebDriverWait(driver, 10);

        driver.manage().window().fullscreen();
    }

    /**
     * Release environment
     */
    private static void releaseEnv() {
//        driver.quit();
    }
}
