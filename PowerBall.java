package Play2Win;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

/*This class should generate 5 DIFFERENT numbers from 1 to 69 and then an additional
 * "powerball" number from 1 to 26 (the numbers generated must be unique)
 */

public class PowerBall {

    public PowerBall() {
        // no-arg constructor
    }

    public ArrayList<String> generateNumbers() {

        ArrayList<String> ticket = new ArrayList<>();

        while (ticket.size() != 5) {// this while loop ensures that the Hashset only has 5 numbers in it.

            String drawballs = "";// this for loop generates 5 random numbers between 1 and 69
            for (int i = 0; i <= 4; i++) {
                Integer draw = ThreadLocalRandom.current().nextInt(1, 69 + 1);
                if (draw.toString().equals(drawballs) == false) {
                    drawballs = drawballs + draw.toString() + " ";
                }

            }
            Integer BonusBall = ThreadLocalRandom.current().nextInt(1, 26 + 1);
            drawballs = drawballs + " " + BonusBall.toString();
            ticket.add(drawballs);// this adds the srting of 5 numbers to the Hashset
            if (ticket.size() == 5) {
                break;
            }
            /*
             * This array needs to be compared with previous arrays over the last 5 years.
             * A second comparison should be made for the frequency of numbers output
             * "This number has been drawn 3,456 times out of 5,678 draws"
             * The ideal ticket will have high frequency numbers in a low frequency
             * combination of numbers over the last 5 years.
             * Check any data on probability of winning with the numbers generated!
             */
        }

        return ticket; // returns an arraylist which represents a ticket of 5 sets of numbers.

    }

}
