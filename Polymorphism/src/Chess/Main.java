package Chess;

import com.company.Array;
import com.company.Storage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChessFigure[] chessFigures = new ChessFigure[2];
        Storage<ChessFigure> storage = new Array<ChessFigure>(chessFigures);
        storage.add(new King(4, 0));
        storage.add(new Elephant(2, 0));
        Position position = storage.get(0).getPosition();
        boolean bool = true;
        while (bool) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите индекс фигуры, которой хотите походить: ");
            int figure = scanner.nextInt();
            System.out.println("Введите координату x: ");
            int x = scanner.nextInt();
            System.out.println("Введите координату y: ");
            int y = scanner.nextInt();
            bool = storage.get(figure).move(new Position(x, y));
            System.out.println("Ваши новые координаты координаты: " + storage.get(figure).getPosition());
        }
    }
}
