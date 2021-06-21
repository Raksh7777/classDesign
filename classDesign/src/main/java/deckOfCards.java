import java.util.Random;

public class deckOfCards {
    public static final int TOTAL =52;
    private Card deck[]=new Card[ TOTAL ];
    private int  currentCard=0;
    private Random randomNumbers;
    public int size=52;

    public deckOfCards()
    {
        String []suits= {"c","d","h","s" };
        String [] faces ={"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A"
        };

        deck = new Card[ TOTAL ];
        currentCard = 0;
        randomNumbers = new Random();


        for ( int count = 0; count < deck.length; count++ )
            deck[ count ] = new Card( faces[ count % 13 ], suits[ count / 13 ] );
    }


    public void shuffle(){
        currentCard = 0;

        for ( int i = 0; i < deck.length; i++ )
        {
            int j=  randomNumbers.nextInt( TOTAL );

            Card temp = deck[ i ];
            deck[i ] = deck[ j ];
            deck[ j ] = temp;
        }
        }


    public Card deal(){

        if ( currentCard < deck.length ) {
            Card d =deck[currentCard++];
            cardsLeftInDeck(d);
            return d;
        }
        else
            return null;


            }

            public void cardsLeftInDeck(Card card){
                for(int i=0;i< deck.length;i++) {
                    if (deck[i] == card){
                        for(int j=i; j<(deck.length-1); j++)
                        {
                            deck[j] = deck[j+1];
                        }
                    }
                }
                size--;
        }



    }

