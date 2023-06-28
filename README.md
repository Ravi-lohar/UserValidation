<div align = "center">
  <h1> User Management System with Validation</h1>
 </div>


## Framework and Language
* Java 
* SpringBoot
## Data flow
  **The project has four main packages which are following** 
  
* Controller - Controller package has all the api.
* Services - Service class has all the business logic and it will return the result of that methd which is called by controller class . 
* Repository - Respository has all the datasource .
* Model - Model class has one user class which has UserId , UserName , UserDob , Email , PhoneNumber , Date and Time
  
> The flow of data is from controller has all the api and logics of that api has in service class and
service class is using the repository class which has all the data it keeps data source.The api called by user call the controller method
return the logic which is written in service class so service class object is called and service class use data source of repo class.
 

## Data Structure
    ArrayList
## Project Summary 
**This is Sprinboot project of User Management System the each user has five information which are UserId , Name , UserName , Address and Phonenumber.we can perform following operations using this project**
* We can add a user by passing user in Post method.
* We can get a single user's information by passing userId in Get method.
* We can get list of users with informtion by calling Get method. 
* We can upadte user's information by passing his userId in Put method.
* we can delete user by passing his user
> Following Validation Has been Provided
* UserId and name must not be empty
* User Email must be valid
* User Date of Birth must be in the formate of YYYY-MM-DD
* User PhoneNumber must be of 12 digit in whcih first two digit is country code and rest is number
* Date must be in YYYY-MM-DD formate
