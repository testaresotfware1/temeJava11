public class Calculator {
    public int sum(int parameterVariable, int b){
        //      System.out.println(text);
        return parameterVariable+b;

    }
    public  double substract(double x, double y) {
        //   System.out.println(text);
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;


    }
    public double divide(double x, double y) {
        return x / y;
    }
     public double artimetic (double x, double y, double z){
        return (x + y + z) / 3;
    }

    public double module (double x, double y){
        return  x % y;
             }
         //  Scrieti o metoda java, care sa primeasca ca si parametru un numar,
    //  care sa reprezinte temperatura in Fahrenheit,
    //  si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)


    public double temp (double x, double y){
        return 5/9 *(x - 32) ;
    }

}

