
-- Create an indexed column and compare query performance before and after indexing.

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    salary DECIMAL(10,2),
    department VARCHAR(50)
);

INSERT INTO employees (id, name, position, salary, department)
VALUES 
    (101, 'Alice Johnson', 'Software Engineer', 90000, 'IT'),
    (102, 'Bob Smith', 'Data Analyst', 75000, 'Finance'),
    (103, 'Charlie Brown', 'Software Engineer', 105000, 'IT'),
    (104, 'David Lee', 'HR Manager', 65000, 'HR'),
    (105, 'Eve Davis', 'Project Manager', 110000, 'Sales'),
    (106, 'Frank White', 'Software Engineer', 95000, 'IT');

EXPLAIN ANALYZE
SELECT name, salary
FROM employees
WHERE salary > 80000;

CREATE INDEX idx_salary ON employees(salary);

EXPLAIN ANALYZE
SELECT name, salary
FROM employees
WHERE salary > 80000;

-- How Indexing Works
-- When you query for specific data (e.g., WHERE salary > 80000), the database typically scans all rows to find matching results.
-- Indexing creates a special structure (often a B-tree) that helps the database jump directly to relevant rows.
-- Instead of scanning every row, the database quickly filters results using the index
