package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.Getter;
import lombok.ToString;

import java.util.Scanner;

@ToString
@Getter
public class Ball extends Sports_eq {
    private int radius;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) инвентаря ");
        setName(scanner.next());
        System.out.println("Ввод типа инвентаря ");
        setSportType(scanner.next());
        System.out.println("Ввод радиуса мяча ");
        this.radius = scanner.nextInt();
    }

}
