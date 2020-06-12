import java.lang.reflect.Array;
import java.util.Arrays;

public class Die{
    public int sides;
    int values = 0;
    int[] probabilities;
    Integer integer = new Integer(sides);
    //Create the constructor for Die
    //to define the number of sides the die class would have
    //Extend the constructor of Die class  so
    //that it has an optional parameter called probabilities
    //This would be an array of integers
    public Die(int numberOfSides, int... probabilities){
        sides = numberOfSides;
        this.probabilities = probabilities;
    }
    //Create a method to return a
    // random number between 1 and the number of sides
    public int roll(){
        // check if the length of probability
        //is equals to the number of side
        if ((probabilities.length == sides)){
            int sum = 0;
            for (int value :probabilities) {
                sum+=value;
                if (value < 0){
                    System.out.println("negative probabilities not allowed");
                }
                if ((value < 1)){
                    System.out.println("probability sum must be greater than 0");
                }
                if ((value == integer)){
                    System.out.println("only integer values allowed");
                }
            }
           //for each value in an array  divide it by sum
            double[] percentages = new double[probabilities.length];
            for (int i = 0; i < percentages.length; i++) {
                 double chances = (double) probabilities[i] / sum;
                 if (i > 0){
                       percentages[i] = chances + percentages[i-1];
                 }
                 else{
                       percentages[i] = chances;
                 }
//                System.out.println("Weighted Dice:" + percentages[i]);
            }
            // create a random variable,
            //Then compare the random variable with
            //whatever is inside the percentage array
             double random = Math.random();
            for (int i = 0; i < percentages.length ; i++) {
                if (random < percentages[i]){
                    values = i +1;
                    break;
                }
            }
        } else{
            values = (int) (Math.random() * sides) +1;
        }
        return values;
    }

    public void setProbabilities(int[] probabilities){
        this.probabilities = probabilities;
        Die theDice = new Die(sides);
        theDice.roll();
    }

    public boolean equals(Die obj) {
        return equals(obj);
    }
}