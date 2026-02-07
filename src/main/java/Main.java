import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Marc\\IdeaProjects\\");

        recursively(folder);
    }

    public static void recursively(File folder) {
        if (folder.exists()) {
            File[] files = folder.listFiles();

            if (files != null) {
                Arrays.sort(files);
                for (File f : files) {
                    System.out.println(f.getName());
                    if (f.isDirectory()) {
                        System.out.println("Directory");
                        recursively(f);
                    } else if (f.isFile()) {
                        System.out.println("File");
                    }
                }
            }
        }
    }
}

