import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.yatra.com/')

WebUI.navigateToUrl('https://secure.yatra.com/social/common/yatra/signin.htm')

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/failed_data_checkpoint'), false)

WebUI.navigateToUrl('https://secure.yatra.com/social/custom/crp/login.htm')

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/failed_data_checkpoint'), false)

WebUI.navigateToUrl('https://secure.yatra.com/social/custom/b2b/login.htm?returnUrl=https%3A%2F%2Fwww.yatra.com%2Ffresco%2Fagent%2Fhome?unique=6384761562&channel=b2b')

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/faileddd'), false)

WebUI.closeBrowser()

