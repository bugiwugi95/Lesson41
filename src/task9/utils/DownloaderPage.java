package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DownloaderPage {
    public String pageDownloader(String url){
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection;
        try {
            urlConnection = new URL(url).openConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result.toString();
    }
}
