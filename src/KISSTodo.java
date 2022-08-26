import java.util.ArrayList;
import java.util.Scanner;

public class KISSTodo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todo = new ArrayList<>();

        System.out.println("\tTODO:");

        Loop:
        while (true){

            for(int index = 1; index <= todo.size(); index++)
                System.out.println(index + " " + todo.get(index - 1));

            String[] entrada = scanner.nextLine().split(" ", 2);

            switch (entrada[0]){
                case "quit" -> {
                    break Loop;
                }
                case "add" -> {
                    todo.add(entrada[1]);
                }
                case "mark" -> {
                    int pos = Integer.parseInt(entrada[1]) - 1;
                    todo.set(pos, "✓ " + todo.get(pos));
                }
            }
        }
    }
}
