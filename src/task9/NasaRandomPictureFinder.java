import utils.DownloaderPage;
import utils.RandomDateGenerator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NasaRandomPictureFinder {
    public NasaPictureInfo[] findRandomPicture(int count) {
        NasaPictureInfo[] arr = new NasaPictureInfo[count];
        for (int i = 0; i < count; i++) {
            String dateStr = getString();
            String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=" + dateStr;
            DownloaderPage downloaderPage = new DownloaderPage();
            String page = downloaderPage.pageDownloader(url);
            String explanation = getValueTag(page, "explanation");
            String title = getValueTag(page, "title");
            String mediaType = getValueTag(page, "media_type");
            String hdUrl = getValueTag(page, "hdurl");
            NasaPictureInfo info = new NasaPictureInfo(title, dateStr, explanation, hdUrl, mediaType);
            arr[i] = info;
        }


        return arr;

    }

    private String getValueTag(String page, String tagName) {
        int begin = page.indexOf('"' + tagName + '"') + 4 + tagName.length();
        int end = page.indexOf('"', begin);
        return page.substring(begin, end);
    }

    private static String getString() {
        RandomDateGenerator randomDateGenerator = new RandomDateGenerator();
        LocalDate randomDate = randomDateGenerator.getRandomDate(1996, 2023);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return randomDate.format(formatter);
    }


}
