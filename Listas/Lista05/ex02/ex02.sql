create database db_floricultura;

use db_floricultura;

create table tb_flores (
id int primary key auto_increment,
especie varchar(255),
preco decimal (5,2));

insert into tb_flores values (1, 'orquidea', 40);
insert into tb_flores values (default, 'rosa', 19.99);

select * from tb_flores;