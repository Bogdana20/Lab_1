package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class Barbell extends Coaching {

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите инвентарный номер ");
        this.inventoryNumber = scanner.nextInt();
    }

}