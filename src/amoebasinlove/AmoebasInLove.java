//********************************************************************************
// PantherID:  [2649014]
// CLASS: COP 2210 – [Spring 2017]
// ASSIGNMENT # [1]
// DATE: [February 18th, 2017]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package amoebasinlove;

import javax.swing.JOptionPane;

public class AmoebasInLove {

    public static void main(String[] args) {

        int reply = JOptionPane.showConfirmDialog(null,
                "Would you like to make an Amoeba Colony?",
                "Amoeba Colony", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {

            String careTakerName = JOptionPane.showInputDialog(
                    "Great! So, what's your name?");

            String colonyName = JOptionPane.showInputDialog(
                    "What would you like to name your colony?");

            int startSize = Integer.parseInt(JOptionPane.showInputDialog(
                    "How many amoebas would you like to start with?"));

            int daysFed = Integer.parseInt(JOptionPane.showInputDialog(
                    "How many times would you like feed your amoebas?"));

            int timesBred = Integer.parseInt(JOptionPane.showInputDialog(
                    "How many times would you like them to breed?"));

            boolean vitamin = Boolean.parseBoolean(JOptionPane.showInputDialog(
                    "Lastly, would you like to give them a vitamin? Type "
                    + "\"True\" or \"False\" please."));

            Colony myColony = new Colony(careTakerName, colonyName,
                    startSize, daysFed, timesBred, vitamin);

            myColony.breed();
            myColony.sickness();

            JOptionPane.showMessageDialog(null,
                    "That's about it, thank you so much "
                    + "for creating this colony "
                    + myColony.getCareTakerName() + ", here's "
                    + "all the information on "
                    + myColony.getColonyName() + ":\n\n"
                    + "Colony Name: " + myColony.getColonyName() + "\n"
                    + "Care Taker Name: " + myColony.getCareTakerName() + "\n"
                    + "Starting Size: " + myColony.getStartSize() + "\n"
                    + "How many times they were fed: " + myColony.getTimesFed() + "\n"
                    + "Requested number of times to breed: " + myColony.getBreedAmount() + "\n"
                    + "How many times they successfully bred: " + myColony.getSuccessfulBreeds() + "\n"
                    + "Whether they got sick: " + myColony.getSick() + "\n"
                    + "How many died: " + myColony.getTotalKills() + "\n"
                    + "Final number of amoebas in the colony: " + myColony.getFinalSize());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Alright, well maybe later!");
            System.exit(0);
        }

    }
}
