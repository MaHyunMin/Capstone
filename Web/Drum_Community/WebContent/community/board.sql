create table boardInfo (
	NUM int unsigned not null auto_increment primary key,
    USERNAME varchar(25) not null unique,
    u_PASSWORD varchar(25) not null,
    TITLE text not null,
    MEMO text not null,
    d_TIME datetime Default current_timestamp,
    HIT int unsigned Default 0,
    REF int unsigned Default 0,
    INDENT int unsigned Default 0,
    STEP int
);

create table boardInfo1 (
	NUM int unsigned not null auto_increment primary key,
    USERNAME varchar(25) not null unique,
    u_PASSWORD varchar(25) not null,
    TITLE text not null,
    MEMO text not null,
    d_TIME datetime Default current_timestamp,
    HIT int unsigned Default 0,
    REF int unsigned Default 0,
    INDENT int unsigned Default 0,
    STEP int
);

create table boardInfo2 (
	NUM int unsigned not null auto_increment primary key,
    USERNAME varchar(25) not null unique,
    u_PASSWORD varchar(25) not null,
    TITLE text not null,
    MEMO text not null,
    d_TIME datetime Default current_timestamp,
    HIT int unsigned Default 0,
    REF int unsigned Default 0,
    INDENT int unsigned Default 0,
    STEP int
);

create table membership (
	NUM int unsigned not null auto_increment primary key,
    u_NAME varchar(25) not null unique,
    u_ID varchar(25) not null unique,
    u_PASSWORD varchar(25) not null
    
);
select * from boardinfo;
insert into boardinfo(USERNAME, u_PASSWORD, TITLE, MEMO) values("hong", "1234", "Test", "testfile");
show tables;
drop table boardInfo;
select * from mysql.db