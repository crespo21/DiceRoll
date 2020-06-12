
//DiceFactory class implements DiceAlgorithm interface
public class DiceFactory implements DiceAlgorithm {
    //makeDie calls Die class with 6 sides from the interface
    public static Die makeDie() {
        return theDie;
    }
    //makeDie10 calls Die class with 10 sides from the interface
    public static Die makeDie10() {
        return theDie10;
    }
}
