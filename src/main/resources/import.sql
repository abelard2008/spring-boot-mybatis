drop table if exists city;

create table city (id int primary key auto_increment, name varchar(250), state varchar(8), country varchar(8));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');