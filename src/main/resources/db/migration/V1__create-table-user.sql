create table users(
    id SERIAL PRIMARY KEY,
    name varchar(100) NOT NULL,
    surname varchar(100) NOT NULL,
    email varchar(100) NOT NULL UNIQUE,
    cell_phone varchar(15),
    cpf varchar(11) NOT NULL UNIQUE
);