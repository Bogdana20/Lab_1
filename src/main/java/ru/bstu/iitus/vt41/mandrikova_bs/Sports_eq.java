package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public abstract class Sports_eq {
    protected String name;
    protected String sportType;
    protected int weight;
    protected int inventoryNumber;

    public abstract void init(Scanner scanner);
}