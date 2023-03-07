package Play2Win;
import java.util.concurrent.ThreadLocalRandom;

import java.util.ArrayList;

public class Ca$h4Life {
    /*
     * This class creates 5 DIFFERENT randomly generated numbers between 1 and 60
     * and then 1 random number between 1 and 4
     * Odds of winning are 1 in 21,846,048
     * The winner gets to take home $1,000 a day for life
     * 
     * The class should ensure that the numbers generated are compared with the
     * numbers generated
     * over the last 5 years so that the odds (based on future draw probablity and)
     * of winning with the generated numbers
     * can be displayed.
     */

    public ArrayList<String> generateNumbers() {

        ArrayList<String> ticket = new ArrayList<>();

        // this for loop generates 5 random numbers between 1 and 60

        while (ticket.size() != 5) {// this while loop ensures that the Hashset only has 5 numbers in it.

            String drawballs = "";// this for loop generates 5 random numbers between 1 and 60
            for (int i = 0; i <= 4; i++) {
                Integer draw = ThreadLocalRandom.current().nextInt(1, 60 + 1);
                drawballs = draw.toString();
                if (draw.toString().equals(drawballs) == false) {
                    drawballs = drawballs + draw.toString() + " ";
                }
            }
            Integer BonusBall = ThreadLocalRandom.current().nextInt(1, 4 + 1);
            drawballs = drawballs + " " + BonusBall.toString();
            ticket.add(drawballs);// this adds the srting of 5 numbers to the Hashset
            if (ticket.size() == 5) {
                break;
            }

        }

        return ticket; // returns an arraylist which represents a ticket of 6 numbers (5 numbers plus 1
                       // bonus number)

    }
}
