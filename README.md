Project Name Java Utils

Description: A beginner-level Java project to practice file and directory management, reading/writing files, and serializing objects.

📌 Exercise Overview

This project includes exercises to:

List the contents of a directory alphabetically.

Recursively list all subdirectories and files, showing type (Directory/File) and last modified date.

Save the directory listing to a .txt file.

Read and display the content of any .txt file.

Serialize a Java object (Person) to a .ser file and then deserialize it.

✨ Features

Recursive directory traversal

Alphabetical sorting

File and directory type detection

Save directory structure to output.txt

Read .txt files line by line

Serialize and deserialize Java objects

🛠 Technologies

Java

File I/O (File, FileWriter, FileReader, BufferedReader)

Serialization (ObjectOutputStream, ObjectInputStream)

🚀 Installation and Execution

Clone the repository:

git clone <your-repo-url>


Make sure the folder S1.05-Java.Utils is in the project root.

Compile and run:

javac Main.java Person.java
java Main


Output files:

output.txt → directory structure

person.ser → serialized object

📸 Demo

Console output shows directory structure and file contents.

Serialized object example:

Deserialize Object: Person{name='Marc', age=33}

🧩 Notes

Recursive traversal ensures all folders are listed regardless of depth.

Using relative paths makes the project portable.

Alphabetical sorting keeps the output organized.
