import java.util.Scanner;

public class Main {

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        Operations operation = new Operations();

        do {
            System.out.println("Selectati una din operatiile de mai jos: ");
            System.out.println("Adunare");
            System.out.println("Scadere");
            System.out.println("Impartire");
            System.out.println("Inmultire");
            String select = choice.nextLine();

            switch (select) {
                case "Adunare" -> {
                    System.out.println("Ati selectat operatia de adunare. ");
                    operation.addition();
                    System.out.println("Rezulatul este: " + operation.result);
                }
                case "Scadere" -> {
                    operation.substraction();
                    System.out.println("Rezulatul este: " + operation.result);
                }
                case "Impartire" -> {
                    operation.division();
                    System.out.println("Rezulatul este: " + operation.result);
                }
                case "Inmultire" -> {
                    operation.multiplication();
                    System.out.println("Rezulatul este: " + operation.result);
                }
            }
        } while (true);
    }
}
