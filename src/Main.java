
void main() {
    IntCalculator calculator = new IntCalculator(10);
    int result = calculator.Add(5).Substract(3).Multiply(2).Result();
    System.out.println("a) " + result);


    System.out.println(calculator.Clear(result));

    IO.println();
    IO.println("__________Clasele Abstracte:___________");




}