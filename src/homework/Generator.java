package homework;

import java.util.Random;
import java.util.Scanner;

public class Generator implements GeneratorInterface {
    Scanner scanner = new Scanner(System.in);
    public int min;
    public int max;
    public int min1;
    public int max1;
    public String c = "";
    public char[] word;
    public int min2;
    public int max2;
    public String s;
    public String k = "";
    public String alphabet = "";

    public String generateAlpha(char startSymbol, char endSymbol){


        for(int i=(int)startSymbol; i<=(int)endSymbol; i++){
            alphabet += (char)i;
        }
        return alphabet;
    }


    public String generateRandomWords() {
        int j;
        System.out.println("შეიყვანეთ წინადადებების მინიმალური და მაქსიმალური მნიშვნელობა");
        min = scanner.nextInt();
        max = scanner.nextInt();
        System.out.println("შეიყვანეთ წინადადებაში სიტყვების მინიმალური და მაქსიმალური მნიშვნელობა");
        min1 = scanner.nextInt();
        max1 = scanner.nextInt();
        System.out.println("შეიყვანეთ სიტყვაში სიმბოლოების მინიმალური და მაქსიმალური მნიშვნელობა");
        min2 = scanner.nextInt();
        max2 = scanner.nextInt();
        Random random = new Random();
        int ra = random.nextInt(((max - min) + 1) + min);
        for (int g = 0; g < ra; g++){
            int m = random.nextInt(((max1 - min1) + 1) + min1);
            for (int i = 0; i < m; i++) {

                word = new char[random.nextInt((max2 - min2) + 1) + min2];
                for (j = 0; j < word.length; j++) {
                    word[j] = alphabet.charAt(random.nextInt(alphabet.length()));
                }
                s = String.valueOf(word);
                c = c + s + " ";
            }
            k = k + c + "    ";
        }

        return k;
    }


}
