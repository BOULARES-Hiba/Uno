public abstract class Card {
   private String color;
   private String type;
   private int value;

   public Card(String color, String type, int value) {
       this.color = color;
       this.type = type;
       this.value = value;
   }

   public String getColor() {
       return color;
   }

   public void setColor(String color) {
       this.color = color;
   }

   public String getType() {
       return type;
   }

   public void setType(String type) {
       this.type = type;
   }

   public int getValue() {
       return value;
   }

   public boolean canPlayOn(Card topCard) {
       // Wild cards can always be played
       if (this.getType().equals("Wild") || this.getType().equals("Wild Draw Four")) {
           return true;
       }
       
       // If the top card is a wild card, match the chosen color
       if (topCard instanceof WildCard) {
           return this.color.equals(topCard.getColor());
       }
       
       // Match by color or type (for action cards)
       return this.color.equals(topCard.getColor()) || 
              this.type.equals(topCard.getType());
   }

   @Override
   public String toString() {
       if (color.equals("Wild")) {
           return type;
       }
       return color + " " + type;
   }

   public abstract void applyEffect(Game game);
}

class NumberCard extends Card {
   public NumberCard(String color, int number) {
       super(color, String.valueOf(number), number);
   }

   @Override
   public void applyEffect(Game game) {
       // Number cards have no special effect
   }
}

class ActionCard extends Card {
   public ActionCard(String color, String type, int value) {
       super(color, type, value);
   }

   @Override
   public void applyEffect(Game game) {
       // Action cards will have their specific effects in subclasses
   }
}



