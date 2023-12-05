# Movies API

This project is a Movie API developed in Java with Spring Boot.

## Clonar el Repositorio

You can clone the repository using the following command:

```bash
git clone https://github.com/JSebastianSalazar/movies-api.git
```


### Running the Project


```bash
mvn spring-boot:run
```

### Running test Project


```bash
mvn test
```

### Public URL
[`Movies`](http://movies-api-production-22ec.up.railway.app)


## APIS

### FIND BY ID
```bash
curl --location --request GET 'movies-api-production-22ec.up.railway.app/movie/v1/1' \
--header 'Content-Type: application/json' \
--data '{
    "user": "Johan"
}'
```
###  success response
```json
{
    "name": "John Wick",
    "overview": "John Wick is an American neo-noir ",
    "status": false,
    "image": "https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/unnamed.jpg",
    "genres": "Drama, Action, Adverture",
    "author": "Derek Kolstad"
}
```

```bash
curl --location --request GET 'movies-api-production-22ec.up.railway.app/movie/v1/e' \
--header 'Content-Type: application/json' \
--data '{
    "user": "Johan"
}'
```
###  BAD REQUEST
```json
{
    "mensaje": "No es un id valido"
}
```

```bash
curl --location --request GET 'movies-api-production-22ec.up.railway.app/movie/v1/10' \
--header 'Content-Type: application/json' \
--data '{
    "user": "Johan"
}'
```
###   NOT FOUND
```json
{
    "mensaje": "Movie not found with ID: 10"
}


```

### FIND 
```bash
curl --location --request GET 'movies-api-production-22ec.up.railway.app/movies/v1?name=' \
--header 'Content-Type: application/json' \
--data '{
    "user": "Johan"
}'
```
###  success response
```json
[
  {
    "id": 1,
    "name": "John Wick",
    "status": true,
    "image": "https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/unnamed.jpg",
    "author": "Derek Kolstad"
  },
  {
    "id": 2,
    "name": "The Godfather",
    "status": true,
    "image": "https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/The%20Godfather.png",
    "author": "Francis Ford Coppola"
  },
  {
    "id": 3,
    "name": "The Dark Knight",
    "status": true,
    "image": "https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/The%20Dark%20Knight.png",
    "author": "Christopher Nolan"
  },
  {
    "id": 4,
    "name": "Harry potter",
    "status": true,
    "image": "https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/image/Harrypotter.png",
    "author": "J. K. Rowling"
  }
]
```

###  TEST COVERAGE
### HOME
![HOME](https://raw.githubusercontent.com/JSebastianSalazar/movies-image/main/backend/coverage.jpeg)


