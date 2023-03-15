create table public.airports
(
    id           bigint       not null
        primary key,
    airport_name varchar(255),
    airport_pnr  varchar(255),
    city_name    varchar(255) not null
);
create table public.airptlane_number
(
    id         bigint not null
        primary key,
    name       varchar(255),
    number_pnr varchar(255)
);
create table public.company_name
(
    id           bigint not null
        primary key,
    company_name varchar(255),
    company_pnr  varchar(255)
);

create table public.flight_number
(
    id            bigint not null
        primary key,
    flight_number varchar(255)
);

create table public.month
(
    id        bigint not null
        primary key,
    month     varchar(255),
    month_pnr varchar(255)
);

create table public.pnrs
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

create table public.terminal
(
    id            bigint not null
        primary key,
    terminal_name varchar(255)
);

create table public.users
(
    id           bigint not null
        primary key,
    login        varchar(255),
    password     varchar(255),
    phone_number varchar(255),
    role         varchar(255)
);


