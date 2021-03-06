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

CustomKeywords.'com.powerbi.components.ChartSelect.EnableSetting'(GlobalVariable.sec_Legend)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

List<String> initialValue = CustomKeywords.'com.powerbi.components.ChartSelect.getLegend'()

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_vertical, GlobalVariable.verticalAlignment)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_horizontal, GlobalVariable.horizontalAlignment)

CustomKeywords.'com.powerbi.components.ChartSelect.enableToggle'(GlobalVariable.toggle_title)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_legendTitle, GlobalVariable.titleText)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkTitle'('VisualObject/text_highcharts-legend-title'), 
    GlobalVariable.titleText, false, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.powerbi.components.ChartSelect.setColor'(GlobalVariable.lbl_color, GlobalVariable.color)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts-legend-title', 
        GlobalVariable.attr_fill), GlobalVariable.color, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/tspan_highcharts-legend-item', 
        GlobalVariable.attr_fill), GlobalVariable.color, false, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.powerbi.components.ChartSelect.selectValue'(GlobalVariable.lbl_fontFamily, GlobalVariable.fontType)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts-legend-title', 
        GlobalVariable.attr_fontfamily), GlobalVariable.fontType, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/tspan_highcharts-legend-item', 
        GlobalVariable.attr_fontfamily), GlobalVariable.fontType, false, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.powerbi.components.ChartSelect.setValue'(GlobalVariable.lbl_fontSize, GlobalVariable.fontSize)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/text_highcharts-legend-title', 
        GlobalVariable.attr_fontsize), GlobalVariable.font_size_pxl, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(CustomKeywords.'com.powerbi.components.ChartSelect.checkAttributeValue'('VisualObject/tspan_highcharts-legend-item', 
        GlobalVariable.attr_fontsize), GlobalVariable.font_size_pxl, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_MultipleAxesChart - Power BI/div_Revert to default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

List<String> finalValue = CustomKeywords.'com.powerbi.components.ChartSelect.getLegend'()

CustomKeywords.'com.powerbi.components.ChartSelect.compareList'(initialValue, finalValue)

CustomKeywords.'com.powerbi.components.ChartSelect.hideSetting'(GlobalVariable.sec_Legend)

