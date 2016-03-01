//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DatebaseLastNameTesting extends junit.framework.TestCase{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://preview.7wjvq4win7yqr5290rnqr5weq318m2t9uuo5qnoi3bs2a9k9.box.codeanywhere.com/Inisope/web%20(Responsive%20Design)/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDatebaseLastNameTesting() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.linkText("IniDirect")).click();
    new Select(driver.findElement(By.name("Search"))).selectByVisibleText("Last Name");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("Walters");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    driver.get(baseUrl);
    new Select(driver.findElement(By.name("Search"))).selectByVisibleText("Last Name");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("Holder");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    driver.get(baseUrl);
    new Select(driver.findElement(By.name("Search"))).selectByVisibleText("Last Name");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("Hirrin");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    driver.get(baseUrl);
    driver.findElement(By.linkText("IniDirect")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
