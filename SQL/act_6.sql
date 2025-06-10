-- Activity 2: You’re a Data Engineer investigating employee compensation anomalies.
-- Task:

-- Write a query to find the top 3 highest-paid employees.

-- Then, write another query to find employees whose salary is above the company average.

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    salary DECIMAL(10,2),
    department VARCHAR(50),
    experience_years INT
);


INSERT INTO employees (id, name, position, salary, department, experience_years)
VALUES 
    (101, 'Alice Johnson', 'Software Engineer', 90000, 'IT', 6),
    (102, 'Bob Smith', 'Sales Executive', 75000, 'Sales', 4),
    (103, 'Charlie Brown', 'Software Engineer', 105000, 'IT', 7),
    (104, 'David Lee', 'HR Manager', 65000, 'HR', 8),
    (105, 'Eve Davis', 'Project Manager', 110000, 'Sales', 10),
    (106, 'Frank White', 'Software Engineer', 95000, 'IT', 5);


SELECT * from employees;

SELECT id, name, position, salary
FROM employees
ORDER BY salary DESC
LIMIT 3;

SELECT id, name, position, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);
