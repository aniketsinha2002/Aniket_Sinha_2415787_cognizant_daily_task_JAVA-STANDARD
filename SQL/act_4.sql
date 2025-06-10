-- Normalize a sample database structure to eliminate redundant data.

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100)
);

INSERT INTO departments (department_id, department_name)
VALUES 
    (1, 'IT'),
    (2, 'Sales'),
    (3, 'HR'),
    (4, 'Finance');

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10,2),
    experience_years INT,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO employees (id, name, salary, experience_years, department_id)
VALUES 
    (101, 'Alice Johnson', 90000, 6, 1),
    (102, 'Bob Smith', 75000, 4, 2),
    (103, 'Charlie Brown', 105000, 7, 1),
    (104, 'David Lee', 65000, 8, 3),
    (105, 'Eve Davis', 110000, 10, 2),
    (106, 'Frank White', 95000, 5, 4);

select * from employees;

select * from departments