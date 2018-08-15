Create Database ProyectoPatrones



Use ProyectoPatrones

Create Table dbo.TUser (
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
	PRIMARY KEY (id_user),
	FOREIGN KEY (company) REFERENCES TCompany (legalNumber)
);

Create Table dbo.TCompany(
	id_company int IDENTITY(1,1) Not null,
	legalNumber varchar(20) Not null,
	name varchar(20) Not null,
	description varchar(100) Not null,
	PRIMARY KEY (legalNumber)
);

Create Table dbo.TDepartament(
	id_departament int IDENTITY(1,1) Not null,
	name varchar(20) Not null,
	id int Not null,
	description varchar(100) Not null,
	companyId int Not null,
	PRIMARY KEY (id_departament),
	FOREIGN KEY (companyId) REFERENCES TCompany(id_company)
);

Create Table dbo.TProcedure(
	id_procedure int IDENTITY(1,1) Not null,
	name varchar(20) Not null,
	companyId varchar(20) Not null,
	description varchar(100) Not null,
	PRIMARY KEY (id_Procedure),
	FOREIGN KEY (companyId) REFERENCES TCompany (legalNumber)
);

Create table dbo.TTask(
	id_task int IDENTITY(1,1) Not null,
	id int Not null,
	name varchar(20) Not null,
	idUsuario varchar(20) null,
	procedureName varchar(20) Not null,
	description varchar (100) Not null,
	state varchar (100) Not null,
	PRIMARY KEY (id_task),
);

Create Table dbo.TRecord(
	id_record int IDENTITY(1,1) Not null,
	taskId int Not null,
	modificationDate date Not null,
	descriptionChange varchar (100) Not null,
	PRIMARY KEY (id_record),
	FOREIGN KEY (taskId) REFERENCES TTask (id_task)
);

Create Table dbo.TAuthenticator(
	id_authenticator int IDENTITY (1,1) Not null,
	userState int Not null,
	authentictorMessage varchar (100) Not null,
	authenticated BIT Not null,
	PRIMARY KEY (id_authenticator)
);

Create Table dbo.TUserAuthenicated(
	id_userAuthenticated int IDENTITY(1,1) Not null,
	name varchar (20) Not null,
	lastName varchar (20) Not null,
	id int Not null,
	userName varchar (20) Not null,
	userType int Not null,
	PRIMARY KEY (id_userAuthenticated)
);

-- inicio de las consultas sql 

-- COMPANIA
INSERT INTO TCompany(legalNumber, name, description) VALUES ('31231234', 'TestCompany', 'description');
SELECT * FROM TCompany;

DELETE FROM TCompany;
DROP TABLE TCompany;
DROP TABLE TProcedure;

-- PROCESOS
INSERT INTO TProcedure (name, companyId, description) VALUES ('TestProcedure', '31231234', 'description');
SELECT * FROM TProcedure ; 
SELECT * FROM TProcedure WHERE name='TestProcedure'; 
SELECT * FROM TProcedure WHERE name= 'Testing';

-- TASK
INSERT INTO Ttask (id, name, idUsuario, procedureName,  description, state) VALUES ('0','Revision',' ','TestProcedure','revisar todo','0');
SELECT * FROM Ttask ; 

SELECT * FROM Ttask WHERE idUsuario= '116290381'; 

UPDATE Ttask SET idUsuario= ' ' WHERE id= '0';



--USUARIOS
//		User newAdmin = new User("Eduardo","Martinez", 01, "abc123", "eduMar", 0);
//		User newEmployee = new User("Carlos","Garro", 02, "abc123", "carGa", 1);

-- INSERT ADMIN
Insert Into TUser (name, lastName, id, password, userName, userType) VALUES ('Eduardo','Martinez','1234','abc123','eduMar','0');


Insert Into TUser (name, lastName, id, password, userName, userType, firm, company, departament) VALUES ('Javier','Pozuelo','1234','abc123','jpoz','1','firma','31231234','12345678');
SELECT * FROM TUser ; 

DELETE FROM TUser WHERE name = '"Eduardo"';	

SELECT * FROM TUser WHERE userType = '1'


	

