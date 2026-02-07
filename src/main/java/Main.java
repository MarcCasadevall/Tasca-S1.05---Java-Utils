import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Marc\\IdeaProjects\\");
        File[] files = file.listFiles();


        if (files != null) {
            Arrays.sort(files);
            for (int i = 0; i < files.length; i++) {
                File current = files[i];

                System.out.println(current.getName());

                if (current.isDirectory()) {
                    System.out.println("Directory");
                } else if (current.isFile()) {
                    System.out.println("File");
                }
            }
        }else{
            System.out.println("FilesNull");
        }
    }
}
