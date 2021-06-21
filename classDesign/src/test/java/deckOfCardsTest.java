import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.*;


public class deckOfCardsTest {

    public deckOfCardsTest(){

    }
    deckOfCards deck=new deckOfCards();
    @Test
    public void testCard(){
        Card card = new Card("J", "c");
        assertEquals("J", card.faces);
        assertEquals("c", card.suits);
    }
    @Test
    public void testDeck(){
        deckOfCards deck=new deckOfCards();
        int count=0;
        for(int i=0;i<deck.size;i++)
            count++;
        assertEquals(deck.TOTAL,count);

    }
  /*  public void suitTest(){
        deckOfCards deck=new deckOfCards();
        int clubs=0,spades=0,hearts=0,diamonds=0;
        for(int i=0;i< deck.size;i++){
            if(deck[i].suits=="c")
                clubs++;
            if(deck[i].suits=="s")
                spades++;
            if(deck[i].suits=="h")
                hearts++;
            if(deck[i].suits=="d")
                diamonds++;
            assertEquals(13,clubs);
            assertEquals(13,spades);
            assertEquals(13,hearts;
            assertEquals(13,diamonds);
        }
    }*/

    @Test
    public void testDeal() {
        deckOfCards deck=new deckOfCards();
        deck.shuffle();
        HashSet<Card> hash = new HashSet<Card>();
        for (int i = 0; i < deck.size; i++) {
            Card dealt = deck.deal();
            assertNotNull(dealt);
            hash.add(dealt);
        }
        assertEquals(hash.size(),deck.size);
    }

}