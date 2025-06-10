-- Creazione delle tabelle nel database, Tabella dei prodotti
create table products (
    id bigint primary key auto_increment, 
    name varchar(255) not null, 
    price integer not null,
    description text not null
);
-- Tabella delle varianti (in relazione ai prodotti)
create table variants(
    id bigint primary key auto_increment,
    product_id bigint not null,
    attribute varchar(255), 
    value varchar(255) not null, 
    foreign key (product_id) references products(id)
);

-- Tabella dei fornitori
create table providers (
    id bigint primary key auto_increment,
    name varchar(255) not null
);

-- Tabella pivot prodotti-fornitori
create table product_provider(
    id bigint primary key auto_increment,
    product_id bigint not null, 
    provider_id bigint not null,
    foreign key (product_id) references products(id),
    foreign key (provider_id) references providers(id)
)