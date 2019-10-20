CREATE TABLE app_text (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  text varchar(4000) NOT NULL,
  domain varchar(40) not null,
  PRIMARY KEY (id),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;