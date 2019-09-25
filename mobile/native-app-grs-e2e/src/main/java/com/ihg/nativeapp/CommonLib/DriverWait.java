package com.ihg.nativeapp.CommonLib;

import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.HomePage;

/*
* This class contains method to be used for all types of wait
*/

public class DriverWait extends DriverCapabilities {
               

               // wait for particular element present on the screen
               public static void staticWait(int ms) throws InterruptedException {
                              Thread.sleep(ms);
               }
               public static void staticWait() throws InterruptedException {
                              Thread.sleep(5000);
               }

               // wait for particular element present on the screen
               public static void waitById(String id) {
                              WebDriverWait wait = new WebDriverWait(innerDriver, 60);
                              wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));

               }

               // Wait until element is visible
               public static void waitByName(String name) {
                              WebDriverWait obj = new WebDriverWait(innerDriver, 60);
                              obj.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));

               }
               
               public static void waitByXpath(String name) {
                              WebDriverWait obj = new WebDriverWait(innerDriver, 60);
                              obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath(name)));

               }
               // wait for particular element present on the screen
               public static void waitByElementName(MobileElement element) {
                              try {
                                             WebDriverWait wait = new WebDriverWait(innerDriver, 30);
                                             wait.until(ExpectedConditions.visibilityOf(element));
                              } catch (Exception e) {
                                             logger.error("FAIL: Not able to find the element : " + element);
                                             e.printStackTrace();
                              }

}
}
