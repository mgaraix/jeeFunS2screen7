--– compiler  TransferServlet.java
javac -d ..\classes -cp person person\dao\PersonDaoImpl.java
javac -d ..\classes -cp ..\classes;C:\MesAppli\TOMCAT9\apache-tomcat-9.0.44\lib\servlet-api.jar person\TransferServlet.java
--- relancer tomcat   
cd ../../../../bin  
catalina.bat run