CREATE EXTENSION IF NOT EXISTS "pgcrypto";

create table users(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name varchar(100) NOT NULL,
    surname varchar(100) NOT NULL,
    email varchar(100) NOT NULL UNIQUE,
    cell_phone varchar(15),
    cpf varchar(11) NOT NULL UNIQUE
);