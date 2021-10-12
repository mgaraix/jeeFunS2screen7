CREATE TABLE persons(
	id INT NOT NULL PRIMARY KEY,
	nom VARCHAR(80),
	prenom VARCHAR(80),
	age INT );
	
INSERT INTO persons VALUES (1,'Hauteterre','Jérémy', 15);
INSERT INTO persons VALUES (2,'Prâles','Aloïs', 25);
INSERT INTO persons VALUES (3,'Dufrêne','Guillaume', 35);
INSERT INTO persons VALUES (4,'Senturier','Lionel', 45);
INSERT INTO persons VALUES (5,'Garaix','Michel', 55);
INSERT INTO persons VALUES (6,'Merstäns','Wim', 65);

SELECT * FROM persons;