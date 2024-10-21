Java Payroll System - Executable JAR
This project is a simple Payroll System implemented in Java. It provides functionalities to check, add, edit, remove data, and calculate pay using a command-line menu. This program demonstrates how to manage employee data in a small payroll system.

Prerequisites
Java Development Kit (JDK) installed (JDK 8 or later).
VS Code or any text editor.
Terminal/Command Prompt access.
Project Structure
graphql
Copy code
main/
│
├── Main.java        # Entry point for the application
├── AddData.java     # Handles adding data
├── CheckData.java   # Handles checking and displaying data
├── EditData.java    # Handles editing existing data
├── RemoveData.java  # Handles removing data
├── Calculatepay.java# Handles payroll calculations
├── bin/             # (Generated) Directory where compiled class files will be stored
├── MANIFEST.MF      # Manifest file specifying the entry point for the JAR
└── MainExecutable.jar   # (Generated) The packaged JAR file
Classes and Responsibilities
Main.java
This file contains the main method, which serves as the entry point to the program. It provides a simple menu-based interface for the user to:
Check Data
Add Data
Edit Data
Remove Data
Calculate Pay
Exit the program
AddData.java
Purpose: Handles the logic for adding new employee data into the system.
This could involve collecting user input for employee details and storing them in an appropriate data structure.
CheckData.java
Purpose: Responsible for displaying existing employee data.
This could involve reading from a stored list or database of employee details and showing them to the user.
EditData.java
Purpose: Provides functionality to edit existing employee data.
The class will likely search for a specific employee, allow changes to be made, and update the records accordingly.
RemoveData.java
Purpose: Handles removing an employee’s data from the system.
The user can specify an employee to be removed, and this class will handle deleting the corresponding data.
Calculatepay.java
Purpose: Calculates and displays the payroll for the employees.
This could include calculating pay based on hours worked, deductions, bonuses, etc.
Steps to Compile, Package, and Run
1. Compile the Java Files
Open your terminal or command prompt, and navigate to the directory containing the project:

bash
Copy code
cd C:\Users\Administrator\Documents\main
Compile the Java files and store the compiled class files in a bin directory:

bash
Copy code
javac -d bin *.java
2. Create a Manifest File
Create a MANIFEST.MF file in the project directory with the following content:

plaintext
Copy code
Manifest-Version: 1.0
Main-Class: Main
Ensure that the Main-Class is the correct name of your Java class containing the main method.

3. Package the JAR
Run the following command to package the compiled class files and the manifest into an executable JAR file:

bash
Copy code
jar cfm MainExecutable.jar MANIFEST.MF -C bin/ .
This creates the MainExecutable.jar file in your project directory.

4. Run the Executable JAR
Once the JAR is created, you can run it using the following command:

bash
Copy code
java -jar MainExecutable.jar
This will execute your Java program and present the menu interface.
