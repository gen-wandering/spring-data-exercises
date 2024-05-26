TRUNCATE TABLE students RESTART IDENTITY CASCADE;
TRUNCATE TABLE course RESTART IDENTITY CASCADE;

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
INSERT INTO course (theme)
VALUES ('Agriculture'),
       ('Architecture'),
       ('Computer and Information Sciences'),
       ('Construction Trades'),
       ('Engineering'),
       ('Human Services'),
       ('Library Science'),
       ('Liberal Arts and Sciences Studies and Humanities'),
       ('Personal and Culinary Services'),
       ('Philosophy and Religious Studies'),
       ('Physical Sciences'),
       ('Visual and Performing Arts');
INSERT INTO enrollment (student_id, course_id, enrollment_date)
VALUES (1, 3, '2023-10-11 11:35:52.965975 +00:00'),
       (2, 4, '2023-10-09 11:35:52.989413 +00:00'),
       (2, 6, '2023-10-07 11:35:52.991415 +00:00'),
       (3, 4, '2023-10-08 11:35:52.994415 +00:00'),
       (3, 10, '2023-10-02 11:35:52.996415 +00:00'),
       (4, 3, '2023-10-08 11:35:52.999415 +00:00'),
       (4, 5, '2023-10-06 11:35:53.001415 +00:00'),
       (5, 2, '2023-10-08 11:35:53.002415 +00:00'),
       (6, 3, '2023-10-06 11:35:53.005415 +00:00'),
       (7, 3, '2023-10-05 11:35:53.007531 +00:00'),
       (7, 9, '2023-09-29 11:35:53.009532 +00:00'),
       (8, 1, '2023-10-06 11:35:53.010533 +00:00'),
       (9, 3, '2023-10-03 11:35:53.012532 +00:00'),
       (10, 8, '2023-09-27 11:35:53.014532 +00:00'),
       (10, 11, '2023-09-24 11:35:53.015533 +00:00'),
       (11, 4, '2023-09-30 11:35:53.018098 +00:00'),
       (11, 8, '2023-09-26 11:35:53.020375 +00:00'),
       (12, 8, '2023-09-25 11:35:53.021376 +00:00'),
       (13, 5, '2023-09-27 11:35:53.023507 +00:00'),
       (13, 6, '2023-09-26 11:35:53.024508 +00:00'),
       (14, 4, '2023-09-27 11:35:53.026509 +00:00'),
       (15, 5, '2023-09-25 11:35:53.028509 +00:00'),
       (16, 3, '2023-09-26 11:35:53.029509 +00:00'),
       (16, 7, '2023-09-22 11:35:53.031508 +00:00'),
       (17, 5, '2023-09-23 11:35:53.033509 +00:00'),
       (17, 6, '2023-09-22 11:35:53.034509 +00:00'),
       (18, 5, '2023-09-22 11:35:53.036549 +00:00'),
       (19, 7, '2023-09-19 11:35:53.038551 +00:00'),
       (20, 4, '2023-09-21 11:35:53.039551 +00:00'),
       (20, 11, '2023-09-14 11:35:53.041550 +00:00');

SELECT *
FROM students;

SELECT *
FROM course;

SELECT *
FROM enrollment;

SELECT first_name, last_name, theme
FROM students s
         JOIN enrollment e ON s.id = e.student_id
         JOIN course c ON c.id = e.course_id
ORDER BY theme;