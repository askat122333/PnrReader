create table public.airports
(
    id           bigint       not null
        primary key,
    airport_name varchar(255),
    airport_code  varchar(255),
    city_name    varchar(255) not null
);

create table public.company_name
(
    id           bigint not null
        primary key,
    company_name varchar(255),
    company_code  varchar(255)
);

create table public.pnr_history
(
    id                bigint not null
        primary key,
    company_name      varchar(255),
    date              varchar(255),
    flight_number     varchar(255),
    month             varchar(255),
    airplane_number   varchar(255),
    arrival_airport   varchar(255),
    arrival_time      varchar(255),
    departure_airport varchar(255),
    departure_time    varchar(255),
    terminal          varchar(255),
    week_day          varchar(255)
);


create table public.users
(
    id           bigint not null
        primary key,
    username        varchar(255),
    email        varchar(255),
    password     varchar(255),
    phone_number varchar(255),
    role         varchar(255)
);

insert into airports (id, airport_name, airport_code, city_name)
VALUES (1,'Gatwick','LGW','London'),
       (2,'Vancouver','YVR','Vancouver'),
       (3,'Абакан','ABA','Россия'),
       (4,'Актау','SCO','Казахстан'),
       (5,'Газипаша','GZP','Турция'),
       (6,'Андижан','AZN','Узбекистан'),
       (7,'Афины','ATH','Греция'),
       (8,'Ашхабад','ASB','Туркменистан'),
       (9,'Баку','GYD','Азербайджан'),
       (10,'Батуми','BUS','Грузия'),
       (11,'Борисполь','KBP','Украина'),
       (12,'Курган-Тюбе','KQT','Таджикистан'),
       (13,'Брест','BQT','Беларусь'),
       (14,'Хитроу','LHR','Лондон'),
       (15,'Портленд','PDX','Портленд'),
       (16,'Такома','SEA','Сиэтл');

insert into company_name(id, company_name, company_code)
values (1,'Air Canada','AC'),
       (2,'Air Transat','TS'),
       (3,'Alaska Airlines','AS'),
       (4,'American Airlines','AA'),
       (5,'Smartavia','5N'),
       (6,'Dagestan Airlines','N2'),
       (7,'Saudi Arabian Airlines','SV'),
       (8,'Atlasjet Ukraine','UH'),
       (9,'Atlasjet Airlines','KK'),
       (10,'Bek Air','Z9'),
       (11,'Binter Canarias','NT');