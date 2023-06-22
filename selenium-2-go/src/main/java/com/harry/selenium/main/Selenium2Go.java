/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.harry.selenium.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Huynh Van Phuot
 */
public class Selenium2Go {

    public static void main(String[] args) {
        playWithGoogleSearch();
    }
    
    /* Functional Testing - Test chức năng của app đúng hay sai
     K quan tâm đến code, dân QC test app thì k qtam code của app 
     vì test app là test chức năng, màn hình xử lí đúng hay sai
    Test xem app chạy nhanh hay chậm (Black box)
    Để kiểm thử code, chức năng, hiệu năng, QC phải viết các test case
    mục đích để thống kê xem test case đã bao sân/ bao bọc/ cover bao nhiêu
    tình huống xài app/ hàm
    còn để biết case nào đúng, sai khi run hàm
    Unit Test phải có test case
    Functional Test phải có test case
    bộ data input vào và expected value và step để dùng hàm, app 
    
    Test case 1: check gg search run well or not with a keyword
    1. Open a browser
    2. Type url: https://google.com
    3. Click enter 
    4. Type a keyword
    5. Click enter to excute
    Expected result: 
        3.1 GG search page is shown
        5.1 All pages with the keyword are shown
    Nếu ai đó đọc theo các bước trên và làm lại = tay thì là 
    Manual Testing
    Nếu toàn bộ các bước này được chạy = code (Selenium, Katalon, 
    Aka Test, Ranorex, Telẻik, Test Complete gọi là Automation Testing
    Code điều khiển web app hay lệnh điều khiển web app qua tool
    gọi là Test Script
    */
    public static void playWithGoogleSearch() {
        WebDriver myBrowser;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // nạp phần mềm trung gian giúp điều khiển trình duyệt qua code thay người
        // vào trong RAM. Nếu coi browser là db (chứa tags) thì jdbc tương đương Web Driver
        // ~ Class.forName() trong jdbc load driver trong JVM
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");
        opt.addArguments("--lang=ja-JP");
        myBrowser = new ChromeDriver(opt);
        myBrowser.get("https://google.com");
        myBrowser.manage().window().maximize();
        
        // ta định vị 1 tag trong myBrowser
        // mỗi tag được xem là 1 object
        // chuỗi định vị 1 tag where ra 1 tag trong cây DOM
        WebElement searchBox = myBrowser.findElement(By.name("q"));
        searchBox.sendKeys("Bird land");
        searchBox.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Selenium2Go.class.getName()).log(Level.SEVERE, null, ex);
        }
        myBrowser.quit();
    }
}
