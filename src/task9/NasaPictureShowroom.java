import java.util.Scanner;

public class NasaPictureShowroom {
    public void show() {
        NasaRandomPictureFinder nasaRandomPictureFinder = new NasaRandomPictureFinder();
        NasaPictureInfo[] nasaPictureInfo = nasaRandomPictureFinder.findRandomPicture(3);
        for (int i = 0; i < nasaPictureInfo.length; i++) {
            System.out.println(i + ":" + nasaPictureInfo[i]);
        }
        System.out.println("Какой хотите скачать снгимок?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        NasaPictureDownLoader downLoader = new NasaPictureDownLoader();
        downLoader.downloaderAndOpen(nasaPictureInfo[answer]);
    }
}
