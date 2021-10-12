javac -d ..\classes -cp person person\dao\PersonDaoImpl.java person\PersonTest.java 
java -cp ..\classes;..\lib\sqlite-jdbc-3.23.1.jar person.PersonTest