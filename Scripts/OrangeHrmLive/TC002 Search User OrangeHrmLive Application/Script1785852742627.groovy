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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('OrangeHrmLive/Page_OrangeHRM/input_Username'), 'Admin')

WebUI.setEncryptedText(findTestObject('OrangeHrmLive/Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('OrangeHrmLive/Page_OrangeHRM/button_Login'))

WebUI.assertElementPresent(findTestObject('OrangeHrmLive/Page_OrangeHRM/h6_Dashboard'), 30)

WebUI.click(findTestObject('OrangeHrmLive/Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('OrangeHrmLive/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('OrangeHrmLive/Page_OrangeHRM/span_Admin'))

WebUI.assertElementText(findTestObject('OrangeHrmLive/Page_OrangeHRM/h5_System Users'), 'System Users', 30)

WebUI.setText(findTestObject('OrangeHrmLive/Page_OrangeHRM/input_oxd-input oxd-input-active'), 'mohit.kumar')

WebUI.click(findTestObject('OrangeHrmLive/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('OrangeHrmLive/Page_OrangeHRM/span_Admin_1'))

WebUI.click(findTestObject('OrangeHrmLive/Page_OrangeHRM/button_Search'))

WebUI.assertElementText(findTestObject('OrangeHrmLive/Page_OrangeHRM/span_No Records Found'), 'No Records Found', 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

