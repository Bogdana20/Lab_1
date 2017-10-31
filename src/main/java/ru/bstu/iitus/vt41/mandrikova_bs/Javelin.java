package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class Javelin extends SportsEq {
    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) метательного копья ");
        setName(scanner.next());
        System.out.println("Ввод типа метательного копья ");
        setSportType(scanner.next());
        System.out.println("Ввод веса метательного копья ");
        this.weight = scanner.nextInt();
    }

}