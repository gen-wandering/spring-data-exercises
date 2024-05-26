TRUNCATE TABLE students RESTART IDENTITY CASCADE;

INSERT INTO students (first_name, last_name, email, age)
VALUES ('Quinton', 'Bins', 'quinton.bins@bestmail.org', 20),
       ('Gustavo', 'Muller', 'gustavo.muller@bestmail.org', 24),
       ('Shannan', 'Bahringer', 'shannan.bahringer@bestmail.org', 28),
       ('Cory', 'Bechtelar', 'cory.bechtelar@bestmail.org', 28),
       ('Lamont', 'Olson', 'lamont.olson@bestmail.org', 23),
       ('Jacqulyn', 'Kohler', 'jacqulyn.kohler@bestmail.org', 28),
       ('Jennine', 'Gerhold', 'jennine.gerhold@bestmail.org', 22),
       ('Kirk', 'Leannon', 'kirk.leannon@bestmail.org', 27),
       ('Jose', 'Kulas', 'jose.kulas@bestmail.org', 23),
       ('Fannie', 'Botsford', 'fannie.botsford@bestmail.org', 20),
       ('Dino', 'Wuckert', 'dino.wuckert@bestmail.org', 19),
       ('Catherine', 'Zboncak', 'catherine.zboncak@bestmail.org', 25),
       ('Zaida', 'Christiansen', 'zaida.christiansen@bestmail.org', 28),
       ('Gina', 'Wyman', 'gina.wyman@bestmail.org', 19),
       ('Adelaida', 'Koepp', 'adelaida.koepp@bestmail.org', 28),
       ('Lucretia', 'Welch', 'lucretia.welch@bestmail.org', 26),
       ('Isiah', 'O''Connell', 'isiah.o''connell@bestmail.org', 20),
       ('Jannie', 'Ebert', 'jannie.ebert@bestmail.org', 23),
       ('Hollis', 'Fay', 'hollis.fay@bestmail.org', 29),
       ('Gayle', 'Gusikowski', 'gayle.gusikowski@bestmail.org', 24);

INSERT INTO student_id_card (student_id, card_number)
VALUES (1, '777-78-7276'),
       (2, '621-60-0270'),
       (3, '227-42-0480'),
       (4, '681-35-9868'),
       (5, '279-36-9859'),
       (6, '794-82-2395'),
       (7, '753-40-9603'),
       (8, '498-23-1705'),
       (9, '113-13-8497'),
       (10, '226-05-3686'),
       (11, '042-53-1880'),
       (12, '233-27-9230'),
       (13, '668-21-1558'),
       (14, '340-76-4501'),
       (15, '148-10-1474'),
       (16, '678-42-5442'),
       (17, '648-05-5668'),
       (18, '632-69-4093'),
       (19, '336-16-6686'),
       (20, '497-81-8537');

SELECT *
FROM students;

SELECT *
FROM student_id_card;

SELECT s.id, first_name, card_number
FROM students s
         JOIN student_id_card sic ON s.id = sic.student_id
ORDER BY s.id;