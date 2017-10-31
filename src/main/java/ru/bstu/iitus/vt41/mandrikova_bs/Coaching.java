package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.ToString;

import java.util.Scanner;

@ToString
public class Coaching extends Sports_eq {

    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) тренажерного инвентаря ");
        setName(scanner.next());
        System.out.println("Ввод типа инвентаря ");
        setSportType(scanner.next());
        System.out.println("Ввод веса инвенраря ");
        this.weight = scanner.nextInt();
    }
}
