import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by root on 26.02.17.
 */
public class Solution {

    public static char randomToss(){
        Random random = new Random();
        char[] table = {'H','T'};

        return table[random.nextInt(2)];

    }

    public static char makeGuess(Scanner sc){;
        char quess;
        System.out.println("Make your bet, Head(H) or Tails(T)?");
        quess = sc.next().charAt(0);
        return quess;
    }

    public static int result(char quess, char toss){
        if(quess == toss){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int points=0;
        while(points<5) {
            char guess = makeGuess(sc);
            char toss = randomToss();
            int result = result(guess, toss);
            System.out.println("Your guess: " + guess + "\nToss: " + toss);
            if (result == 1) {
                points++;
                System.out.println("You won! Total points: "+points);
            }
            else if(result==0){
                System.out.println("You were wrong. Total points: "+points);
            }
        }
    }



}
