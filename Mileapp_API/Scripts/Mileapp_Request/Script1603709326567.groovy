import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('Mileapp_Request_Demo'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'model.full_name', "helkia")

WS.verifyElementPropertyValue(response, 'model.email', "helkiapasaribu@yahoo.com")

WS.verifyElementPropertyValue(response, 'model.phone', "+6282360660090")

WS.verifyElementPropertyValue(response, 'model.organization_name', "Uang Teman")

