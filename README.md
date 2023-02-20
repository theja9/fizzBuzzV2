# fizzBuzzV2
 Fizz buzz is a counting number game. Players take turns to count incrementally, replacing any number divisible by three with the word "fizz", 
 and any number divisible by five with the word "buzz", and any number divisible by both 3 and 5 with the word "fizz buzz".
 
## Prerequisites
- Java 11
- Spring Boot 2.4.2
- Maven

## Steps to build the application
- Clone this repository 
- Build the project and run the tests by running ```maven clean build``` and ```maven clean test```

## Steps to run the application
- By default, the application will start on port 8080. To run on different port ex: 8081, add ```server.port=8082``` in properties file, while starting the application
- Once successfully built, run the service by using one of below commands:
```
  java -jar build/libs/fizzBuzzV2.jar
                    or                  
  java -jar build/libs/fizzBuzzV2.jar --server.port=8081
```
Provide input number in the get URL: http://localhost:8080/fizzbuzz/{num}

 Sample input and output:
 
| Input |	output |
| ----- |-------:| 
| 1	    |   1      |
| 2	    |   2      |
| 3	    |  fizz    |
| 4	    |   4      |
| 5	    |  buzz    |
| 6	    |  fizz    |
| 7	    |   7      |
| 8	    |   8      |
| 15	|fizz buzz |
| 30	|fizz buzz |

