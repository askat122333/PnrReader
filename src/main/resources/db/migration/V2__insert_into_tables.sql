insert into airports (id, airport_name, airport_pnr, city_name)
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
       (16,'Такома','SEA','Сиэтл'),
       (17,'Брест','BQT','Беларусь');

insert into company_name(id, company_name, company_pnr)
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

insert into flight_number(id, flight_number) VALUES
                                                 (1,'8097'),
                                                 (2,'275'),
                                                 (3,'2254'),
                                                 (4,'7007'),
                                                 (5,'9212'),
                                                 (6,'122'),
                                                 (7,'1513'),
                                                 (8,'8333'),
                                                 (9,'7654');

insert into month(id, month, month_pnr)
values (1,'January','JAN'),(2,'February','FEB'),(3,'March','MAR'),
       (4,'April','APR'),(5,'May','MAY'),(6,'June','JUN'),
       (7,'July','JUL'),(8,'August','AUG'),(9,'September','SEP'),
       (10,'October','OCT'),(11,'November','NOV'),(12,'December','DEC');
insert into airptlane_number(id, name, number_pnr) VALUES
                                                       (1,'Airbus332','332'),
                                                       (2,'AirCo','DH4'),
                                                       (3,'Embrear','E75'),
                                                       (4,'Boeing788','788');
insert into terminal(id, terminal_name) VALUES (1,'HK1');
