public class Main {
    public static void main(String[] args) {
          Die theDie = new Die(6,1,1,1,1,1,1);
              System.out.println(theDie.roll());
              theDie.setProbabilities(new int[]{2,1,1,1,1,2});
              DiceFactory.makeDie();
      }
}
