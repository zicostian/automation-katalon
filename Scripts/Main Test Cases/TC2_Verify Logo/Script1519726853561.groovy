import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.G_NavigatedURL)

WebUI.doubleClick(findTestObject('Content/Page_/div_cq-Overlay cq-Overlay--com'))

WebUI.click(findTestObject('Content/Page_/button_coral-Button coral-Butt'))

WebUI.setText(findTestObject('Content/Page_/Page_AEM Sites/Logo/Page_/input_.headerLogoImage'), '/content/dam/jncw/images/header-desktop-logo.png')

WebUI.click(findTestObject('logo/Page_/i_coral-Icon coral-Icon--sizeS'))

WebUI.click(findTestObject('logo/Page_/div_Content Root'))

WebUI.click(findTestObject('logo/Page_/div_dam'))

WebUI.click(findTestObject('logo/Page_/div_JNCW'))

WebUI.click(findTestObject('logo/Page_/div_Images'))

WebUI.click(findTestObject('logo/Page_/div_header-desktop-logo.png'))

WebUI.click(findTestObject('logo/Page_/i_coral-Icon coral-Icon-sizeXS'))

WebUI.click(findTestObject('logo/Page_/button_coral-MinimalButton cq-'))

WebUI.closeBrowser()

