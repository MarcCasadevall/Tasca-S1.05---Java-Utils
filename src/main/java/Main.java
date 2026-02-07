import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Marc\\IdeaProjects\\S1.05-Java.Utils");
        try {
            FileWriter writer = new FileWriter("output.txt");
            recursively(folder, writer);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error");
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
}

