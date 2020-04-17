import diceAlgorithm.diceAlgorithm;

public class DiceFactory implements diceAlgorithm {

    static int  makeDie() {
        return diceAlgorithm.roll();
    }
}
