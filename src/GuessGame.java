import java.util.Random;
import java.util.Scanner;

public class GuessGame {


    private static GuessGame instance = new GuessGame();

    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);




    private GuessGame(){

    }

    public void play(){
        for (int i = 0; i < 9 ; i++) {
            int number = random.nextInt(9);
            System.out.println("Podaj liczbę");
            int guess = scanner.nextInt();
            if(number==guess) {
                System.out.println("udało się");
                score++;
            } else {
                System.out.println("Przykro mi, nie udało się. Liczba do zgadnięcia to: " + number);
            }

        }

        System.out.println("Twój wynik to: " + score);
    }


    public int getScore(){
        return score;
    }

    public static GuessGame getInstance(){
        return instance;
    }

}
