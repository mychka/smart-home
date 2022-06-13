CREATE TABLE customer (
    id   uuid PRIMARY KEY,
    name varchar(1000) NOT NULL
);

CREATE TABLE home (
    id     uuid PRIMARY KEY,
    region varchar(1000)
);

CREATE TABLE customer_2_home (
    id          uuid PRIMARY KEY,
    customer_id uuid REFERENCES customer NOT NULL,
    home_id     uuid REFERENCES home     NOT NULL
);

INSERT INTO customer VALUES ('e88b6094-fe29-4653-9aa0-000000000001', 'Лунтик');
INSERT INTO customer VALUES ('e88b6094-fe29-4653-9aa0-000000000002', 'Заяц');
INSERT INTO customer VALUES ('e88b6094-fe29-4653-9aa0-000000000003', 'Кар-Карыч');

INSERT INTO home VALUES ('e88b6094-fe29-4653-9aa0-000000000010', 'Тилимилитрямдия');
INSERT INTO home VALUES ('e88b6094-fe29-4653-9aa0-000000000020', 'Тилимилитрямдия');
INSERT INTO home VALUES ('e88b6094-fe29-4653-9aa0-000000000030', 'Простоквашино');
