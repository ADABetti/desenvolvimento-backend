create database db_empresa_eventos;

use db_empresa_eventos;

create table db_eventos (
id int primary key,
nome varchar(255),
localizacao varchar(255),
preco_ingresso decimal (6,2));

insert into db_eventos values (1, 'Chaves', 'Teatro Santander', 100);
insert into db_eventos values (2, 'Castelo Ratimbum', 'Teatro Santander', 120);

select * from db_eventos;