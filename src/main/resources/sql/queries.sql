TRUNCATE TABLE course, teachers RESTART IDENTITY CASCADE;

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

INSERT INTO teachers (first_name, last_name, email)
VALUES ('Lester', 'Robinson', 'lester.robinson@bestmail.com'),
       ('Diane', 'Hughes', 'diane.hughes@bestmail.com'),
       ('Melissa', 'Fisher', 'melissa.fisher@bestmail.com'),
       ('Pearl', 'Castillo', 'pearl.castillo@bestmail.com'),
       ('Teresa', 'Griffith', 'teresa.griffith@bestmail.com');

INSERT INTO teacher_course (teacher_id, course_id)
VALUES (4, 5),
       (4, 2),
       (4, 7),
       (4, 12),
       (2, 3),
       (5, 10),
       (5, 5),
       (2, 6),
       (3, 4),
       (1, 12),
       (1, 11),
       (5, 2),
       (1, 8),
       (3, 8),
       (3, 2),
       (2, 9),
       (3, 6),
       (3, 1),
       (5, 3),
       (1, 3),
       (3, 9);

SELECT *
FROM course;

SELECT *
FROM teachers;

SELECT first_name, last_name, email, theme
FROM teachers t
         JOIN teacher_course te ON t.id = te.teacher_id
         JOIN course c ON c.id = te.course_id
ORDER BY first_name, last_name;