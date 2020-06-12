public class Main {
    public static void main(String[] args) {
          Die theDie = new Die(6,2,1,1,1,1,2);
              System.out.println("Perfectly Normal dice: " + theDie.roll());
              theDie.setProbabilities(new int[]{2,1,1,1,1,2});
          System.out.println();
          Die dieFact= DiceFactory.makeDie();
            System.out.println("Dice Factory: " + dieFact.roll());
            System.out.println();
          Die dieFact1= DiceFactory.makeDie10();
             System.out.println("Dice Factory1: " + dieFact1.roll());
      }
}
