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
    STEP int not null
);
select * from boardinfo;
show tables;
drop table boardInfo

