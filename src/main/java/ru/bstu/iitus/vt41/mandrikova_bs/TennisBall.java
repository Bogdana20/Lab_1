package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.ToString;

import java.util.Scanner;

@ToString
public class TennisBall extends Ball {

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите инвентарный номер теннисного мяча");
        this.inventoryNumber = scanner.nextInt();
    }

}

