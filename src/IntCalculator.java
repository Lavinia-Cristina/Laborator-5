public class IntCalculator extends AdvancedCalculator{
    int state;


    public IntCalculator(int stat)
    {

        this.state=stat;
    }


    public IntCalculator Add( int nr){
        this.state= this.state+nr;
        return this;
    }

    public IntCalculator Substract(int nr){
        this.state= this.state-nr;
        return this;
    }


    public IntCalculator Multiply(int nr){
       this.state= this.state*nr;
       return this;
    }


    public int Result(){
        return state;
    }


    public int Clear(int stat){
        state=0;
        return state;
    }
}
