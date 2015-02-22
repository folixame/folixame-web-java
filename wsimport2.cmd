cls
cd %~dp0
cd src
"C:\Program Files\Java\jdk1.8.0_31\bin\java" -jar ..\tools\wsimport\jaxws-tools.jar -Xnocompile -p me.folixa.ws.events http://156.35.95.51:8080/wsfolixameevents/events?wsdl
pause