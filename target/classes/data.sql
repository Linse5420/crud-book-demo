
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
    (     NULL, 'John','Carnell'   );
    (     NULL, 'murach','john' ),
    (     NULL, 'Walter','khan'  ),
    (     NULL, 's','Ramachandran'   );

INSERT INTO BOOK (BOOK_ID, BOOK_TITLE, BOOK_YEAR, AUTHOR_ID)
VALUES 
    (NULL, 'Spring Boot in Action', 2018, (SELECT Author_ID from author where last_name = 'Wells'),89),
    (NULL, 'Core Java for the Impatient', 2018, (SELECT Author_ID from author where last_name = 'Horstmann',98)),
    (NULL, 'Spring Microservices in Action', 2016, (SELECT Author_ID from author where last_name = 'Carnell'),98),
    (NULL, 'Java Programming', 2018, (SELECT Author_ID from author where last_name = 'Farrell'),100),
    (NULL, 'Beginning Java Databases', 2001, (SELECT Author_ID from author where last_name = 'Carnell'),76),
    (NULL, 'Effective Java', 2017, (SELECT Author_ID from author where last_name = 'Bloch'),67),
    (NULL, 'Spring Boot 2.0', 2017, (SELECT Author_ID from author where last_name = 'Antonov'),66),
    (NULL, 'Spring Boot Cookbook', 2015, (SELECT Author_ID from author where last_name = 'Antonov'),55),
    (NULL, 'Learning spring Boot 2.0', '2017', (SELECT Author_ID from author where last_name = 'Turnquist'),45),
    (NULL, 'Absolute Java', '2015', (SELECT Author_ID from author where last_name = 'Savich'),36),
    (NULL, 'Agile Testing', '2015', (SELECT Author_ID from author where last_name = 'Gregory'),55),
    (NULL, 'Java: An Introduction to Problem Solving', '2017', (SELECT Author_ID from author where last_name = 'Savich'),67);
     (NULL, 'Java frameworks', '2014', (SELECT Author_ID from author where last_name = 'Savich'),88),
    (NULL, 'Agile Testing', '2015', (SELECT Author_ID from author where last_name = 'Gregory'),88),
    (NULL, 'Java: An Introduction to Problem Solving', '2017', (SELECT Author_ID from author where last_name = 'Savich'),89);
    (NULL, 'Java frame', '2014', (SELECT Author_ID from author where last_name = 'Khan'),88),
    (NULL, 'testing agile', '2015', (SELECT Author_ID from author where last_name = 'ramachandran'),88),
    (NULL, 'Java', '2017', (SELECT Author_ID from author where last_name = 'khan'),89);
