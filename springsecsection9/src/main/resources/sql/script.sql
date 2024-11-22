create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);

insert ignore into users values ('user','{noop}eazyBytes@12345','1');
insert ignore into authorities values ('user','read');

insert ignore into users values ('admin','{bcrypt}$2a$12$rz17oL/Wdf2yX4EZJoYZPupcoFrn0uMOe1sqCxfxCN27ASqz8GdMm','1');
insert ignore into authorities values ('admin','admin');

CREATE TABLE `customer` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `email` varchar(45) NOT NULL,
                            `pwd` varchar(200) NOT NULL,
                            `role` varchar(45) NOT NULL,
                            PRIMARY KEY (`id`)
);
