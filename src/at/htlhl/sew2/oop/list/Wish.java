package at.htlhl.sew2.oop.list;

public class Wish {

    private final Child child;
    private final String description;

    public Wish(Child child, String description) {
        this.child = child;
        this.description = description;
    }

    public Child getChild() {
        return child;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Wish{" +
                "child=" + child +
                ", description='" + description + "'" +
                "}";
    }
}
