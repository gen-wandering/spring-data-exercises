CREATE TABLE students
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name  VARCHAR(25) NOT NULL,
    email      VARCHAR(40) NOT NULL UNIQUE,
    age        INT         NOT NULL
);

CREATE TABLE book
(
    id         SERIAL PRIMARY KEY,
    student_id INT REFERENCES students (id),
    book_name  VARCHAR(50) NOT NULL
);