create table Usuario (
UUID_Usuario varchar2(150) not null,
nombre_usuario varchar2(50) not null,
contra_usuario varchar2(50) not null
);

create table ticket(
UUID_Ticket varchar2(150) not null,
num_ticket int not null,
titulo varchar2(20) not null,
descripcion varchar2(100) not null,
autor varchar2(50) not null,
email_autor varchar2(50) not null,
fecha_ticket DATE not null,
estado varchar2(50) not null,
fecha_fin_ticket DATE not null
);
