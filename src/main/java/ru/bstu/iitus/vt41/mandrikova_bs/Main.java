package ru.bstu.iitus.vt41.mandrikova_bs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество спортивного инвентаря: ");
        Sports_eq[] sports_eqs = new Sports_eq[scanner.nextInt()];
        initSports_eqs(sports_eqs);
    }

    public static void initSports_eqs(Sports_eq[] sports_eqs) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sports_eqs.length; i++) {

            System.out.print("Выберете тип инвентаря: \n"
                    + "1 - Волейбольный_мяч;\n"
                    + "2 - Теннисный_мяч;\n"
                    + "3 - Ракетка;\n"
                    + "4 - Метательное_копье;\n"
                    + "5 - Штанга;\n"
                    + "6 - Гиря;\n");


            switch (scanner.nextInt()) {
                case 1:
                    sports_eqs[i] = new Volleyball();
                    break;
                case 2:
                    sports_eqs[i] = new TennisBall();
                    break;
                case 3:
                    sports_eqs[i] = new Racket();
                    break;
                case 4:
                    sports_eqs[i] = new Javelin();
                    break;
                case 5:
                    sports_eqs[i] = new Barbell();
                    break;
                case 6:
                    sports_eqs[i] = new Bob();
                    break;
            }
            sports_eqs[i].init(scanner);
        }
        System.out.println("Инвентарь, относящийся к теннису:\n" + (Tennis_in(sports_eqs)).toString());
    }

    public static Sports_eq Tennis_in(Sports_eq[] sports_eqs) {
        Sports_eq TennisIn = null;
        for (Sports_eq anSports_eqs : sports_eqs) {
            if ("Tennis".equals(anSports_eqs.getSportType())) {
                TennisIn = anSports_eqs;
            }
        }
        return TennisIn;
    }
}
