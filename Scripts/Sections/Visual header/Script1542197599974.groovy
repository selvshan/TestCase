import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'(GlobalVariable.sec_visualHeader)

WebUI.delay(2)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_backgroundcolor, GlobalVariable.color)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_Border, GlobalVariable.color)

WebUI.setText(findTestObject('Page_MultipleAxesChart - Power BI/span_Transparency'), GlobalVariable.Transparency)

CustomKeywords.'com.powerbi.components.ChartSelect.changeSlider'(GlobalVariable.lbl_Transparency, GlobalVariable.Transparency)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_IconColor, GlobalVariable.color)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'))

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_visualHeader)
