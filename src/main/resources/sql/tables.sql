CREATE TABLE students
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name  VARCHAR(25) NOT NULL,
    email      VARCHAR(40) NOT NULL UNIQUE,
    age        INT         NOT NULL
);

CREATE TABLE student_id_card
(
    id          SERIAL PRIMARY KEY,
    student_id  INT REFERENCES students (id),
    card_number VARCHAR(25) NOT NULL UNIQUE
);