import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File folder = new File("S1.05-Java.Utils");
        try {
            FileWriter writer = new FileWriter("output.txt");
            recursively(folder, writer);
            writer.close();

            read("output.txt");

            Person person = new Person("Marc", 33);
            serializablePerson(person, "person.ser");
            Person load = deserializePerson("person.ser");
            System.out.println("Deserialize Object: " + load);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void recursively(File folder, Writer writer) throws IOException {
        if (folder.exists()) {
            File[] files = folder.listFiles();

            if (files != null) {
                Arrays.sort(files);
                for (File f : files) {

                    if (f.isDirectory()) {
                        writer.write(f.getName() + " Directory\n");
                        recursively(f, writer);
                    } else if (f.isFile()) {
                        writer.write(f.getName() + " File\n");
                    }
                }
            }
        }
    }

    public static void read(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error read file: " + e.getMessage());
        }
    }

    public static void serializablePerson(Person person, String filePath) throws IOException {
        FileOutputStream fo = new FileOutputStream(filePath);
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(person);
        out.close();
        fo.close();
        System.out.println("Serializable object saved in: " + filePath);
    }

    public static Person deserializePerson(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fi);
        Person person = (Person) in.readObject();
        in.close();
        fi.close();
        return person;
    }
}

