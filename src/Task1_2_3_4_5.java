public class Task1_2_3_4_5 {
    public static void main(String[] args) {
        //1.Поймайте в дебаггере метод String.equals
//       String str1 = "sss";
//       String str2 = "sss";
//        System.out.println(str1.equals(str2));
        //2.Поймайте в дебаггере метод StringBuilder.equals
//       StringBuilder stringBuilder = new StringBuilder();
//       stringBuilder.append("ssss");
//       StringBuilder stringBuilder1 = new StringBuilder();
//       stringBuilder1.append("ssss");
//        System.out.println(stringBuilder.equals(stringBuilder1));
//3.Поймайте в дебаггере метод Object.equals
        Object ob1 = new Object();
        Object ob2 = new Object();
        System.out.println(ob1.equals(ob2));
       // 4.В чем разница сравнения через == и через equals?
        // == -> сравнивает ссылки
        // equals -> сранивает значение,нр нужно переопределить метод в классе
       // 5.Всегда ли сравнение через equals сравнивает значения элементов? -> если не переопределен метод equals,то он сравнивает ссылки

    }
}