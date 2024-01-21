# Movie API - Backend Development with Spring Boot, and MongoDB

This repository contains the backend code for a movie API developed using Java EE, Spring Boot, and MongoDB. 
The API is designed to provide data for a movie database, including functionalities to fetch all movies and 
individual movie details, as well as add reviews to movies.

## Features

- Fetch all movies: Returns a list of all movies in the database.
- Fetch a single movie: Returns the details of a specific movie based on its IMDb ID.
- Add a review to a movie: Allows users to add a review to a specific movie.

## Technologies Used

- **Java EE**: The backend is developed using Java EE, a popular platform for building enterprise applications.
- **Spring Boot**: Spring Boot is used to create stand-alone, production-grade Spring-based applications with minimal effort.
- **MongoDB**: MongoDB, a NoSQL database, is used for data storage. The application interfaces with MongoDB through MongoDB Atlas, MongoDB's fully-managed cloud database.


## Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#data.nosql.mongodb)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

### Setup

To run this project locally, you will need to have Java and MongoDB installed on your machine. 
You will also need an account on MongoDB Atlas.

#### MongoDB Atlas Setup

1. Go to `mongodb.com/atlas/database`.
2. Sign in with your Google or GitHub account, or sign up with another email address.
3. Once logged in, set up a new organization and create a new project.
4. Inside the project, create a new MongoDB database.
5. Create a new user for the cluster with a strong password.
6. Set up an IP access list. For development purposes, you can allow access from all IP addresses.

### Running the Project

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run the application.

## License

This project is licensed under the terms of the MIT license. See the [LICENSE](LICENSE.md) file for details.

## Contact

If you have any questions, feel free to reach out to me. I'll be happy to help!

## Acknowledgements

I would like to thank MongoDB for providing the database service used in this project. I would also like to thank freeCodeCamp for teaching me how to use some of these technologies. 

Note: This is a simple API for learning purposes. 
It does not include implementing authorization and authentication. 
