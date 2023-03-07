package Play2Win;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*This class should generate a ticket with 5 sets of randomly generated numbers, each set should have 5
 * numbers between 0 and 9 (the numbers generated need not be unique)
 * the numbers should be stored in an arraylist
 * odds of winning 1 in 10,000
 */

public class Pick4 {

    public Pick4() {
        // no-arg constructor
    }

    public ArrayList<String> generateNumbers() {
        ArrayList<String> ticket = new ArrayList<String>();

        // this for loop generates 5 random non-unique numbers between 0 and 9.
        while (ticket.size() != 5) {
            String drawballs = "";
            for (int i = 0; i <= 4; i++) {
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
