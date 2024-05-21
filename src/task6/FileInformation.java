package task1;

public class FileInformation {
    String name;
    String massage;

    public FileInformation(String name,  String massage) {
        this.name = name;
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "Поле названия: " + this.name +"\n" + "Поле сообщение: " + this.massage;
    }
}
