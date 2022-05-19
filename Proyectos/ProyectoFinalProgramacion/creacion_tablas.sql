create database prog2122;
use prog2122;

/* CREACIÓN DE TABLAS */
start transaction;
	create table if not exists departamentos
    (codDept int unsigned,
    nomDept varchar(50),
    datosDept varchar(100),
    constraint pk_departamentos primary key (codDept));
    
    create table if not exists personal
    (codPersonal int unsigned,
    codDept int unsigned,
    email varchar(100),
    telefono varchar(12) unique,
    direccion varchar(100),
    codPostal char(5),
    provincia varchar(30),
    constraint pk_personal primary key (codPersonal),
    constraint fk_personal_departamentos foreign key (codDept)
		references departamentos(codDept));
        
	create table if not exists profesorado
    (codProfesorado int unsigned,
    codPersonal int unsigned,
    nomProf varchar(50) not null,
    ape1Prof varchar(50) not null,
    ape2Prof varchar(50),
    direccion varchar(100),
    email varchar(100),
    tel char(12) unique,
    constraint pk_profesorado primary key (codProfesorado),
    constraint fk_profesorado_personal foreign key (codPersonal)
		references personal(codPersonal));
        
	create table if not exists alumnado
	(codAlumnado int unsigned,
	nombreAlumnado varchar(50),
	ape1Alumnado varchar(20),
	ape2Alumnado varchar(20),
	direccion varchar(60),
	codpostal char(5),
	provincia varchar(10),
	alergias boolean,
	desAlergias varchar(50),
	constraint pk_alumnado primary key (codAlumnado));
    
    create table if not exists unidades
    (codUnidad int unsigned,
    codAlumnado int unsigned,
    numMaxAlum char(4),
    tutoria varchar(50),
    codProfesorado int unsigned,
    constraint pk_unidades primary key (codUnidad),
    constraint fk_unidades_alumnado foreign key (codAlumnado)
		references alumnado(codAlumnado),
	constraint fk_unidades_profesorado foreign key (codProfesorado) references profesorado(codProfesorado)
		on delete no action on update cascade);
    
    create table if not exists tramos
    (codTramo int unsigned,
    hora time,
    fecha date,
    constraint pk_tramos primary key (codTramo));
    
    create table if not exists dias
    (codDia int unsigned,
    fecha date,
    constraint pk_dias primary key (codDia));
    
    create table if not exists materias
    (codMateria int unsigned,
    desMateria varchar(100),
    constraint pk_materias primary key (codMateria));
    
    create table if not exists sanciones
    (codSancion int unsigned,
    fecha date,
    descripcion text,
    constraint pk_sanciones primary key (codSancion));
    
    create table if not exists gravedad
    (codGravedad int unsigned,
    desGrav text,
    constraint pk_gravedad primary key (codGravedad));

	create table if not exists representante1
	(codRepre1 int not null,
	direccion varchar(60),
	telefono char(9),
	codAlumnado int unsigned,
	constraint pk_repre1 primary key (codRepre1),
	constraint fk_repre1_alumnado foreign key (codAlumnado) references alumnado(codAlumnado)
		on delete no action on update cascade);
		
	create table if not exists representante2
	(codRepre2 int not null,
	direccion varchar(60),
	telefono char(9),
	codAlumnado int unsigned,
	constraint pk_repre2 primary key (codRepre2),
	constraint fk_repre2_alumnado foreign key (codAlumnado) references alumnado(codAlumnado)
		on delete no action on update cascade);
commit;
    
