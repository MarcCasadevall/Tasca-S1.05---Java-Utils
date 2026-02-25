import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class DirectoryService {
    public void recursively(File folder, Writer writer) throws IOException {

        if (folder == null || !folder.exists()) {
            return;
        }

        File[] files = folder.listFiles();

        if (files != null) {
            Arrays.sort(files);
            for (File f : files) {
                String type = f.isDirectory() ? "[Directory]" : "[File]";
                writer.write(f.getName() + " " + type + "\n");

                if (f.isDirectory()) {
                    recursively(f, writer);
                }
            }
        }
    }
}
