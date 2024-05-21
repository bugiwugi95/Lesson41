import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NasaPictureDownLoader {
    public void downloaderAndOpen(NasaPictureInfo info) {
        System.out.println("loading" + info.title);
        System.out.println("Desc" + info.explanation);
        try (InputStream in = new URL(info.url).openStream()) {
            String[] arr = info.url.split("\\.");
            String file = arr[arr.length - 1];
            String fileName = info.title + "." + file;
            Files.copy(in, Paths.get(fileName));
            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
