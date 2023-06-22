package com.harry.guru99.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Huynh Van Phuot
 */
public class Guru99Test {

    private static WebDriver myBrowser;

    @BeforeAll   // hàm chạy trước tất cả các hàm khác của class này
    // hàm chuẩn bị data cho các hàm @Test, tạo môi trường, biến, connection
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        myBrowser = new ChromeDriver();
    }

    @AfterAll  // hàm chạy sau cùng của class này
    // hàm dùng để dọn rác, ram, db do các @Test trước đó, đóng connection, tập tin
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(2000);
        myBrowser.quit();
    }

//    @Test
//    public void testGuru99() throws InterruptedException {
//        myBrowser.get("https://demo.guru99.com/v4/");
//        WebElement txtUsername = myBrowser.findElement(By.name("uid"));
//        WebElement txtPassword = myBrowser.findElement(By.cssSelector("input[name='password']"));
//        WebElement btnLogin = myBrowser.findElement(By.xpath("//input[@name='btnLogin']"));
//        txtUsername.sendKeys("mngr510838");
//        txtPassword.sendKeys("vEqabep");
//        btnLogin.click();
//        Thread.sleep(2000);
//        WebElement lblWelcome = myBrowser.findElement(By.cssSelector("tr[class='heading3'] td"));
////        System.out.println("Welcome text: " + lblWelcome.getText());
//        Assertions.assertEquals("Manger Id : mngr510838", lblWelcome.getText());
//        // Đoạn code mà lấy được value của 1 tag được gọi là tool cào data, CRAWLER 
//        // Đoạn code trên cũng tự động click, tool auto-click
//    }

    public static Object[][] initData() {
        return new Object[][]{
            {"mngr510838", "vEqabep"},
            {"mngr510835", "EmArUpu"},
            {"mngr510529", "UqAdapy"}
        };
    }

    @ParameterizedTest
    @MethodSource (value = "initData")
    public void testGuru99_(String username, String password) throws InterruptedException {
        myBrowser.get("https://demo.guru99.com/v4/");
        WebElement txtUsername = myBrowser.findElement(By.name("uid"));
        WebElement txtPassword = myBrowser.findElement(By.name("password"));
        WebElement btnLogin = myBrowser.findElement(By.name("btnLogin"));
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
        Thread.sleep(2000);
        WebElement lblWelcome = myBrowser.findElement(By.cssSelector("tr[class='heading3'] td"));
        Assertions.assertEquals("Manger Id : " + username, lblWelcome.getText());
    }

}
