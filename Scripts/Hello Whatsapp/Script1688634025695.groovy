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

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://docs.katalon.com/docs/plugins-and-add-ons/katalon-recorder-extension/get-your-job-done/automate-scenarios/create-your-first-automation-script-in-katalon-recorder')

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/span_LE PARLEMENT'))

WebUI.rightClick(findTestObject('Object Repository/Page_WhatsApp/span_LE PARLEMENT'))

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/span_LE PARLEMENT'))

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/span_Ndongo MTN'))

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/div_Taper un message'))

WebUI.setText(findTestObject('Object Repository/Page_WhatsApp/div_Gloire  lHomme Fort famille'), '<p class="selectable-text copyable-text iq0m558w" style="" dir="ltr"><span class="selectable-text copyable-text" data-lexical-text="true" style="">Gloire à l\'Homme Fort famille</span></p>')

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/div_input_message'))

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/div_input_message'))

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/div_input_message'))

WebUI.click(findTestObject('Object Repository/Page_WhatsApp/span'))

