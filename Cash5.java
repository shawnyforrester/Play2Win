package Play2Win;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

/*This class should generate 5 sets of 5 DIFFERENT numbers 
 * between 1 and 41 (the numbers generated need be unique)
 * The numbers should then be added to an ArrayList object called "ticket"
 * odds of winning 1 in 749,398
 */

public class Cash5 {

    public Cash5() {
        // no-arg constructor
    }

    public ArrayList<String> generateNumbers() {
        ArrayList<String> ticket = new ArrayList<String>();

        // this for loop generates 5 random non-unique numbers between 1 and 41.
        while (ticket.size() != 5) {
            String drawballs = "";
            for (int i = 0; i <= 4; i++) {
                Integer draw = ThreadLocalRandom.current().nextInt(0, 41 + 1);
                drawballs = draw.toString();
                if (draw.toString().equals(drawballs) == false) {
                    drawballs = drawballs + draw.toString() + " ";
                }
            }

            ticket.add(drawballs);
            if (ticket.size() == 5) {
                break;
            }
        }

        return ticket; // returns an arraylist which represents a ticket of 5 sets of numbers.

    }

}