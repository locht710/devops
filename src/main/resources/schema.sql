create table if not exists advertisement (
  id BIGSERIAL,
  content VARCHAR(100),
  sale BIGINT,
  PRIMARY  KEY (id)
);