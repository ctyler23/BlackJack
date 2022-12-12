/**
 * Write a description of class BlackJack3 here.
 *
 * @author (Cole Tyler)
 * @version (3)
 */
import java.util.Scanner; 
public class BlackJack3 
{ 
    int card1;
    int card2; 
    int card3; 
    int card4; 
    int card5; 
    int card6; 
    int player1; 
    int player2; 
    int player1f;
    int player2f;
    
    public String game() 
    { 
        Scanner input = new Scanner(System.in); 

        card1 = (int)(Math.random() * 11) + 1; 
        card2 = (int)(Math.random() * 11) + 1; 
        card3 = (int)(Math.random() * 11) + 1; 
        card4 = (int)(Math.random() * 11) + 1;
        card5 = (int)(Math.random() * 11) + 1;
        card6 = (int)(Math.random() * 11) + 1;

        player1 = card1 + card2; 
        player2 = card3 + card4; 
        System.out.println("You: " + player1); 
        System.out.println("Player 2: " + player2); 

        if ( player2 == 21) {
            System.out.println("Player 2 wins by blackjack!");
        }
        else if (player1 == 21) {
            System.out.println("Player 1 wins by blackjack!");
        }

        System.out.println("Do you want another card? (Yes/No)"); 
        String maybe = input.nextLine();
        if (maybe.equals("Yes") == true) { player1f = player1+card5;
            System.out.println("You: " + player1f);
        }
        else {System.out.println("Ok!"); }

        if (player2<16){ player2f = player2+card6;} 

        if ( player1f > 21 && (card1==11 || card2==11 || card5==11)){
            player1f-=10;
            if ( player1f > 21 && (card1==11 || card2==11 || card5==11)){
                player1f-=10;
            }
        }

        if ( player2f > 21 && (card3==11 || card4==11 || card6==11)){
            player2f-=10;
            if ( player2f > 21 && (card3==11 || card4==11 || card6==11)){
                player2f-=10;
            }
        }

        System.out.println("Player 2: " + player2f);
        
        if (player1 > 21 || player1f > 21) { System.out.println("Player 2 wins!"); } 
        else if (player2 > 21 || player2f > 21) { System.out.println("Player 1 wins!"); } 
        else if (player2f > player1f ) { System.out.println("Player 2 wins!"); } 
        else if (player2 > player1 && player2f==0 ) { System.out.println("Player 2 wins!"); }
        else if (player2f == player1f && player2f != 0) { System.out.println("It's a tie!"); }
        else if (player2 == player1 && player2f == 0) { System.out.println("It's a tie!"); }
        else { System.out.println("You win!"); } 
        return "";
    }

    public String toString()
    {
        return 
        game()+
        "Your cards: "+card1+", "+card2+", "+"if you hit: "+card5+
        "\nPlayer2's cards: "+card3+", "+card4+", "+card6+"\n";
    }
}
