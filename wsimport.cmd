cls
cd %~dp0
cd src
"C:\Program Files\Java\jdk1.8.0_31\bin\java" -jar ..\tools\wsimport\jaxws-tools.jar -Xnocompile -p ws.unit6.example1.webservice http://156.35.98.14:8088/folixame/Users.asmx?WSDL
pause