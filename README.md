Immunization Tracker
The Immunization Tracker (Backend) is a robust and efficient system developed using Spring Boot, Hibernate, JPA, and MySQL. It serves as the core component of a comprehensive immunization tracking solution, focusing on managing data and providing APIs for seamless interaction with the system. This backend system plays a crucial role in tracking healthcare professionals, immunization centers, appointments, and doses administered to users.

Features
User Management: The system allows the registration and management of users who can book immunization appointments.
Healthcare Professional Management: Healthcare professionals can register themselves, providing essential information for scheduling appointments and administering vaccines.
Immunization Center Management: The system maintains a database of immunization centers, making it easier to allocate appointments and vaccines efficiently.
Appointment Booking: Users can schedule immunization appointments, choose their preferred center, and select a suitable time slot.
Dose Administration: Healthcare providers can record the doses administered to users, ensuring accurate and up-to-date immunization records.
APIs: The system offers a robust set of more than 20 APIs that enable integration with other systems and applications, making it versatile and adaptable to various use cases.
Models
User
Dose
Healthcare Professional
Appointment
Immunization Center
Technology and Tools Used
Java
Spring Boot
Spring Data JPA
RESTful APIs
Hibernate (MySQL)
Postman
Email Integration
Maven
Git & GitHub
SpringToolSuite
# Overview of Project
## Flow Diagram
![VaccineMS](https://github.com/im-arbazalam/VaccineManagementSystem/assets/114339920/a5192219-3bd4-402c-afe5-c4b34bfe420d)



API Screenshots
![Screenshot (39)](https://github.com/im-arbazalam/VaccineManagementSystem/assets/114339920/4820dc56-6150-4608-b4f9-c1063e45ae3e)
![Screenshot (40)](https://github.com/im-arbazalam/VaccineManagementSystem/assets/114339920/b79c6241-7568-4278-b6d7-58957e421c97)


Usage
Users, healthcare professionals, and immunization center administrators can interact with the system through the web interface or by utilizing the provided APIs. Below are some common usage scenarios:
User Registration: Users can create accounts and log in to book immunization appointments.
Healthcare Professional Registration: Healthcare professionals can register their profiles, making them available for appointment scheduling.
Immunization Center Management: Administrators can add, modify, or remove immunization centers as needed.
Appointment Booking: Users can search for available appointments and book convenient slots.
Dose Administration: Healthcare professionals can record the doses administered to users, updating their immunization status.
API Integration: Developers can integrate the system with other applications or services using the provided APIs.
Code Organization
The code for this Immunization Tracker system is organized into separate classes or packages for each entity, along with necessary helper classes or functions. The code follows Object-Oriented Programming principles and best practices such as encapsulation, modularity, and proper separation of concerns.

Setup and Installation
To set up the Immunization Tracker locally, follow these steps:

Clone the repository from GitHub.
Open the project in your preferred IDE.
Build the project to resolve dependencies.
Configure the application properties with your database connection details.
Run the application.
Access the API endpoints using a tool like Swagger or Postman.
Contributions
Contributions to the Immunization Tracker are welcome! If you encounter any issues or have suggestions for improvement, please create a new issue or submit a pull request.
