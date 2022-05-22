drop database if exists prog2122;
create database prog2122;
use prog2122;

/* CREACIÓN DE TABLAS */
start transaction;
	create table if not exists tutores
    (codTutor int unsigned,
    nomTutor varchar(50) not null,
    ape1Tutor varchar(50) not null,
    ape2Tutor varchar(50),
    direccion varchar(100),
    email varchar(100),
    tel char(12) unique,
    constraint pk_tutores primary key (codTutor));
        
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
    codTutor int unsigned,
	constraint pk_alumnado primary key (codAlumnado),
    constraint fk_alumnado_tutores foreign key (codTutor) references tutores(codTutor)
		on delete no action on update cascade);
    
    create table if not exists unidades
    (codUnidad int unsigned,
    numMaxAlum char(4),
    tutoria varchar(50),
    constraint pk_unidades primary key (codUnidad));
commit;
