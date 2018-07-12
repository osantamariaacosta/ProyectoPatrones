Create Database ProyectoPatrones

Use ProyectoPatrones

Create Table User(
	id_user int IDENTITY(1,1) Not null,
	name varchar (20) Not null,
	lastName varchar (20) Not null,
	id int Not null,
	password varchar (12) Not null,
	userName varchar (10) Not Null,
	userType int  Not null,
	firm varchar(20) null,
	company varchar(20) null,
	departament varchar(20), 
	PRIMARY KEY (id_user)
);

Create Table Company(
	id_comanpy int IDENTITY(1,1) Not null,
	legalNumber int Not null,
	name varchar(20) Not null,
	description varchar(100) Not null,
	PRIMARY KEY (id_company)
);

Create Table Departament(
	id_departament int IDENTITY(1,1) Not null,
	name varchar(20) Not null,
	id int Not null,
	description varchar(100) Not null,
	companyId int Not null,
	PRIMARY KEY (id_departament),
	FOREIGN KEY companyId REFERENCES Company(id_company)
	);

Create table Prcedure(
	id_procedure int IDENTITY(1,1) Not null,
	name varchar(20) Not null,
	companyId int Not null,
	description varchar(100) Not null,
	taskList 
	PRIMARY KEY (id_Procedure),
	FOREIGN KEY companyId REFERENCES Company (id_company)
);



	


	

