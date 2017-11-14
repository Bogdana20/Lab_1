package ru.bstu.iitus.vt41.mandrikova_bs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество спортивного инвентаря: ");
        SportsEq[] sportsEqs = new SportsEq[scanner.nextInt()];
        initSportsEqs(sportsEqs);
    }

    public static void initSportsEqs(SportsEq[] sportsEqs) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sportsEqs.length; i++) {

            System.out.print("Выберете тип инвентаря: \n"
                    + "1 - Волейбольный_мяч;\n"
                    + "2 - Теннисный_мяч;\n"
                    + "3 - Ракетка;\n"
                    + "4 - Метательное_копье;\n"
                    + "5 - Штанга;\n"
                    + "6 - Гиря;\n");

            sportsEqs[i] = initialization(scanner);
            sportsEqs[i].init(scanner);
        }
        List<SportsEq> sportsEqList = TennisIn(sportsEqs);


        System.out.println("Инвентарь, относящийся к теннису:\n");
        sportsEqList.forEach(System.out::println);
    }

    private static SportsEq initialization(Scanner scanner) {
        switch (scanner.nextInt()) {
            case 1:
                return new Volleyball();
            case 2:
                return new TennisBall();
            case 3:
                return new Racket();
            case 4:
                return new Javelin();
            case 5:
                return new Barbell();
            case 6:
                return new Bob();
            default:
                return null;
        }
    }

    public static List<SportsEq> TennisIn(SportsEq[] sportsEqs) {


        List<SportsEq> tennis = Arrays.stream(sportsEqs)
                .filter(s -> s.getSportType().equals("Tennis"))
                .collect(Collectors.toList());
        return tennis;
    }
}
