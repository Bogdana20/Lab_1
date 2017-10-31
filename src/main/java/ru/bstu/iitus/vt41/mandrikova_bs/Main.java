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


            Initialization(sportsEqs, scanner, i);
            sportsEqs[i].init(scanner);
        }
        List<SportsEq> sportsEqList = TennisIn(sportsEqs);


        System.out.println("Инвентарь, относящийся к теннису:\n");
        sportsEqList.forEach(System.out::println);
    }

    private static void Initialization(SportsEq[] sportsEqs, Scanner scanner, int i) {
        switch (scanner.nextInt()) {
            case 1:
                sportsEqs[i] = new Volleyball();
                break;
            case 2:
                sportsEqs[i] = new TennisBall();
                break;
            case 3:
                sportsEqs[i] = new Racket();
                break;
            case 4:
                sportsEqs[i] = new Javelin();
                break;
            case 5:
                sportsEqs[i] = new Barbell();
                break;
            case 6:
                sportsEqs[i] = new Bob();
                break;
        }
    }

    public static List<SportsEq> TennisIn(SportsEq[] sportsEqs) {


        List<SportsEq> tennis = Arrays.stream(sportsEqs)
                .filter(s -> s.getSportType().equals("Tennis"))
                .collect(Collectors.toList());
        return tennis;
    }
}
