package utils;

import java.time.LocalDate;
import java.util.Random;

public class RandomDateGenerator {

    public LocalDate getRandomDate(int start, int end) {
        int diff = end - start;
        int randomYearDelta = new Random().nextInt(diff + 1);
        int randomYear = start + randomYearDelta;
        int randomMonth = new Random().nextInt(12) + 1;
        int randomDay = new Random().nextInt(31) + 1;
        return LocalDate.of(randomYear, randomMonth, randomDay);
    }
}
