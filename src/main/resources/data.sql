DROP TABLE MOVIE IF EXISTS ;

CREATE TABLE MOVIE (
                       ID INT,
                       NAME VARCHAR(100),
                       OVERVIEW VARCHAR(500),
                       STATUS BOOLEAN,
                       IMAGE VARCHAR(500),
                       GENRES VARCHAR(100),
                       AUTHOR VARCHAR(100)
);

INSERT INTO MOVIE (ID, NAME, OVERVIEW, STATUS, IMAGE, GENRES, AUTHOR)
VALUES
    (1, 'The Shawshank Redemption', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', true, 'shawshank.jpg', 'Drama', 'Frank Darabont'),
    (2, 'The Godfather', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', true, 'godfather.jpg', 'Crime, Drama', 'Francis Ford Coppola'),
    (3, 'The Dark Knight', 'When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.', true, 'dark_knight.jpg', 'Action, Crime, Drama', 'Christopher Nolan');