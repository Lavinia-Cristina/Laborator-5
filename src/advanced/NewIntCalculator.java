package advanced;

public abstract class NewIntCalculator extends ACalculator {
Integer state;
    public NewIntCalculator Add(int nr){
        this.state= this.state+nr;
        return this;
    }

    public NewIntCalculator Substract(int nr){
        this.state= this.state-nr;
        return this;
    }


    public NewIntCalculator Multiply(int nr){
        this.state= this.state*nr;
        return this;
    }
}
