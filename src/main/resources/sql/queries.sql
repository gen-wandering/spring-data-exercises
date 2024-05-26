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

INSERT INTO book (student_id, book_name)
VALUES (1, 'An Acceptable Time'),
       (1, 'Paths of Glory'),
       (1, 'A Monstrous Regiment of Women'),
       (2, 'A Time of Gifts'),
       (3, 'Specimen Days'),
       (3, 'The Soldier''s Art'),
       (3, 'Shall not Perish'),
       (4, 'Absalom, Absalom!'),
       (4, 'The Last Temptation'),
       (4, 'The Skull Beneath the Skin'),
       (5, 'The Violent Bear It Away'),
       (5, 'That Hideous Strength'),
       (6, 'Everything is Illuminated'),
       (6, 'Blood''s a Rover'),
       (7, 'East of Eden'),
       (7, 'The Skull Beneath the Skin'),
       (7, 'Now Sleeps the Crimson Petal'),
       (8, 'To Your Scattered Bodies Go'),
       (9, 'Bury My Heart at Wounded Knee'),
       (9, 'I Will Fear No Evil'),
       (9, 'Behold the Man'),
       (9, 'Everything is Illuminated'),
       (10, 'A Swiftly Tilting Planet'),
       (10, 'The Mirror Crack''d from Side to Side'),
       (11, 'Precious Bane'),
       (11, 'Of Human Bondage'),
       (11, 'Consider the Lilies'),
       (12, 'The Needle''s Eye'),
       (12, 'Noli Me Tangere'),
       (12, 'The House of Mirth'),
       (12, 'Bury My Heart at Wounded Knee'),
       (13, 'Oh! To be in England'),
       (13, 'Taming a Sea Horse'),
       (14, 'The Moon by Night'),
       (14, 'Infinite Jest'),
       (14, 'The Daffodil Sky'),
       (15, 'A Summer Bird-Cage'),
       (15, 'Butter In a Lordly Dish'),
       (16, 'The Last Temptation'),
       (16, 'Number the Stars'),
       (16, 'The Golden Bowl'),
       (16, 'Wildfire at Midnight'),
       (17, 'Blue Remembered Earth'),
       (17, 'Françoise Sagan'),
       (18, 'Cover Her Face'),
       (18, 'The House of Mirth'),
       (19, 'Paths of Glory'),
       (19, 'As I Lay Dying'),
       (19, 'The Wives of Bath'),
       (20, 'Cover Her Face'),
       (20, 'O Pioneers!'),
       (20, 'Time of our Darkness');

SELECT *
FROM students;

SELECT *
FROM book;

SELECT s.first_name, s.last_name, s.age, count(*) amount_of_books
FROM students s
         JOIN book b ON s.id = b.student_id
GROUP BY s.first_name, s.last_name, s.age
ORDER BY amount_of_books DESC;