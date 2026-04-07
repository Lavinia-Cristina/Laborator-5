package advanced;

public class DoubleCalculator extends ACalculator {

    public DoubleCalculator() {
        init();
    }

    @Override
    public void init() {
        this.state = 0.0; // Autoboxing in Double
    }

    public DoubleCalculator add(double nr) {
        this.state = (Double) this.state + nr;
        return this;
    }

    public DoubleCalculator subtract(double nr) {
        this.state = (Double) this.state - nr;
        return this;
    }

    public DoubleCalculator multiply(double nr) {
        this.state = (Double) this.state * nr;
        return this;
    }
}