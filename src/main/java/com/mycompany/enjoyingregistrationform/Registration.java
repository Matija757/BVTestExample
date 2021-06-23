package com.mycompany.enjoyingregistrationform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

    public static void performRegistration(WebDriver driver) {
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        // Fill user field
        WebElement registerUser = driver.findElement(By.xpath("/html/body/main/div/div/aside/a"));
        registerUser.click();

        // Fill user field
        WebElement enterName = driver.findElement(By.id("user[first_name]"));
        enterName.sendKeys("Johan");

        // Fill surname field
        WebElement enterSurname = driver.findElement(By.id("user[last_name]"));
        enterSurname.sendKeys("Smith");

        // Fill email field
        WebElement enterEmail = driver.findElement(By.id("user[email]"));
        enterEmail.sendKeys("someone@someone.com");

        // Fill password field
        WebElement enterPassword = driver.findElement(By.id("user[password]"));
        enterPassword.sendKeys("pass1234");

        // Perform signUp click
        WebElement signUp = driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[5]/input"));
        signUp.click();
    }

}
