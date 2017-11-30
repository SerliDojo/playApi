# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                            integer auto_increment not null,
  name                          varchar(255),
  category                      varchar(255),
  date                          timestamp,
  constraint pk_book primary key (id)
);


# --- !Downs

drop table if exists book;

