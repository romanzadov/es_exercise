CREATE TABLE customer (
    id varchar(255) not null primary key ,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255),
    electricity_usage_kwh float,
    old_roof smallint(1),
    address_id varchar(255)
);