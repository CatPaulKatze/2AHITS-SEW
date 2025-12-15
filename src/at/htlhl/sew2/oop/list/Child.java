package at.htlhl.sew2.oop.list;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Child {

    private static final DateTimeFormatter DOB_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private boolean isNaughty;

    public Child(String firstName, String lastName, String dobString) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dobString, DOB_FORMATTER);
        this.isNaughty = false;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public boolean isNaughty() {
        return isNaughty;
    }

    public void setNaughty(boolean isNaughty) {
        this.isNaughty = isNaughty;
    }

    public boolean isOver18OnChristmasEve() {
        LocalDate dateOfChristmasEve = LocalDate.of(LocalDate.now().getYear(), 12, 24);
        Period ageOnChristmasEve = Period.between(dateOfBirth, dateOfChristmasEve);

        return ageOnChristmasEve.getYears() >= 18;
    }

    @Override
    public String toString() {
        return "Child{" +
                "firstName='" + firstName + "'" +
                ", lastName='" + lastName + "'" +
                ", dateOfBirth=" + dateOfBirth +
                ", isNaughty=" + isNaughty +
                "}";
    }
}
