package com.mycompany.enjoyingregistrationform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

    public static void registrationMethod() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().fullscreen();
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        WebElement registerUser = driver.findElement(By.xpath("/html/body/main/div/div/aside/a"));
        registerUser.click();

        WebElement enterName = driver.findElement(By.id("user[first_name]"));
        enterName.sendKeys("Johan");

        WebElement enterSurname = driver.findElement(By.id("user[last_name]"));
        enterSurname.sendKeys("Smith");

        WebElement enterEmail = driver.findElement(By.id("user[email]"));
        enterEmail.sendKeys("someone@someone.com");

        WebElement enterPassword = driver.findElement(By.id("user[password]"));
        enterPassword.sendKeys("pass1234");

        WebElement signUp = driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[5]/input"));
        signUp.click();
    }

}
