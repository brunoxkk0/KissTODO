import java.util.ArrayList;
import java.util.Scanner;

public class KISSTodo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todo = new ArrayList<>();

        System.out.println("\tTODO:");

        Loop:
        while (true){

            for(int index = 0; index < todo.size(); index++){
                System.out.printf("%d %s\n", (index + 1), todo.get(index));
            }

            String entrada = scanner.nextLine();
            String[] dados = entrada.split(" ", 2);

            switch (dados[0]){

                case "quit" -> {
                    break Loop;
                }

                case "add" -> {
                    todo.add(dados[1]);
                }

                case "mark" -> {
                    int pos = Integer.parseInt(dados[1]) - 1;
                    todo.set(pos, "✓ " + todo.get(pos));
                }

            }
        }
    }
}
