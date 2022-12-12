/**
 * Write a description of class Runner here.
 *
 * @author (Cole Tyler)
 * @version (2)
 */
import java.util.Scanner; 
public class Runner
{
    public static void main (String [] args)
    {
        int number = 1;
        boolean again = true;
        Scanner input = new Scanner(System.in); 
        
        while(again){
        System.out.println("---Game "+number+"---");
        BlackJack3 game = new BlackJack3();
        System.out.println(game.toString());
        number=1+number;
        System.out.println("Play again? (Yes/No)");
        String question = input.nextLine();
        if (question.equals("Yes") )
        {
            again = true;
            System.out.println();
        }
        else 
        {
            again = false;
            System.out.println("Thanks for playing!");
        }
    }
    System.out.println();
    }
}
