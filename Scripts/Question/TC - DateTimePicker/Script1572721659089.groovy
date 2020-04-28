import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://material-ui.com/components/pickers/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

try {
	WebUI.waitForElementPresent(findTestObject('Object Repository/DatePicker/DatePicker'), 60)
	
	WebElement date = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/DatePicker/DatePicker'),
		30)
	
	WebUI.scrollToElement(findTestObject('Object Repository/DatePicker/DatePicker'), 60)
	
	WebUI.executeJavaScript('arguments[0].value = \'2020-12-24\';', Arrays.asList(date))
	
	WebUI.delay(3)
	
}finally{
	WebUI.closeBrowser()
}