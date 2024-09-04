$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 2,
  "name": "Contact Us functionality on drugs.com",
  "description": "",
  "id": "contact-us-functionality-on-drugs.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3253089800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The user is on drugs.com Homepage.",
  "keyword": "Given "
});
formatter.match({
  "location": "DrugsHomePageSteps.the_user_is_on_drugs_com_Homepage()"
});
formatter.result({
  "duration": 110587100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User can fill out the form through contact us button on the homepage.",
  "description": "",
  "id": "contact-us-functionality-on-drugs.com;user-can-fill-out-the-form-through-contact-us-button-on-the-homepage.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "The user clicks on the Contact Us button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Clicks on the Contact form button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Selects the app feedback/suggestion from the drop down.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Fills out the Name,Email address and Message",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Selects the checkbox to accept the policy",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Clicks on the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "DrugsHomePageSteps.the_user_clicks_on_the_Contact_Us_button()"
});
formatter.result({
  "duration": 6050505000,
  "status": "passed"
});
formatter.match({
  "location": "DrugsContactPageSteps.clicks_on_the_Contact_form_button()"
});
formatter.result({
  "duration": 9565694200,
  "status": "passed"
});
formatter.match({
  "location": "DrugsFormPageSteps.selects_the_app_feedback_suggestion_from_the_drop_down()"
});
formatter.result({
  "duration": 3276606100,
  "status": "passed"
});
formatter.match({
  "location": "DrugsFormPageSteps.fills_out_the_Name_Email_address_and_Message()"
});
formatter.result({
  "duration": 9550158500,
  "status": "passed"
});
formatter.match({
  "location": "DrugsFormPageSteps.selects_the_checkbox_to_accept_the_policy()"
});
formatter.result({
  "duration": 3142637900,
  "status": "passed"
});
formatter.match({
  "location": "DrugsFormPageSteps.clicks_on_the_Submit_button()"
});
formatter.result({
  "duration": 3203415600,
  "status": "passed"
});
formatter.after({
  "duration": 938177100,
  "status": "passed"
});
formatter.uri("Drugs\u0026Medication.feature");
formatter.feature({
  "line": 2,
  "name": "Drug \u0026 Medication functionality",
  "description": "",
  "id": "drug-\u0026-medication-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2734990800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "\r\nGiven:The user is on the Drugs.com homepage.",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "The User searches for Metformin information",
  "description": "",
  "id": "drug-\u0026-medication-functionality;the-user-searches-for-metformin-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user clicks on Drugs \u0026 Medication",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enters the drug name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the drug information is provided.",
  "keyword": "Then "
});
formatter.match({
  "location": "DrugsHomePageSteps.the_user_clicks_on_Drugs_Medication()"
});
formatter.result({
  "duration": 3135521300,
  "status": "passed"
});
formatter.match({
  "location": "DrugsSearchPageSteps.enters_the_drug_name()"
});
formatter.result({
  "duration": 5219835400,
  "status": "passed"
});
formatter.match({
  "location": "DrugsSearchPageSteps.clicks_on_the_search_button()"
});
formatter.result({
  "duration": 9622137400,
  "status": "passed"
});
formatter.match({
  "location": "DrugsResultPageSteps.the_drug_information_is_provided()"
});
formatter.result({
  "duration": 2255855700,
  "status": "passed"
});
formatter.after({
  "duration": 1057417000,
  "status": "passed"
});
formatter.uri("NewDrugs.feature");
formatter.feature({
  "line": 2,
  "name": "New Drugs functionality",
  "description": "",
  "id": "new-drugs-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2747942000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "\r\nGiven:The user is on the Drugs.com homepage.",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "The User searches for New Drugs",
  "description": "",
  "id": "new-drugs-functionality;the-user-searches-for-new-drugs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user clicks on new drugs",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should get all new drugs related information",
  "keyword": "Then "
});
formatter.match({
  "location": "DrugsHomePageSteps.the_user_clicks_on_new_drugs()"
});
formatter.result({
  "duration": 2665091800,
  "status": "passed"
});
formatter.match({
  "location": "DrugsHomePageSteps.user_should_get_all_new_drugs_related_information()"
});
formatter.result({
  "duration": 84700,
  "status": "passed"
});
formatter.after({
  "duration": 880977100,
  "status": "passed"
});
formatter.uri("PetStoreApi.feature");
formatter.feature({
  "line": 2,
  "name": "Petstore API Testing",
  "description": "",
  "id": "petstore-api-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 2290176500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Pet CRUD API",
  "description": "",
  "id": "petstore-api-testing;pet-crud-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Create pet",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Get pet",
  "keyword": "And "
});
formatter.match({
  "location": "ApiPetStoreStepDef.create_pet()"
});
formatter.result({
  "duration": 3230453100,
  "error_message": "io.restassured.module.jsv.JsonSchemaValidationException: java.io.FileNotFoundException: C:\\Users\\eguru\\OneDrive\\Documents\\GitHub\\BrandNewProjectTemplateForHulk\\src\\test\\resource\\ApiResponseSchemas\\CreatePetResponse.json (The system cannot find the file specified)\r\n\tat io.restassured.module.jsv.JsonSchemaValidator$JsonSchemaValidatorFactory.create(JsonSchemaValidator.java:286)\r\n\tat io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema(JsonSchemaValidator.java:157)\r\n\tat hulk.api.restassured.PetstoreRestAssuredActions.createPet(PetstoreRestAssuredActions.java:29)\r\n\tat hulk.drugs.stepDef.ApiPetStoreStepDef.create_pet(ApiPetStoreStepDef.java:10)\r\n\tat ✽.Given Create pet(PetStoreApi.feature:6)\r\nCaused by: java.io.FileNotFoundException: C:\\Users\\eguru\\OneDrive\\Documents\\GitHub\\BrandNewProjectTemplateForHulk\\src\\test\\resource\\ApiResponseSchemas\\CreatePetResponse.json (The system cannot find the file specified)\r\n\tat java.io.FileInputStream.open0(Native Method)\r\n\tat java.io.FileInputStream.open(Unknown Source)\r\n\tat java.io.FileInputStream.\u003cinit\u003e(Unknown Source)\r\n\tat com.github.fge.jackson.JsonLoader.fromFile(JsonLoader.java:160)\r\n\tat io.restassured.module.jsv.JsonSchemaValidator$3.createSchemaInstance(JsonSchemaValidator.java:155)\r\n\tat io.restassured.module.jsv.JsonSchemaValidator$3.createSchemaInstance(JsonSchemaValidator.java:152)\r\n\tat io.restassured.module.jsv.JsonSchemaValidator$JsonSchemaValidatorFactory.create(JsonSchemaValidator.java:284)\r\n\tat io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema(JsonSchemaValidator.java:157)\r\n\tat hulk.api.restassured.PetstoreRestAssuredActions.createPet(PetstoreRestAssuredActions.java:29)\r\n\tat hulk.drugs.stepDef.ApiPetStoreStepDef.create_pet(ApiPetStoreStepDef.java:10)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:80)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:714)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:767)\r\n\tat org.testng.TestRunner.run(TestRunner.java:617)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:334)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:240)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1198)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1123)\r\n\tat org.testng.TestNG.run(TestNG.java:1031)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:283)\r\n\tat org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:75)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:120)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:379)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:340)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:125)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:413)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ApiPetStoreStepDef.get_pet()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1002333300,
  "status": "passed"
});
formatter.uri("PetstoreUserApiTesting.feature");
formatter.feature({
  "line": 2,
  "name": "Petstore  API Testing",
  "description": "",
  "id": "petstore--api-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 2463204200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Pet CRUD API",
  "description": "",
  "id": "petstore--api-testing;pet-crud-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Create user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Get user",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Update user",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Delete user",
  "keyword": "Then "
});
formatter.match({
  "location": "PetstoreUserApiSteps.create_user()"
});
formatter.result({
  "duration": 769232800,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreUserApiSteps.get_user()"
});
formatter.result({
  "duration": 176270200,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreUserApiSteps.update_user()"
});
formatter.result({
  "duration": 173623700,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreUserApiSteps.delete_user()"
});
formatter.result({
  "duration": 176382600,
  "status": "passed"
});
formatter.after({
  "duration": 823648000,
  "status": "passed"
});
formatter.uri("SideEffects.feature");
formatter.feature({
  "line": 2,
  "name": "Side Effects functionality",
  "description": "",
  "id": "side-effects-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2332751800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "\r\nGiven:The user is on the Drugs.com homepage.",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "The User searches Side Effects for Adderall",
  "description": "",
  "id": "side-effects-functionality;the-user-searches-side-effects-for-adderall",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user clicks on Side Effects",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enters the drug name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the Side Effects is provided.",
  "keyword": "Then "
});
formatter.match({
  "location": "DrugsHomePageSteps.the_user_clicks_on_Side_Effects()"
});
formatter.result({
  "duration": 32798770400,
  "status": "passed"
});
formatter.match({
  "location": "DrugsSearchPageSteps.enters_the_drug_name()"
});
formatter.result({
  "duration": 5298937900,
  "status": "passed"
});
formatter.match({
  "location": "DrugsSearchPageSteps.clicks_on_the_search_button()"
});
formatter.result({
  "duration": 6732745900,
  "status": "passed"
});
formatter.match({
  "location": "SideEffectsResultPageSteps.the_Side_Effects_is_provided()"
});
formatter.result({
  "duration": 100602600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//*[text()\u003d\u0027Adderall\u0027])\"}\n  (Session info: chrome\u003d128.0.6613.119)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-S20TJ16\u0027, ip: \u0027192.168.1.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 128.0.6613.119, chrome: {chromedriverVersion: 128.0.6613.119 (6e439cfca4d..., userDataDir: C:\\Users\\eguru\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:62735}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: aa7f5ae019ce75ca1badf21f783f3587\n*** Element info: {Using\u003dxpath, value\u003d(//*[text()\u003d\u0027Adderall\u0027])}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat hulk.drugs.pageAction.SideEffectsResultPageActions.verifySideEffects(SideEffectsResultPageActions.java:20)\r\n\tat hulk.drugs.stepDef.SideEffectsResultPageSteps.the_Side_Effects_is_provided(SideEffectsResultPageSteps.java:13)\r\n\tat ✽.Then the Side Effects is provided.(SideEffects.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1712573500,
  "status": "passed"
});
});