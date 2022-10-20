CREATE TABLE address (
    id varchar(255) not null primary key,
    street varchar(255),
    city varchar(255),
    state_code varchar(255),
    postal_code varchar(255) -- Pattern will be validated in code
);