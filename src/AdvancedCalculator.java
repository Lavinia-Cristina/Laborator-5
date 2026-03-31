import static java.lang.Math.sqrt;

public class AdvancedCalculator {
    int state;
    public AdvancedCalculator Divide( int nr){
        this.state= this.state/nr;
        return this;
    }

    public AdvancedCalculator Exponential(int nr){
        this.state= this.state^nr;
        return this;
    }


    /*public AdvancedCalculator Squareroot(int nr){
        this.state= sqrt(this.state);
        return this;
    }*/
}
