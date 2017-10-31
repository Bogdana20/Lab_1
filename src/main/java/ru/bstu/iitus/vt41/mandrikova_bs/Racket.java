package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class Racket extends SportsEq {

    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) ракетки ");
        setName(scanner.next());
        System.out.println("Ввод типа ракетки ");
        setSportType(scanner.next());
        System.out.println("Ввод веса ракетки ");
        this.weight = scanner.nextInt();
    }
}
