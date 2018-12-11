
log.info("="*40)

randomNumber = context.expand('${= new Random().nextInt()}')
log.info("randomNumber : "+testRunner.testCase.getPropertyValue("randomNumber"))
testRunner.testCase.setPropertyValue("randomNumber", randomNumber)

randomBoolean = context.expand('${= new Random().nextBoolean()}')
log.info("randomBoolean : " + testRunner.testCase.getPropertyValue("randomBoolean"))
testRunner.testCase.setPropertyValue("randomBoolean", randomBoolean)

correlationID = context.expand('${=java.util.UUID.randomUUID()}')
log.info("correlationID : " + testRunner.testCase.getPropertyValue("correlationID"))
testRunner.testCase.setPropertyValue("correlationID", correlationID)

startTime = context.expand('${=System.currentTimeMillis()}')
log.info("startTime : " + testRunner.testCase.getPropertyValue("startTime"))
testRunner.testCase.setPropertyValue("startTime", startTime)

currentTime = context.expand('${=Calendar.getInstance().getTime()}')
log.info("currentTime : " + testRunner.testCase.getPropertyValue("currentTime"))
testRunner.testCase.setPropertyValue("currentTime", currentTime)

isoDate = context.expand('${=new java.text.SimpleDateFormat("yyyy-mm-dd").format(Calendar.getInstance().getTime())}')
log.info("isoDate : " + testRunner.testCase.getPropertyValue("isoDate"))
testRunner.testCase.setPropertyValue("isoDate", isoDate)

currentLocale = context.expand('${=Locale.getDefault()}')
log.info("currentLocale : " + testRunner.testCase.getPropertyValue("currentLocale"))
testRunner.testCase.setPropertyValue("currentLocale", currentLocale)

systemProperty = context.expand('${=System.getProperty("soapui.home")}')
log.info("systemProperty : " + testRunner.testCase.getPropertyValue("systemProperty"))
testRunner.testCase.setPropertyValue("systemProperty", systemProperty)
