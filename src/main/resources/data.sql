INSERT INTO owner (owner_name, social_security_number)
VALUES ('Ron James', 423555543);
INSERT INTO owner (owner_name, social_security_number)
VALUES ('Bob Heisenberg', 333444777);
INSERT INTO owner (owner_name, social_security_number)
VALUES ('Robert Winfeld', 777666888);

INSERT INTO car (color, brand, model, max_speed)
VALUES ('Red', 'Toyota', 'Z45', 300);
INSERT INTO car (color, brand, model, max_speed)
VALUES ('Blue', 'Ford', 'K76', 250);
INSERT INTO car (color, brand, model, max_speed)
VALUES ('Black', 'Crystler', 'IU432', 350);

INSERT INTO bank_account (bank_name, account_number, balance, owner_id)
VALUES ('Danske Bank', 123563423, 40000, 1);
INSERT INTO bank_account (bank_name, account_number, balance, owner_id)
VALUES ('Nordea', 498476345, 100000, 2);
INSERT INTO bank_account (bank_name, account_number, balance, owner_id)
VALUES ('Nordea', 54876435, 15000, 2);
INSERT INTO bank_account (bank_name, account_number, balance, owner_id)
VALUES ('Spar Bank', 888777666, 3000, 3);

INSERT INTO owner_car (owner_id, car_id)
VALUES (1, 1);
INSERT INTO owner_car (owner_id, car_id)
VALUES (1, 2);
INSERT INTO owner_car (owner_id, car_id)
VALUES (2, 2);
INSERT INTO owner_car (owner_id, car_id)
VALUES (3, 3);
