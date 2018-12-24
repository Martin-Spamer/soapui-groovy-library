
log.info("="*40)

log.info("startTime : " + context.expand('${=System.currentTimeMillis()}'))
log.info("nanoStartTime : " + context.expand('${=System.nanoTime()}'))

log.info("Integer.SIZE : " + context.expand('${=Integer.SIZE'))
log.info("Integer.MIN_VALUE : " + context.expand('${=Integer.MIN_VALUE}'))
log.info("Integer.MAX_VALUE : " + context.expand('${=Integer.MAX_VALUE}'))

log.info("Long.SIZE : " + context.expand('${=Long.SIZE}'))
log.info("Long.MIN_VALUE : " + context.expand('${=Long.MIN_VALUE}'))
log.info("Long.MAX_VALUE : " + context.expand('${=Long.MAX_VALUE}'))

log.info("currentLocale : " + context.expand('${=Locale.getDefault()}'))
log.info("randomNumber : " + context.expand('${= new Random().nextInt()}'))
log.info("randomBoolean : " + context.expand('${= new Random().nextBoolean()}'))
log.info("correlationID : " + context.expand('${=java.util.UUID.randomUUID()}'))

log.info("currentTime : " + context.expand('${=Calendar.getInstance().getTime()}'))
log.info("isoDate : " + context.expand('${=new java.text.SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())}'))
log.info("lastWeek : " +  context.expand('${=def lastWeek = new Date() -7;  lastWeek.format("YYYY-MM-dd")}'))
log.info("nextWeek : " +  context.expand('${=def nextWeek = new Date() + 7; nextWeek.format("YYYY-MM-dd")}'))

log.info("systemProperty : " + context.expand('${=System.getProperty("soapui.home")}'))
log.info("systemProperty : " + context.expand('${=System.getProperties()}'))

log.info("nanoEndtTime : " + context.expand('${=System.nanoTime()}'))
log.info("endtTime : " + context.expand('${=System.currentTimeMillis()}'))

log.info("" + CertificateFactory.getInstance("X.509").generateCertificate(new FileInputStream("fileName-of-cert")));
