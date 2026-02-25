import java.io.*;

public class Main {
    public static void main(String[] args) {

        DirectoryService dirService = new DirectoryService();
        FileReaderService fileService = new FileReaderService();
        SerializationService serialService = new SerializationService();
        File rootFolder = new File("S1.05-Java.Utils");

        try {
            try (FileWriter fileWriter = new FileWriter("output.txt")) {
                dirService.recursively(rootFolder, fileWriter);
            }

            fileService.readAndPrint("output.txt");

            Person person = new Person("Marc", 33);
            serialService.serialize(person, "person.ser");

            Person loadedPerson = (Person) serialService.deserialize("person.ser");
            System.out.println("Deserialized Object: " + loadedPerson);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Main error: " + e.getMessage());
        }
    }
}