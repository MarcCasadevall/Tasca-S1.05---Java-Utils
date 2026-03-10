import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;

public class DirectoryService {
    public void recursively(File folder, Writer writer) throws IOException {

        if (folder == null || !folder.exists()) {
            return;
        }

        File[] files = folder.listFiles();

        if (files != null) {
            Arrays.sort(files);

            for (File file : files) {
                String fileType = file.isDirectory() ? "[Directory]" : "[File]";
                Date lastModified = new Date(file.lastModified());

                writer.write(file.getName() + " " + fileType + " " + lastModified + "\n");

                if (file.isDirectory()) {
                    recursively(file, writer);
                }
            }
        }
    }
}
