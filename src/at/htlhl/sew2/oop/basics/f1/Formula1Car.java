package at.htlhl.sew2.oop.basics.f1;

public class Formula1Car {
    private final String team;
    private final String engine;

    public Formula1Car(String team, String engine) {
        this.team = team;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Formula1Car{" + "team=" + team + ", engine=" + engine + "}";
    }

    public String getTeam() {
        return this.team;
    }

    public String getEngine() {
        return this.engine;
    }
}
