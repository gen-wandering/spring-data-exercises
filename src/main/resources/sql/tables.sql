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

CREATE TABLE book
(
    id         SERIAL PRIMARY KEY,
    student_id INT REFERENCES students (id),
    book_name  VARCHAR(50) NOT NULL
);

CREATE TABLE course
(
    id    SERIAL PRIMARY KEY,
    theme VARCHAR(100)
);

CREATE TABLE enrollment
(
    student_id      INT NOT NULL,
    course_id       INT NOT NULL,
    enrollment_date TIMESTAMP WITH TIME ZONE,

    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES students (id),
    FOREIGN KEY (course_id) REFERENCES course (id)
);

CREATE TABLE teachers
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name  VARCHAR(25) NOT NULL,
    email      VARCHAR(40) NOT NULL UNIQUE
);

CREATE TABLE teacher_course
(
    teacher_id INT NOT NULL,
    course_id  INT NOT NULL,

    PRIMARY KEY (teacher_id, course_id),
    FOREIGN KEY (teacher_id) REFERENCES teachers (id),
    FOREIGN KEY (course_id) REFERENCES course (id)
);