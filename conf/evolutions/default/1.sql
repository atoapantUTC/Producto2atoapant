# --- First database schema

# --- !Ups


create table platose (
  id                        bigint not null,
  name                      varchar(255),
  categoria                      varchar(255),
  costo                      varchar(255),
  introduced                timestamp,
  discontinued              timestamp,
  company_id                bigint,
  constraint pk_platose primary key (id))
;



create sequence platose_seq start with 1000;


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;



drop table if exists platose;

SET REFERENTIAL_INTEGRITY TRUE;


drop sequence if exists platose_seq;

