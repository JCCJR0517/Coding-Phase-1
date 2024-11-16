-- Insert sample users
INSERT INTO Users (user_id, username, password_hash, role)
VALUES
    (1, 'admin_user', 'hashed_password1', 'admin'),
    (2, 'faculty_user', 'hashed_password2', 'faculty'),
    (3, 'student_user', 'hashed_password3', 'student');

-- Insert sample students
INSERT INTO Students (student_id, name, email, phone, user_id)
VALUES
    (1, 'John Doe', 'johndoe@example.com', '1234567890', 3),
    (2, 'Jane Smith', 'janesmith@example.com', '9876543210', 3);

-- Insert sample faculty
INSERT INTO Faculty (faculty_id, name, department, email, user_id)
VALUES
    (1, 'Dr. Emily Brown', 'Computer Science', 'emilybrown@example.com', 2),
    (2, 'Dr. Michael Green', 'Mathematics', 'michaelgreen@example.com', 2);

-- Insert sample courses
INSERT INTO Courses (course_id, name, code, faculty_id, schedule)
VALUES
    (1, 'Introduction to Programming', 'CS101', 1, 'MWF 10:00 AM - 11:00 AM'),
    (2, 'Calculus I', 'MATH101', 2, 'TTh 2:00 PM - 3:30 PM');

-- Insert sample enrollments
INSERT INTO Enrollments (enrollment_id, student_id, course_id)
VALUES
    (1, 1, 1), -- John Doe enrolled in CS101
    (2, 2, 2); -- Jane Smith enrolled in MATH101
