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
selenium.open("https://www.yatra.com/bus-booking")
selenium.click("id=BE_bus_from_station")
selenium.type("id=BE_bus_from_station", "chenna")
selenium.click("xpath=//div[@id='booking_engine_modues']/div/div/div[2]/ul/li/div/div/ul/div/div/div/li/span[2]")
selenium.type("id=BE_bus_to_station", "vellore")
selenium.click("id=BE_bus_depart_date")
selenium.click("id=18/04/2024")
selenium.click("id=BE_bus_search_btn")
selenium.open("https://ebus.yatra.com/busview/busdesktop/search?src=Chennai&srcStnCode=YTChennai&dest=Vellore&destStnCode=YTVellore&tt=O&ddate=2024-04-18&qty=1&source=fresco")
selenium.click("xpath=//div[@id='rowHeading']/div[3]")
selenium.click("xpath=//div[@id='rowHeading']/div[5]")
selenium.click("xpath=//div[@id='busDesktop']/div/div[6]/div[3]/div/div[6]/button/div")
selenium.click("xpath=//div[@id='tab-lower']/div/div/div[2]/ul[4]/li[6]/i")
selenium.click("xpath=//div[@id='city']/div/div/div/div/select")
selenium.click("xpath=//div[@id='city']/div/div/div[2]/div/select")
selenium.select("xpath=//div[@id='city']/div/div/div[2]/div/select", "label=Vellore Byepass - 04:00 PM")
selenium.click("xpath=//div[@id='city']/div/div/button/div")
selenium.open("https://secure.yatra.com/busview/busdesktop/review?superPNR=1704240075614&smid=e27544e4-02ca-4c7d-b4af-4a4b3d5d0717&tt=o&src=Chennai&srcStnCode=YTChennai&dest=Vellore&destStnCode=YTVellore&ddate=2024-04-18&qty=1")
