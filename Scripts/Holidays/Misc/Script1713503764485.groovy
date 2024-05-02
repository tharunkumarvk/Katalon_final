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
selenium.open("https://www.yatra.com/holidays")
selenium.click("id=BE_holiday_leaving_city")
selenium.type("id=BE_holiday_leaving_city", "chenna")
selenium.type("id=holiday_destination_city", "maldives")
selenium.sendKeys("id=holiday_destination_city", Keys.ENTER)
selenium.click("id=holiday_destination_city")
selenium.click("xpath=//div[@id='BE_holiday_destination_details']/div/div/div/div/span[3]/span")
selenium.click("xpath=//div[@id='BE_holiday_destination_details']/div/div/div/div[2]/div/div/ul/li[3]")
selenium.click("id=BE_holiday_search_btn")
selenium.open("https://packages.yatra.com/holidays/wait.htm?departureCityId=183944&destination=Maldives&monthYear=MAY%202024")
selenium.open("https://packages.yatra.com/holidays/intl/search.htm?parentPageId=83f18fd4-08af-4182-a55a-2207ffc688a2&destination=Maldives&departureCityId=183944")
selenium.click("xpath=//div[@id='srpRoot']/section[2]/div[2]/div[4]/div[2]/div[2]/div/button")
selenium.open("https://packages.yatra.com/holidays/intl/details.htm?packageId=MPP-1863-42840&parentPageId=c8eb48a0-eb13-4395-abe7-ea5a4306e2d1")
selenium.click("xpath=//section[@id='calendar']/div[2]/div[2]/div[2]/div/ul[3]/li[5]")
selenium.click("xpath=//div[@id='stateName']/span/select")
selenium.select("xpath=//div[@id='stateName']/span/select", "label=Gujarat")
selenium.click("xpath=//section[@id='pnacalendar']/div[3]/div[3]/button")
selenium.open("https://secure.yatra.com/holidays/intl/review.htm?packageId=MPP-1863-42840&refId=1704240071387&parentPageId=a73ef80a-4a97-4255-8e79-d217e16e9903&packageStatus=bookNow&isPWA=false")
