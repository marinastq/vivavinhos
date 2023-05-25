create table vinho(
	id bigint not null auto_increment,
	data_degustacao	datetime null,
    nome varchar(100) not null,
    produtor varchar(100) null,
    uvas varchar(100) not null,
    pais_regiao varchar(100) not null,
    safra varchar(10) not null,
    alcool double not null,
    preco_pago double null,
    tipo_vinho varchar(100) null,
    harmonizacao varchar(200) null,
    observacoes varchar(200) null,
    
    primary key(id)
	
);