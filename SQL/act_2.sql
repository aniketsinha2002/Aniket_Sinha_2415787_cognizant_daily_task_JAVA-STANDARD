-- Write a subquery to identify employees earning above department averages.
-- Apply aggregate functions (SUM, AVG) to compute company expenses.
-- Implement a CASE statement to categorize employees based on salary.
  
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    salary DECIMAL(10,2),
    experience_years INT,
    department_id INT
);

INSERT INTO employees (id, name, position, salary, experience_years, department_id)
VALUES 
    (101, 'Alice Johnson', 'Software Engineer', 90000, 6, 1),
    (102, 'Bob Smith', 'Data Analyst', 75000, 4, 2),
    (103, 'Charlie Brown', 'Software Engineer', 105000, 7, 1),
    (104, 'David Lee', 'HR Manager', 65000, 8, 3),
    (105, 'Eve Davis', 'Project Manager', 110000, 10, 2),
    (106, 'Frank White', 'Software Engineer', 95000, 5, 1);


--employees earning above department averages
SELECT e.id, e.name, e.position, e.salary, e.experience_years, e.department_id
FROM employees e
WHERE e.salary > (
    SELECT AVG(salary) 
    FROM employees 
    WHERE department_id = e.department_id
);

--Compute company salary expenses
SELECT SUM(salary) AS total_salary_expense, AVG(salary) AS average_salary
FROM employees;

--Categorization of employees based on salary
SELECT id, name, position, salary,
    CASE 
        WHEN salary > 100000 THEN 'High Earner'
        WHEN salary BETWEEN 50000 AND 100000 THEN 'Mid Earner'
        ELSE 'Low Earner'
    END AS salary_category
FROM employees;
