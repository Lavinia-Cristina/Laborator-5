import advanced.DoubleCalculator;
import advanced.NewIntCalculator;

void main() {
    IntCalculator calculator = new IntCalculator(10);
    int result = calculator.Add(5).Substract(3).Multiply(2).Result();
    System.out.println("a) " + result);


    System.out.println(calculator.Clear(result));

    IO.println();
    IO.println("__________Clasele Abstracte:___________");

    NewIntCalculator intCalc = new NewIntCalculator();

    intCalc.add(10).add(5).subtract(3).multiply(2);

    System.out.println("Rezultat Integer: " + intCalc.result());


    DoubleCalculator doubleCalc = new DoubleCalculator();


    doubleCalc.add(10.0).add(5.0).subtract(3.3).multiply(2.2);

    System.out.println("Rezultat Double: " + doubleCalc.result());


}