package amoebasinlove;

import java.util.Random;

public class Colony {

    //Instance_Variables
    private int totalKills;
    private int successfulBreeds;
    private int finalSize;
    private int startSize;
    private int daysFed;
    private int timesFed;
    private int timesBred;
    private int breedAmount;
    private int amountToKill;
    private boolean sick;
    private boolean vitamin;
    private String colonyName;
    private String careTakerName;

    //Constructors
    public Colony(String careTakerName, String colonyName,
            int startSize, int timesFed, int breedAmount, boolean vitamin) {

        finalSize = startSize;
        this.startSize = startSize;
        this.timesFed = timesFed;
        timesBred = breedAmount;
        this.breedAmount = breedAmount;
        daysFed = timesFed;
        this.careTakerName = careTakerName;
        this.colonyName = colonyName;
        this.vitamin = vitamin;
        this.successfulBreeds = 0;
    }

//Breed
    public void breed() {
        if (breedAmount > 0) {
            if (breedAmount > 0 && daysFed > 0) {
                if (breedAmount <= daysFed) {
                    finalSize = (int) (startSize * (Math.pow(2, breedAmount)));
                    successfulBreeds = breedAmount;
                } else {
                    finalSize = (int) (startSize * (Math.pow(2, daysFed)));
                    successfulBreeds = daysFed;
                }
            } else {
                System.out.println("Amoebas need more food!");
            }
        } else {
            System.out.println("do nothing");
        }
    }

//Death
    Random killChance = new Random();
    int x = 1 + killChance.nextInt(100);

    public void sickness() {
        if (vitamin == true) {
            if (x > 80) {
                amountToKill = finalSize / 10;
                totalKills = amountToKill;
                finalSize = finalSize - amountToKill;
                sick = true;
            } else {
                sick = false;
            }
        } else if (x > 75) {
            amountToKill = finalSize / 10;
            totalKills = amountToKill;
            finalSize = finalSize - amountToKill;
            sick = true;
        } else {
            sick = false;
            amountToKill = 0;
            totalKills = amountToKill;
        }

    }

    //Getter Methods
    public String getVitaminStatus() {
        if (vitamin) {
            return "Vitamined!!!";
        } else {
            return "No vitamins!";
        }
    }

    public int getFinalSize() {
        return this.finalSize;
    }

    public int getStartSize() {
        return startSize;
    }

    public int getBreedAmount() {
        return breedAmount;
    }

    public int getTimesFed() {
        return timesFed;
    }

    public int getSuccessfulBreeds() {

        return successfulBreeds;

    }

    public int getTotalKills() {
        return totalKills;
    }

    public String getSick() {
        if (sick) {
            return "Yeah, they got sick.";
        } else {
            return "No sick amoebas!";
        }
    }

    public String getColonyName() {
        return colonyName.substring(0, 1).toUpperCase() + colonyName.substring(1).toLowerCase();
    }

    public String getCareTakerName() {
        return careTakerName.substring(0, 1).toUpperCase() + careTakerName.substring(1).toLowerCase();
    }

}
