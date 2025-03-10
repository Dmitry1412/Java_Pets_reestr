-- create database human_friends;
use human_friends;

drop table if exists animals, dogs, cats, camels, hourses, donkeys , hamsters ;

create table animals (
id bigint auto_increment primary key,
name_animal varchar(20),
is_pet boolean,
type_animal varchar(10)
);

create table dogs (
id_dog bigint primary key,
birthday date not null,
commands varchar (100),
foreign key (id_dog) references animals(id)
on delete cascade
on update cascade
);

create table cats (
id_cat bigint primary key,
birthday date not null,
commands varchar (100),
foreign key (id_cat) references animals(id)
on delete cascade
on update cascade
);

create table hamsters (
id_ham bigint primary key,
birthday date not null,
commands varchar (100),
foreign key (id_ham) references animals(id)
on delete cascade
on update cascade
);

create table camels (
id_camel bigint primary key,
birthday date not null,
commands varchar (100),
foreign key (id_camel) references animals(id)
on delete cascade
on update cascade
);

create table hourses (
id_hs bigint primary key,
birthday date not null,
commands varchar (100),
foreign key (id_hs) references animals(id)
on delete cascade
on update cascade
);

create table donkeys (
id_don bigint primary key,
birthday date not null,
commands varchar (100),
foreign key (id_don) references animals(id)
on delete cascade
on update cascade
);


-- Добавление питомца

-- кот
insert animals (name_animal, is_pet, type_animal)
values 
("Васька", '1', "cat" );

insert cats (id_cat, birthday, commands)
values 
(last_insert_id(),'2022-08-14', "Кис-Кис");

-- собака
insert animals (name_animal, is_pet, type_animal)
values 
("Жучка", '1', "dog" );

insert dogs (id_dog, birthday, commands)
values 
(last_insert_id(),'2020-06-01', "сидеть, лежать, дай лапу");

-- хомяк
insert animals (name_animal, is_pet, type_animal)
values 
("Фред", '1', "hamster");

insert hamsters (id_ham, birthday)
values 
(last_insert_id(),'2023-06-01');

-- лошадь
insert animals (name_animal, is_pet, type_animal)
values 
("Есаул", '0', "hourse");

insert hourses (id_hs, birthday, commands)
values 
(last_insert_id(),'2019-02-12',"jump, say igogogo");

-- осел
insert animals (name_animal, is_pet, type_animal)
values 
("Юлий", '0', "donkey");

insert donkeys (id_don, birthday)
values 
(last_insert_id(),'2019-02-12');

-- верблюд
insert animals (name_animal, is_pet, type_animal)
values 
("Юлий", '0', "camel");

insert camels (id_camel, birthday)
values 
(last_insert_id(),'2015-05-11');

-- удаление верблюдов
delete from animals 
where type_animal = "camel";

drop table camels;

-- объединение вьючных животных
create table pack_animal (
id_pa bigint primary key,
birthday date not null,
commands varchar (100),
foreign key (id_pa) references animals(id)
on delete cascade
on update cascade
);


insert into pack_animal
select * from hourses;

insert into pack_animal
select * from donkeys ;

drop table hourses;
drop table donkeys ;

-- создание таблицы молодые животные
create temporary table animals as
select * , 'вьючные животные' as genus, FROM pack_animal pa 
union select *, 'Собаки' AS genus FROM dogs
union select *, 'Кошки' AS genus FROM cats
union select *, 'Хомяки' AS genus FROM hamsters;

CREATE TABLE yang_animal AS
SELECT Birthday, Commands, genus, TIMESTAMPDIFF(MONTH, Birthday, CURDATE()) AS Age_in_month
FROM animals WHERE Birthday BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);
 
SELECT * FROM yang_animal;

-- объединение таблиц

select a.name_animal ,a.type_animal , c.birthday , c.commands
from cats c 
left join animals a on a.id = c.id_cat 
union 
select a2.name_animal , a2.type_animal , d.birthday , d.commands
from dogs d 
left join animals a2 on a2.id = d.id_dog 
union
select a3.name_animal , a3.type_animal , h.birthday , h.commands
from hamsters h 
left join animals a3 on a3.id = h.id_ham
union 
select a4.name_animal , a4.type_animal , pa.birthday , pa.commands
from pack_animal pa 
left join animals a4 on a4.id = pa.id_pa;

