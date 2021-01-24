package pogodynka;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("Witaj w aplikacji Pogoda na żywo");

        Scanner scanner = new Scanner(System.in);

        while (true)

        System.out.println("Co chciałbyś/chciałabyś zrobić?");
        System.out.println("1. Dodaj nową lokalizację");
        System.out.println("2. Pokaż dodane już lokalizację");
        System.out.println("3. Pobierz dane pogodowe ");
        System.out.println("4. Zamknij aplikacje ");

        int response = scanner.nextInt();

        switch(response){
            case 1 :
                System.out.println("");
                break;
            case 2 :
                System.out.println();
                break;
            case 3 :
                System.out.println();
                break;
            case 4 :
                System.out.println();
                return;
        }





    }
}
