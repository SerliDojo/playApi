# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                            serial not null,
  name                          varchar(255),
  category                      varchar(255),
  date                          timestamptz,
  picture_link                  varchar(255),
  editor                        varchar(255),
  resume                        varchar(255),
  is_collection                 boolean,
  num_collection                integer,
  num_max_collection            integer,
  tpye                          varchar(255),
  language                      varchar(255),
  constraint pk_book primary key (id)
);


# --- !Downs

drop table if exists book cascade;

