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
    (1, 'John Wick', 'John Wick is an American neo-noir action thriller media franchise created by Derek Kolstad and centered on John Wick, a former hitman who is drawn back into the criminal underworld he had previously abandoned.',
     true, 'https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/unnamed.jpg', 'Drama, Action, Adverture', 'Derek Kolstad'),
    (2, 'The Godfather', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.',
     true, 'https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/The%20Godfather.png', 'Crime, Drama', 'Francis Ford Coppola'),
    (3, 'The Dark Knight', 'When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.',
     true, 'https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/The%20Dark%20Knight.png', 'Action, Crime, Drama', 'Christopher Nolan'),
    (4, 'Harry potter', 'Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry.',
     true, 'https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/Harrypotter.png', 'Animation, Action, Fantasy', 'J. K. Rowling');