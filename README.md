# simplante

This project provides productive setup for building Spring Boot Angular applications. The application is divided into two Maven modules:  

1. backend: This contains Java code of the application.
2. frontend: This contains source code for the Angular based frontend.

This project uses following versions:  

* Spring Boot 
* Angular 
* Node and NPM 

## Running the full application  
You can build the package as a single artifact by running the ./mvnw clean install. Next, you can run the application by executing:  

`$ java -jar backend/target/ngboot-app.jar `  
The application will be accessible at `http://localhost:8080.` 

You can also run the application using Maven.  

``` 
$ cd backend  
$../mvnw spring-boot:run 
```

Running the frontend for development mode
Make sure to install npm on your development machine.

To install all the required binaries for your project, you can run following command.

``` 
$ cd frontend  
$ ../mvnw frontend:install-node-and-npm frontend:npm 
 ```
  
Once the above command finishes, you can start the frontend using the yarn start command.

Hot reloading
Both the front-end and back-end modules support hot reloading.
