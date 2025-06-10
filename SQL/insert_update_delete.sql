
-- Insert new records into a sample employees table. 
-- Update the salary of employees with more than five years of experience. 
-- Delete inactive customer records based on last login timestamps

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    salary DECIMAL(10,2),
  	experience_years INT,
	last_login DATETIME
);

INSERT INTO employees (id, name, position, salary, experience_years, last_login)
VALUES (101, 'John Doe', 'Software Engineer', 60000, 3, '2024-06-10'),
       (102, 'Jane Smith', 'Project Manager', 80000, 6, '2023-12-01');

UPDATE employees
SET salary = salary * 1.10  --10%
WHERE experience_years > 5;

DELETE FROM employees
WHERE last_login < DATE('now', '-1 years');

