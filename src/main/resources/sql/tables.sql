CREATE TABLE course
(
    id    SERIAL PRIMARY KEY,
    theme VARCHAR(100)
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