create database if not exists film2;


drop table if exists client;
drop table if exists subscribe;
drop table if exists comentari;
drop table if exists film;
drop table if exists tipfilm;
drop table if exists user;
drop table if exists employees;





create table if not exists user
(
iduser int not null unique auto_increment primary key,
nume varchar(30) not null,
prenume varchar(30) not null,
username varchar(20) not null,
password varchar(20) not null,
type varchar(30) not null
);

create table if not exists tipfilm
(
idfilmtip int not null unique auto_increment primary key,
tipfilm varchar(50) not null
);

create table if not exists film
(
idfilm int not null unique auto_increment primary key,
nume varchar(50) not null,
idfilmtip int not null,
`date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null ,-- bc you allways insert current time in the field
foreign key (idfilmtip) references tipfilm(idfilmtip)
);



create table if not exists subscribe
(
idsubscribe int not null unique auto_increment primary key,
iduser int not null,
idfilmtip int not null,
foreign key (iduser) references user(iduser),
foreign key (idfilmtip) references tipfilm(idfilmtip)
);

create table if not exists comentari
(
idcomentari int not null unique auto_increment primary key,
iduser int not null,
idfilm int not null,
comentariu varchar(100) not null,
nota int not null,
foreign key (iduser) references user(iduser),
foreign key (idfilm) references film(idfilm)
);



insert into user ( nume,prenume,username,password ,type ) values ('state' , 'vasile' , 'salut' ,'1234', 'admin');
insert into user ( nume,prenume ,username,password ,type ) values ('state1' , 'vasile1' , 'salut1' , '1234', 'user');



insert into tipfilm ( tipfilm ) values ('actiune');
insert into tipfilm ( tipfilm ) values ('drama');
insert into tipfilm ( tipfilm ) values ('comedie');


insert into film ( nume,idfilmtip ) values ('Rampage' , 2 );
insert into film ( nume,idfilmtip ) values ('Doom' , 2 );

insert into subscribe ( iduser,idfilmtip ) values (2, 2 );

insert into comentari (iduser ,idfilm,comentariu ,nota ) values (2 , 2 , 'salut1' , 5 );


Select * from film ;
Select * from comentari ;


