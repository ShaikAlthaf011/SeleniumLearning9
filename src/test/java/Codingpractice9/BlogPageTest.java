package Codingpractice9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlogPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      driver.get("https://qabloglist.ccbp.tech/");
      driver.manage().window().maximize();
    }
}
