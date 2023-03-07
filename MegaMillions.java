package Play2Win;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MegaMillions {
    /* */

    // TODO Auto-generated constructor stub
    // Generates 5 different numbers between 1 and 70 and 1 random number between 1
    // and
    // 25. This will be stored in an array.
    /*
     * Once this is done 5 times the sets are stored in an arraylist
     * 
     */

    public ArrayList<String> generateNumbers() {

        ArrayList<String> ticket = new ArrayList<String>();

        // this for loop generates 5 different numbers between 1 and 75

        while (ticket.size() != 5) {
            // this will keep looping until the hashset has 5 numbers in it.

            String drawballs = "";
            for (int i = 0; i <= 4; i++) {
                Integer draw = ThreadLocalRandom.current().nextInt(1, 70 + 1);
                if (draw.toString().equals(drawballs) == false) {
                    drawballs = drawballs + draw.toString() + " ";
                }

            }
            // This for loop checks to ensure the string of numbers is unique

            Integer BonusBall = ThreadLocalRandom.current().nextInt(1, 25 + 1);
            drawballs = drawballs + " " + BonusBall.toString();
            ticket.add(drawballs);
            if (ticket.size() == 5) {
                break;
            }

        }
        return ticket; // returns an arraylist which represents a ticket of 5 sets of numbers.
    }

}
