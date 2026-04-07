package advanced;

public class NewIntCalculator extends ACalculator {

    public NewIntCalculator() {
        init(); // Initializam starea cand cream obiectul
    }

    @Override
    public void init() {
        this.state = 0; // Autoboxing in Integer
    }

    public NewIntCalculator add(int nr) {
        this.state = (Integer) this.state + nr;
        return this; // Returnam instanta curenta pentru a putea inlantui metodele
    }

    public NewIntCalculator subtract(int nr) {
        this.state = (Integer) this.state - nr;
        return this;
    }

    public NewIntCalculator multiply(int nr) {
        this.state = (Integer) this.state * nr;
        return this;
    }
}