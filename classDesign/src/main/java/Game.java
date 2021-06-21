import java.util.HashMap;
public class Game {
   public static void main(String args[]) {
      System.out.println("GAME OF CARDS\n");
      deckOfCards deck = new deckOfCards();
      Player A = new Player("A", 0);
      Player B = new Player("B", 0);
      deck.shuffle();
      int rounds = 5;
      for (int r = 1; r <= rounds; r++) {
         System.out.println("This is round " + r+"\n");
         deck.shuffle();
         int cardsInRound = 3;
         HashMap<String, Integer> map = new HashMap<>();
         for (int i = 0; i < cardsInRound; i++) {
            A.cards[i] = deck.deal();
           System.out.println("Player A is served "+A.cards[i].faces+A.cards[i].suits);
            B.cards[i] = deck.deal();
            System.out.println("Player B is served "+B.cards[i].faces+B.cards[i].suits);
         }

         map.put("2", 2);
         map.put("3", 3);
         map.put("4", 4);
         map.put("5", 5);
         map.put("6", 6);
         map.put("7", 7);
         map.put("8", 8);
         map.put("9", 9);
         map.put("10", 10);
         map.put("J", 11);
         map.put("Q", 12);
         map.put("K", 13);
         map.put("A", 14);

         for (int i = 0; i < cardsInRound; i++) {
            A.score += map.get(A.cards[i].faces);
            B.score += map.get(B.cards[i].faces);
         }
         System.out.println("Score of A "+A.score);
         System.out.println("Score of B "+B.score);
         if (A.score > B.score)
            A.wins++;
         else
            B.wins++;
      }
       if(A.wins > B.wins)
          System.out.println("Player A wins the game\n");
       else if (B.wins>A.wins)
          System.out.println("Player B wins the game\n");
       else
          System.out.println("Its a tie!!\n");
      }
   }



