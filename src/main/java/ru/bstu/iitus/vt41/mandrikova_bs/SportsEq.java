package ru.bstu.iitus.vt41.mandrikova_bs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public abstract class SportsEq {
    protected String name;
    protected String sportType;
    protected int weight;
    protected int inventoryNumber;

    public abstract void init(Scanner scanner);
}