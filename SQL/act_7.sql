-- Design & Query Your Own Mini-Database
-- Instructions:

-- Create 2–3 simple related tables (e.g., books, authors, publishers).

-- Insert your own sample data (3–5 rows per table).

-- Write creative queries:

-- Join books with authors.

-- List top authors by number of books.

-- Filter books by genre or publication year.
 



CREATE TABLE Authors (
    AuthorID INT PRIMARY KEY,
    Name VARCHAR(100),
    Country VARCHAR(50)
);

CREATE TABLE Publishers (
    PublisherID INT PRIMARY KEY,
    Name VARCHAR(100),
    Location VARCHAR(50)
);

CREATE TABLE Books (
    BookID INT PRIMARY KEY,
    Title VARCHAR(150),
    Genre VARCHAR(50),
    PublicationYear INT,
    AuthorID INT,
    PublisherID INT,
    FOREIGN KEY (AuthorID) REFERENCES Authors(AuthorID),
    FOREIGN KEY (PublisherID) REFERENCES Publishers(PublisherID)
);


INSERT INTO Authors (AuthorID, Name, Country) VALUES
(1, 'J.K. Rowling', 'United Kingdom'),
(2, 'George Orwell', 'United Kingdom'),
(3, 'Haruki Murakami', 'Japan');

select * from Authors;

INSERT INTO Publishers (PublisherID, Name, Location) VALUES
(1, 'Bloomsbury', 'London'),
(2, 'Penguin', 'New York'),
(3, 'Shinchōsha', 'Tokyo');

select * from Publishers;

INSERT INTO Books (BookID, Title, Genre, PublicationYear, AuthorID, PublisherID) VALUES
(1, 'Harry Potter and the Philosopher’s Stone', 'Fantasy', 1997, 1, 1),
(2, '1984', 'Dystopian', 1949, 2, 2),
(3, 'Kafka on the Shore', 'Magical Realism', 2002, 3, 3),
(4, 'Animal Farm', 'Political Satire', 1945, 2, 2),
(5, 'Norwegian Wood', 'Drama', 1987, 3, 3);

select * from Books;


SELECT B.Title, A.Name AS Author
FROM Books B
JOIN Authors A ON B.AuthorID = A.AuthorID;

SELECT A.Name AS Author, COUNT(B.BookID) AS NumberOfBooks
FROM Books B
JOIN Authors A ON B.AuthorID = A.AuthorID
GROUP BY A.Name
ORDER BY NumberOfBooks DESC;


SELECT Title, Genre, PublicationYear
FROM Books
WHERE Genre = 'Fantasy';

SELECT Title, Genre, PublicationYear
FROM Books
WHERE PublicationYear >= 2000;
