package Play2Win;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

/*This class should generate 4 random numbers from 0-9 (the numbers generated need not be unique)
 * Generate an arraylist with 5 numbers representing a ticket
 * odds of winning are 1 in 1,000
 * 
 */
public class Pick3 {

    public Pick3() {
        // no-arg constructor
    }

    public ArrayList<String> generateNumbers() {
        ArrayList<String> ticket = new ArrayList<String>();

        // this for loop generates 5 random non-unique numbers between 0 and 9.
        while (ticket.size() != 5) {
            String drawballs = "";
            for (int i = 0; i <= 3; i++) {
                Integer draw = ThreadLocalRandom.current().nextInt(0, 9 + 1);
                drawballs = draw.toString();
                drawballs = drawballs + draw.toString() + " ";
            }
            ticket.add(drawballs);
            if (ticket.size() == 5) {
                break;
            }
        }

        return ticket; // returns an arraylist which represents a ticket of 5 number strings.

    }

}
