package agile.last;

public class Memento {

    private SuperHeros state;

    public Memento(SuperHeros state) {
        this.state=state;
    }
    public SuperHeros getState() {
        return state;
    }
}
