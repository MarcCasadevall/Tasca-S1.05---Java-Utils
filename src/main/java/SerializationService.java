import java.io.*;

public class SerializationService {
    public void serialize(Object obj, String path) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(obj);
            System.out.println("Object serialized in: " + path);
        }
    }

    public Object deserialize(String path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return ois.readObject();
        }
    }
}