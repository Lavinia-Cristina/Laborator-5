package advanced;

public abstract class ACalculator {
    ACalculator state;


    public ACalculator Result(){
        return state;
    }

    public ACalculator Clear(){
        return null;
    }

    public abstract int init();
}
