import java.util.ArrayList;
import java.util.Random;



class DeckOfCards {
    
    static String[][] deckGenerator(){

        int columns = 14;
        int rows = 4;

        String[][] deck = new String[columns][rows];

        deck[0][0] = "Spades";
        deck[0][1] = "Hearts";
        deck[0][2] = "Diamonds";
        deck[0][3] = "Clubs";

        for(int i = 0; i < 4; i++){
            System.out.println("\n");
            System.out.print(deck[0][i]);
            for(int j = 1; j < 14; j++){
                deck[j][i] = Integer.toString(j);
                System.out.print(deck[j][i]);
            }
        }
        

        return deck;
        

        
    }


}







public class Bonus {
    public static void main(String[] args) throws Exception {

        String[] cardNames = {" of Spades"," of Hearts"," of Diamonds"," of Clubs"};
        String[] cardNumbers = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
       
       // innitial empty array that will contain all the 52 cards after the loop
        String[] fullDeck = new String[52];
        int index = 0;
        // loop to fill up the array will all the cards genrated by combining cardNames and cardNumbers
        for(String i: cardNames){
            for(String j: cardNumbers){
                
                fullDeck[index] = j + i;
                index++;
            }
        }


        int randomNumber;
        Random randomObject = new Random();
        ArrayList<Integer> occuredIndexes = new ArrayList<Integer>(52);
        for(int counter = 0; counter < 52; counter++){
            do{
                randomNumber = randomObject.nextInt(51);
            }while(occuredIndexes.contains(randomNumber));
            System.out.println(fullDeck[randomNumber]);
            occuredIndexes.add(randomNumber);

            
        }
        
        
        }
        
    }

