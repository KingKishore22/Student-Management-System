Student Management System
===========================
Project Overview
=================
The Student Management System is a web application designed to manage student data efficiently. It allows users to add, view, update, and delete student records. This application is built using modern Java frameworks and technologies to ensure a robust, scalable, and maintainable system.

Tech Stack
===========
Java: The primary programming language used for developing the application.
Maven: A build automation tool used for managing project dependencies.
MySQL: The relational database management system used to store student data.
Hibernate JPA: A Java framework that simplifies data persistence and retrieval.
Spring Data JPA: Provides easy integration with JPA repositories.
Spring Boot: Simplifies the setup and development of Spring applications.
Spring MVC: Provides a model-view-controller architecture for developing web applications.
REST API: Enables communication between client and server through RESTful services.

Project Structure
============================
Controllers:
* Home_Page: Manages the routing and handles HTTP requests for various operations like adding, updating, deleting, and viewing student records.
  
Entities:
* Student_database: Represents the student entity with attributes such as id, name, mail_id, std, dept, status, and pending.
  
Repositories:
* Students_infos: An interface extending JpaRepository to perform CRUD operations on the student database.
  
Services:
* Business_Logic: Implements the business logic for managing student data.
* Student_Datas: An interface defining methods for CRUD operations on student data.
  
Features
===========
Add Student Records: Allows adding new student records with details such as name, email ID, standard, department, payment status, and pending fees.
View Student Records: Displays a list of all student records.
Update Student Records: Provides functionality to update existing student records.
Delete Student Records: Allows deletion of student records.
Search Student Records: Enables searching for specific student records based on various criteria.
