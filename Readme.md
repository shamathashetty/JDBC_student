# **Java JDBC Database Connection and Data Access Example**

This project demonstrates how to establish a **JDBC (Java Database Connectivity)** connection to a **MySQL database** and perform basic data access operations using Java.

## **Prerequisites**

- **Eclipse IDE**
- **Java Development Kit (JDK)**
- **MySQL Server and MySQL Workbench**
- **MySQL Connector JAR file**

## **Getting Started**

1. Clone this repository or download the source code.

2. Import the project into Eclipse IDE:
   - Open Eclipse.
   - File -> Import -> General -> Existing Projects into Workspace.
   - Browse and select the project folder.

3. Add MySQL Connector JAR to the project:
   - Right-click on the project in Eclipse.
   - Build Path -> Configure Build Path.
   - Libraries -> Add External JARs.
   - Browse and select the `mysql-connector-java-x.x.x.jar` file.

4. Set up your MySQL database:
   - Open MySQL Workbench.
   - Create a new schema or use an existing one.
   - Note down the database connection details (URL, username, password).

5. Update the `JDBC.java` file:
   - Open `src/JDBC.java`.
   - Replace the jdbcUrl = "jdbc:mysql://localhost:yourportnum/databasename";

6. Run the `JDBC.java` file to test the basic JDBC connection and query execution.

7. Open the `DAOJava.java` file to see the example data access operations:
   - Adding a new entry to the database.
   - Deleting a row from the database.
   - Fetching values from the database.

## **Usage**

This project provides a foundation for connecting Java applications to a MySQL database using JDBC. You can extend and modify the code to suit your specific needs.



Feel free to modify and customize this README to better suit your project's details and organization.
