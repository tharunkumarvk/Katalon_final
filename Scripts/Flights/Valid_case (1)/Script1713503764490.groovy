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
selenium.open("https://www.yatra.com/")
selenium.click("id=BE_flight_origin_city")
selenium.type("id=BE_flight_origin_city", "chenna")
selenium.click("xpath=//div[@id='BE_flight_form_wrapper']/div/div[2]/ul/li/ul/li/div/div/ul/div/div/div/li/div/p[2]")
selenium.type("id=BE_flight_arrival_city", "goa")
selenium.click("xpath=//div[@id='BE_flight_form_wrapper']/div/div[2]/ul/li/ul/li[3]/div/div/ul/div/div/div/li/div/p[2]")
selenium.click("xpath=//div[@id='BE_flight_form_wrapper']/div[3]/div/div/a/i")
selenium.click("xpath=//li[@id='armedforces_offer']/a/i")
selenium.click("xpath=//li[@id='seniorcitizen_offer']/a/i")
selenium.click("xpath=//li[@id='seniorcitizen_offer']/div/span")
selenium.click("xpath=//li[@id='seniorcitizen_offer']/div/span")
selenium.click("xpath=//li[@id='special_student_offer']/a/i")
selenium.click("id=BE_flight_flsearch_btn")
selenium.open("https://flight.yatra.com/air-search-ui/dom2/trigger?type=R&viewName=normal&flexi=0&noOfSegments=2&specialfaretype=STU&origin=MAA&originCountry=IN&destination=GOI&destinationCountry=IN&flight_depart_date=22/05/2024&arrivalDate=25/05/2024&ADT=4&CHD=0&INF=0&non_stop=1&class=Economy&source=fresco-home&unqvaldesktop=1669838195542")
