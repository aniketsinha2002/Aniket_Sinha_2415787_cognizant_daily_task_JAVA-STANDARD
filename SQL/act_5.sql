
-- Filter and Sort Employee Data

-- Run the following query:
    -- SELECT name, department, salary
    -- FROM employees
    -- WHERE salary > 50000
    -- ORDER BY name;
-- Task:

-- Modify this query to only show employees in the 'Sales' department.
-- Change the sort order to descending salary.

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50),
    salary DECIMAL(10,2),
    experience_years INT
);

INSERT INTO employees (id, name, department, salary, experience_years)
VALUES 
    (101, 'Alice Johnson', 'IT', 90000, 6),
    (102, 'Bob Smith', 'Sales', 75000, 4),
    (103, 'Charlie Brown', 'IT', 105000, 7),
    (104, 'David Lee', 'HR', 65000, 8),
    (105, 'Eve Davis', 'Sales', 110000, 10),
    (106, 'Frank White', 'Sales', 95000, 5);

SELECT name, department, salary
FROM employees
WHERE salary > 50000
ORDER BY name;

SELECT name, department, salary
FROM employees
WHERE salary > 50000 AND department = 'Sales'
ORDER BY salary DESC;

