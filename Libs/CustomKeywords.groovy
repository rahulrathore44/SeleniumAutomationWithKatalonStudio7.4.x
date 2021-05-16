
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize

import com.applitools.eyes.selenium.Eyes



def static "com.helper.excel.ExcelHelper.writeTOExcelFile"(
    	String excelPath	
     , 	String sheetName	
     , 	String value	
     , 	int rowNo	
     , 	int colNo	) {
    (new com.helper.excel.ExcelHelper()).writeTOExcelFile(
        	excelPath
         , 	sheetName
         , 	value
         , 	rowNo
         , 	colNo)
}


def static "com.helper.javascript.JavaScriptHelper.executeScript"(
    	String script	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScript(
        	script)
}


def static "com.helper.javascript.JavaScriptHelper.executeScriptOnTestObject"(
    	String string	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScriptOnTestObject(
        	string
         , 	testObject)
}


def static "com.helper.javascript.JavaScriptHelper.executeAndReturnValue"(
    	String script	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeAndReturnValue(
        	script
         , 	testObject)
}

/**
	 * @param topDropDown :- Locator of the top drop down which have item count
	 * @param dropDownItemCount :- Count of the item present in the topDropDown
	 * @param gridItemTestObject :- Base locator for the item present in the grid
	 */
def static "com.question.VerifyInItemGrid.verifyItemInTheGrid"(
    	TestObject topDropDown	
     , 	int dropDownItemCount	
     , 	TestObject gridItemTestObject	) {
    (new com.question.VerifyInItemGrid()).verifyItemInTheGrid(
        	topDropDown
         , 	dropDownItemCount
         , 	gridItemTestObject)
}


def static "com.question.VerifyInItemGrid.multipleTestObject"(
    	String str	
     , 	TestObject objectOne	
     , 	TestObject objectTwo	
     , 	TestObject ObjectThree	) {
    (new com.question.VerifyInItemGrid()).multipleTestObject(
        	str
         , 	objectOne
         , 	objectTwo
         , 	ObjectThree)
}


def static "com.question.UniqueSelection.SelectCheckBox"() {
    (new com.question.UniqueSelection()).SelectCheckBox()
}


def static "com.question.CustomJsonParser.jsonExtractor"(
    	String response	) {
    (new com.question.CustomJsonParser()).jsonExtractor(
        	response)
}


def static "com.question.GetMetrics.getAlarmsCountfromGA"() {
    (new com.question.GetMetrics()).getAlarmsCountfromGA()
}


def static "com.question.RandomEmail.getEmail"(
    	String suffix	
     , 	String prefix	) {
    (new com.question.RandomEmail()).getEmail(
        	suffix
         , 	prefix)
}


def static "com.helper.navigate.NavigationHelper.navigateToMenuItem"(
    	String menuName	) {
    (new com.helper.navigate.NavigationHelper()).navigateToMenuItem(
        	menuName)
}


def static "com.helper.grid.GridHelper.GetValueFromGrid"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.helper.grid.GridHelper()).GetValueFromGrid(
        	baseTestObject
         , 	rowIndex
         , 	colIndex)
}


def static "com.helper.grid.GridHelper.getValueOrClickOnColumn"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	
     , 	String type	) {
    (new com.helper.grid.GridHelper()).getValueOrClickOnColumn(
        	baseTestObject
         , 	rowIndex
         , 	colIndex
         , 	type)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.question.UniqueScreenShot.takeScreenShot"(
    	String path	
     , 	String name	) {
    (new com.question.UniqueScreenShot()).takeScreenShot(
        	path
         , 	name)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.helper.login.LoginHelper.loginIntoApplication"(
    	String applicationUrl	
     , 	String Username	
     , 	String Password	) {
    (new com.helper.login.LoginHelper()).loginIntoApplication(
        	applicationUrl
         , 	Username
         , 	Password)
}


def static "com.helper.login.LoginHelper.loginIntoApplicationWith"() {
    (new com.helper.login.LoginHelper()).loginIntoApplicationWith()
}


def static "com.helper.login.LoginHelper.logoutFromApplication"() {
    (new com.helper.login.LoginHelper()).logoutFromApplication()
}


def static "com.question.CustomDatabase.executeQuery"(
    	String connectionUrl	
     , 	String query	) {
    (new com.question.CustomDatabase()).executeQuery(
        	connectionUrl
         , 	query)
}


def static "com.question.CustomSendKeys.TypeInText"(
    	TestObject aLocator	
     , 	String text	) {
    (new com.question.CustomSendKeys()).TypeInText(
        	aLocator
         , 	text)
}


def static "com.question.CustomSendKeys.TypeInTextBoxWithWait"(
    	TestObject aLocator	
     , 	String text	
     , 	int timeOutInSeconds	) {
    (new com.question.CustomSendKeys()).TypeInTextBoxWithWait(
        	aLocator
         , 	text
         , 	timeOutInSeconds)
}


def static "com.helper.browserhelper.CustomBrowser.openBrowser"() {
    (new com.helper.browserhelper.CustomBrowser()).openBrowser()
}


def static "com.helper.browserhelper.CustomBrowser.openBrowserWithUrl"(
    	String url	) {
    (new com.helper.browserhelper.CustomBrowser()).openBrowserWithUrl(
        	url)
}


def static "com.helper.browserhelper.CustomBrowser.closeBrowser"() {
    (new com.helper.browserhelper.CustomBrowser()).closeBrowser()
}


def static "com.question.VerifyAllElements.scrollAndVerfiyElement"(
    	String tagName	) {
    (new com.question.VerifyAllElements()).scrollAndVerfiyElement(
        	tagName)
}


def static "com.question.VerifyMultipleElement.verifyElement"(
    	String[] testObject	) {
    (new com.question.VerifyMultipleElement()).verifyElement(
        	testObject)
}


def static "com.question.ClickAnyLink.wrapperClick"(
    	String linkName	) {
    (new com.question.ClickAnyLink()).wrapperClick(
        	linkName)
}


def static "com.question.BrowserTab.openNewTab"() {
    (new com.question.BrowserTab()).openNewTab()
}
