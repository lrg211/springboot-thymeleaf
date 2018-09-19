[About this project]
The demo codes are related to the integration of VIP & Springboot Thymeleaf. For VIP, this demo demonstrates how to use VIP Java client to make the code change for demo project;
for the demo project, it demonstrates how to change the i18n implemetation from traditional to VIP implemetation.

[Usage]
The usage steps:
1. cd to \springboot-thymeleaf\libs\vip-service\vip-i18n-service and execute this command to start VIP service:
java -jar vip-manager-i18n-1.3.0.jar
2. Open this url to check if the VIP service works well, the result would be a sucessfull message:
https://localhost:8090/i18n/api/v1/translation/product/Testing/component/JAVA/key/com.vmware.test?version=1.0.0&locale=zh-Hans&collectSource=false&pseudo=false
3. Import this project into your IDE like eclipse and start the Webapplication as java application, it's spring boot.
4. Open a browser and change the language setting to Simplified Chinese then open url: http://localhost:8080/hello, there's a simplified chinese from VIP service will shown up.

[Addtional features]
More features:
a. change the pseudo to true in src/main/resources/vipconfig.properties, the UI will show pseudo translation
b. cd \springboot-thymeleaf\libs\vip-service\vip-l10n-service and execute 'java -jar vip-manager-l10n.jar', then change collectSource to true in vipconfig.properties, then for any new strings.
   added in src/main/resources/i18n/messages.properties will be sent to l10n service for translation, the new strings could be found in the C:\l10n\bundles\Testing\1.0.0\JAVA\messages_latest.json.
c. Add more language bundle to vip service, change the browser setting to this language and refresh UI to show new language.
d. Enable MT by releasing these codes in com.vmware.springthymeleaf.i18n.Translation
   //RequestParam requestParam = new RequestParam();
   //requestParam.setParams(RequestParam.MACHINE_TRANSLATION, "true");
   //RequestUtility.setRequestParam(requestParam);
