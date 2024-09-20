create database db_escola_tech;
use db_escola_tech;

create table endereco (
id INT auto_increment PRIMARY KEY,
logradouro VARCHAR(255),
bairro VARCHAR(255),
numero INT,
uf CHAR(2),
pais VARCHAR(255));

create table filial (
id INT auto_increment PRIMARY KEY,
nome VARCHAR(255),
cnpj CHAR(14),
id_endereco INT);

ALTER TABLE filial DROP COLUMN id_endereco;
DROP TABLE filial; 

create table filial (
id INT auto_increment PRIMARY KEY,
nome VARCHAR(255),
cnpj CHAR(14),
id_endereco INT,
foreign key (id_endereco) references endereco(id));

INSERT INTO endereco VALUES (01, "Rua Matias",  "Paulista", 2, 'SP', 'Brasil');
INSERT INTO filial VALUES (01, "Wizard", "12345678912345", 1);

SELECT * FROM filial;