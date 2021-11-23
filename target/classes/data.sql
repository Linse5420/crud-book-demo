
INSERT INTO AUTHOR(AUTHOR_ID, FIRST_NAME, LAST_NAME)
    VALUES
    (     NULL, 'Craig','Wells'    ),
    (     NULL, 'Joshua','Bloch'   ),
    (     NULL, 'Alex','Antonov'   ),
    (     NULL, 'Joyce','Farrell'  ),
    (     NULL, 'Cay','Horstmann'  ), 
    (     NULL, 'Janet','Gregory'  ), 
    (     NULL, 'Greg','Turnquist' ),
    (     NULL, 'Walter','Savich'  ),
    (     NULL, 'John','Carnell'   ),
    (     NULL, 'murach','john' ),
    (     NULL, 'Walter','khan'  ),
    (     NULL, 's','Ramachandran'   );

INSERT INTO BOOK (BOOK_ID, BOOK_TITLE, BOOK_YEAR, AUTHOR_ID,BOOK_PRICE)
VALUES 
    (NULL, 'Spring Boot in Action', '2018', (SELECT Author_ID from author where last_name = 'Wells'),44),
    (NULL, 'Core Java for the Impatient', '2018', (SELECT Author_ID from author where last_name = 'Horstmann'),45),
    (NULL, 'Spring Microservices in Action', '2016',(SELECT Author_ID from author where last_name = 'Carnell'), 45),
    (NULL, 'Java Programming', '2018', (SELECT Author_ID from author where last_name = 'Farrell'),23),
    (NULL, 'Beginning Java Databases', '2001',(SELECT Author_ID from author where last_name = 'Carnell'),20 ),
    (NULL, 'Effective Java', '2017', (SELECT Author_ID from author where last_name = 'Bloch'),14),
    (NULL, 'Spring Boot 2.0', '2017', (SELECT Author_ID from author where last_name = 'Antonov'),22),
    (NULL, 'Spring Boot Cookbook', '2015', (SELECT Author_ID from author where last_name = 'Antonov'),22),
    (NULL, 'Learning spring Boot 2.0', '2017', (SELECT Author_ID from author where last_name = 'Turnquist'),67),
    (NULL, 'Absolute Java', '2015', (SELECT Author_ID from author where last_name = 'Savich'),89),
    (NULL, 'Agile Testing', '2015', (SELECT Author_ID from author where last_name = 'Gregory'),90),
    (NULL, 'Java: An Introduction to Problem Solving', '2017', (SELECT Author_ID from author where last_name = 'Savich'),99);
