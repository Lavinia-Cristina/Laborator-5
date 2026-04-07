package advanced;

public abstract class ACalculator {
    protected Object state; // Folosim Object, conform cerintei

    public Object result() {
        return state;
    }

    public void clear() {
        init(); // Clear reseteaza starea, deci apelam init()
    }

    // init() este abstracta si va fi implementata de subclase pentru a seta 0 sau 0.0
    public abstract void init();
}