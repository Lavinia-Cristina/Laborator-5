package advanced;

public abstract class DoubleCalulator extends ACalculator{
    double state;
    public DoubleCalulator Add(int nr){
        this.state= this.state+nr;
        return this;
    }

    public DoubleCalulator Substract(int nr){
        this.state= this.state-nr;
        return this;
    }


    public DoubleCalulator Multiply(int nr){
        this.state= this.state*nr;
        return this;
    }
}
