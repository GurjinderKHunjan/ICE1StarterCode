package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            card.setValue((int)(1+Math.random()*13));
            
            card.setSuit(card.SUITS[(int)(0+Math.random()* 3)]);
            
        hand[i] = card;
        System.out.println(hand[i].getSuit() + hand[i].getValue());
        
        }

        
    }

    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Gurjinder, but you can call me Gurry, or Simran");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- create my own software company");
        System.out.println("-- Have a healthy social network");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- reading comics");
        System.out.println("-- Cooking");
        System.out.println("-- Watching Series");
        System.out.println("-- Riding my motorcycle(in india)");

        System.out.println();
        
    
    }

}
