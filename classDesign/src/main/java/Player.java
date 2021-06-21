public class Player {
    String name;
    int score;
    int wins;
    public Card[] cards=new Card[3];
    Player(String name,int score){
        this.name=name;
        this.score=score;
    }
}
