import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://packages.yatra.com/holidays/intl/search.htm?parentPageId=83f18fd4-08af-4182-a55a-2207ffc688a2&destination=Maldives&departureCityId=183944")
selenium.click("id=holidayDestination")
selenium.type("id=holidayDestination", "ladakh")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Destination'])[1]/following::span[1]")
selenium.click("id=holidayDeparture")
selenium.type("id=holidayDeparture", "benga")
selenium.click("xpath=//section[@id='modifySearch']/div/div/div/div[2]/div[2]/div/span[2]")
selenium.click("id=holidayMonth")
selenium.click("xpath=//section[@id='modifySearch']/div/div/div/div[2]/div[3]/div/span[4]")
selenium.click("xpath=//section[@id='modifySearch']/div/div/div/div[2]/button")
selenium.open("https://packages.yatra.com/holidays/wait.htm")
selenium.open("https://packages.yatra.com/holidays/dom/search.htm?parentPageId=2d9505ca-7a9f-46f4-9712-754f610a02a4&destination=Ladakh&departureCityId=218")
selenium.click("link=Popular")
selenium.click("link=Duration")
selenium.click("xpath=//a[contains(text(),'Price')]")
selenium.click("xpath=//a[contains(text(),'Price')]")
selenium.click("link=Recently Added")
selenium.click("link=Best Of Ladakh With Nubra And Pangong Lake ( Premium)")
selenium.open("https://packages.yatra.com/holidays/dom/details.htm?packageId=MPP-1863-40863&parentPageId=0bdcb17e-f991-40e6-8fdd-e711d5e40bf2")
selenium.click("xpath=//main[@id='main-container']/div[2]/div/div/ul/li[2]/a")
selenium.click("xpath=//button[@onclick='showCalendar();']")
selenium.click("xpath=//section[@id='pnacalendar']/div[3]/div[2]/div/div[2]/div[2]/table/tbody/tr[2]/td[8]/div/span[2]")
selenium.click("xpath=//button[@onclick='showCalendar();']")
selenium.click("xpath=//section[@id='pnacalendar']/div[3]/div[2]/div/div[2]/div/div[3]/button")
selenium.click("xpath=//section[@id='pnacalendar']/div[3]/div[2]/div/div[2]/div/div[3]/button")
selenium.click("xpath=//section[@id='pnacalendar']/div[3]/div[2]/div/div[2]/div/div[3]/button")
selenium.click("xpath=//section[@id='pnacalendar']/h3/a/i")
selenium.open("https://packages.yatra.com/holidays/dom/search.htm?parentPageId=2d9505ca-7a9f-46f4-9712-754f610a02a4&destination=Ladakh&departureCityId=218")
