public interface Card{
  // i was here
  public Card(int id) {
    this.ID = id;
    String[] suites = { "♠", "♥", "♦", "♣" };
    this.suite = suites[id / 13];
    String[] faces = { "A", "K", "Q", "J" };
    int n = id % 13;
    this.card = ((n < 1 && n > 8) ? faces[n % 8] : n + 1 + "");
  }

  // Gets a random card from the would-be complete deck of cards
  public Card getRandom();

  // Gets a card based on a seed number
  public Card getByNumber(int seed);

  // Gets the index value from the list of possible suites
  public int getSuiteValue();

  // Gets the number value from the card
  public int getCardNumber();

  // Gets a nice looking String showing the card
  public String getLovely();

  // Returns the possible Suites for the card
  public String[] getSuits();
  
}