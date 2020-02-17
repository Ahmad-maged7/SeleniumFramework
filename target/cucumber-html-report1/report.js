$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/UserRegistration.feature");
formatter.feature({
  "name": "User Registration",
  "description": "the user shoulb be able to register successfully",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Can Register",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in the homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "click the register link",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters \u003cfirstName\u003e,\u003clastName\u003e,\u003cemail\u003e, \u003cpass\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user should register successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "pass"
      ]
    },
    {
      "cells": [
        "test123",
        "tester",
        "ttTesterqwe@test.com",
        "87654321"
      ]
    },
    {
      "cells": [
        "test1234",
        "testerr",
        "ttTesterqwer@test.com",
        "876543210"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Can Register",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.UserRegistration.the_user_is_in_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the register link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.UserRegistration.click_the_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters test123,tester,ttTesterqwe@test.com, 87654321",
  "keyword": "And "
});
formatter.match({
  "location": "steps.UserRegistration.the_user_enters(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.UserRegistration.user_should_register_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"a.ico-logout\"}\n  (Session info: chrome\u003d80.0.3987.106)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AMaged-MacBook-Air.local\u0027, ip: \u0027fd58:bad4:74ec:4f00:dcf7:abf3:910c:83de%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.1\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.106, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/2k/yv_bf8m57bd...}, goog:chromeOptions: {debuggerAddress: localhost:62869}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c8d9191acc14d005a19996f05fdf0bc4\n*** Element info: {Using\u003dcss selector, value\u003da.ico-logout}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy26.click(Unknown Source)\n\tat pages.PageBase.clickBtn(PageBase.java:27)\n\tat pages.RegisterPage.userLogout(RegisterPage.java:51)\n\tat steps.UserRegistration.user_should_register_successfully(UserRegistration.java:51)\n\tat ✽.user should register successfully(file:///Users/a.maged/eclipse-workspace/TAF/src/test/java/features/UserRegistration.feature:8)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User Can Register",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.UserRegistration.the_user_is_in_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the register link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.UserRegistration.click_the_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters test1234,testerr,ttTesterqwer@test.com, 876543210",
  "keyword": "And "
});
formatter.match({
  "location": "steps.UserRegistration.the_user_enters(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.UserRegistration.user_should_register_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"a.ico-logout\"}\n  (Session info: chrome\u003d80.0.3987.106)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AMaged-MacBook-Air.local\u0027, ip: \u0027fd58:bad4:74ec:4f00:dcf7:abf3:910c:83de%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.1\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.106, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/2k/yv_bf8m57bd...}, goog:chromeOptions: {debuggerAddress: localhost:62869}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c8d9191acc14d005a19996f05fdf0bc4\n*** Element info: {Using\u003dcss selector, value\u003da.ico-logout}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy26.click(Unknown Source)\n\tat pages.PageBase.clickBtn(PageBase.java:27)\n\tat pages.RegisterPage.userLogout(RegisterPage.java:51)\n\tat steps.UserRegistration.user_should_register_successfully(UserRegistration.java:51)\n\tat ✽.user should register successfully(file:///Users/a.maged/eclipse-workspace/TAF/src/test/java/features/UserRegistration.feature:8)\n",
  "status": "failed"
});
});