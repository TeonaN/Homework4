package homework;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        System.out.println("აირჩიეთ სამი ენიდან ერთ-ერთი („en”, “ge”, “ru”)");
        Scanner sc = new Scanner(System.in);
        String language = sc.nextLine();
        Generator generator = new Generator();


        switch (language) {
            case "en":
                generator.generateAlpha('a', 'z');
                break;
            case "ge":
                generator.generateAlpha('ა', 'ჰ');
                break;
            case "ru":
                generator.generateAlpha('а', 'я');
        }
        System.out.println(generator.generateRandomWords());

    }
}

