package at.htlhl.sew2.oop.basics.f1;

import java.time.LocalDate;

public class Formula1Driver {
    private static int amountOfDrivers = 0;
    private final String name;
    private final LocalDate dob;
    private final Formula1Car car;

    public Formula1Driver(String name, LocalDate dob, Formula1Car car) {
        this.name = name;
        this.dob = dob;
        this.car = car;

        amountOfDrivers++;
    }

    @Override
    public String toString() {
        return "Formula1Driver{" + "name=" + name + ", dob=" + dob + ", car=" + car + "}";
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public Formula1Car getCar() {
        return this.car;
    }

    public static int getAmountOfDrivers() {
        return amountOfDrivers;
    }
}
