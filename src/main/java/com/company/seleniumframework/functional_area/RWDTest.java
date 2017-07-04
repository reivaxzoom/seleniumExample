///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.company.seleniumframework.functional_area;
//
///**
// *
// * @author Xavier
// */
//import java.io.IOException;
//import junit.framework.TestCase; //removes need for annotations by extending
//import org.openqa.selenium.*;
//import org.openqa.selenium.remote.*;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//import org.junit.Test;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class RWDTest extends TestCase {
//    private WebDriver driver;
//    
//    @Override
//    public void setUp() throws Exception {
//        DesiredCapabilities capabillities = DesiredCapabilities.firefox();
////        capabillities.setCapability("version", "16");
//        capabillities.setCapability("platform", Platform.UNIX);
//        capabillities.setCapability("name", "Testing Selenium-2 Remote WebDriver");
//
//        driver = new RemoteWebDriver( new URL("http://192.168.99.100:4446/wd/hub"), capabillities);
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.manage().window().setPosition(new Point(220, 10));
////	driver.manage().window().setSize(new Dimension(1000,650));
//    }
//
//   
//    
////      @Test
////  public void pageTitleAfterSearchShouldBeginWithDrupal()  {
////    WebElement searchField = driver.findElement(By.name("q"));
////    searchField.sendKeys("Drupal!");
////    searchField.submit();
////    
////    assertTrue("The page title should start with the search string after the search.",
////            (new WebDriverWait(driver, 30)).until(new ExpectedCondition<Boolean>() {
////            public Boolean apply(WebDriver d) {
////                return d.getTitle().toLowerCase().startsWith("drupal!");
////            }
////        }));
////  }
//  
//  @Test
//  public void testSimple(){
//        driver.get("http://www.google.com");
//        WebElement element = driver.findElement(By.name("q"));
////        // Enter something to search for
//        element.sendKeys("Cheese!");
////        // Now submit the form. WebDriver will find the form for us from the element
//        element.submit();
////
////        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
////        
//        // Google's search is rendered dynamically with JavaScript.
//        // Wait for the page to load, timeout after 10 seconds
//        assertTrue("title of cheese",(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        }));
//
//        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());
//        
//        //Close the browser
//        driver.quit();
//    }
//      
//       @Test
//    public void testSimple1() throws Exception {
//        this.driver.get("http://www.google.com");
//        assertEquals("Google", this.driver.getTitle());
//    }
//  
//
//    @Override
//    public void tearDown() throws Exception {
//        this.driver.quit();
//    }
//}
