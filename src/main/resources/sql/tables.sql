CREATE TABLE students
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name  VARCHAR(25) NOT NULL,
    email      VARCHAR(40) NOT NULL UNIQUE,
    age        INT         NOT NULL
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