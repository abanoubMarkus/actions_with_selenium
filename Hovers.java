package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Hovers')]")).getText());
        Actions a = new Actions(driver);
        //Hovers
        a.moveToElement(driver.findElement(By.xpath("//*[@class='figure']//parent::div//child::div[3]"))).build().perform();
        System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'name: user3')]")).getText());

        //right click
        a.moveToElement(driver.findElement(By.xpath("//*[@class='figure']//parent::div//child::div[2]"))).contextClick().build().perform();
        //click and hold
        a.moveToElement(driver.findElement(By.xpath("//*[@class='figure']//parent::div//child::div[2]"))).clickAndHold().build().perform();



        //driver.quit();

    }
}
