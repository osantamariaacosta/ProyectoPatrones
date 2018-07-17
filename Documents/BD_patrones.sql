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
	id_company int IDENTITY(1,1) Not null,
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

Create Table tProcedure(
	id_procedure int IDENTITY(1,1) Not null,
	name varchar(20) Not null,
	companyId int Not null,
	description varchar(100) Not null,
	taskList 
	PRIMARY KEY (id_Procedure),
	FOREIGN KEY (companyId) REFERENCES Company (id_company)
);

Create table Task(
	id_task int IDENTITY(1,1) Not null,
	id int Not null,
	procedureId int Not null,
	description varchar (100) Not null,
	state varchar (100) Not null,
	PRIMARY KEY (id_task),
	FOREIGN KEY (procedureId) REFERENCES tProcedure(id_procedure)
	);

Create Table Record(
	id_record int IDENTITY(1,1) Not null,
	taskId int Not null,
	modificationDate date Not null,
	descriptionChange varchar (100) Not null,
	PRIMARY KEY (id_record)
	);

Create Table Authenticator(
	id_authenticator int IDENTITY (1,1) Not null,
	userState int Not null,
	authentictorMessage varchar (100) Not null,
	authenticated BIT Not null,
	PRIMARY KEY (id_authenticator)
	);

Create Table UserAuthenicated(
	id_userAuthenticated int IDENTITY(1,1) Not null,
	name varchar (20) Not null,
	lastName varchar (20) Not null,
	id int Not null,
	userName varchar (20) Not null,
	userType int Not null,
	PRIMARY KEY (id_userAuthenticated)
);




	


	

