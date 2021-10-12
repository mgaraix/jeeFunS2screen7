--– compiler  personServlet.java
javac -d ..\..\classes dao\PersonDaoImpl.java
javac -d ..\..\classes -cp ..\..\classes;C:\MesAppli\TOMCAT9\apache-tomcat-9.0.44\lib\servlet-api.jar  PersonServlet.java
--- lancer tomcat
cd ../../../../../bin  
catalina.bat run