import java.util.Scanner;

     public class Main2 {
     static String classVariable = "Fresh!" ;

     public static void main(String[] args) {
         //System.out.println("Buna,");
         //Hello (  "Irina");

        // ex 7:Scrieti o metoda java, care sa primeasca ca si parametru un numar,
         // care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
         // Formula de calcul este: C = 5/9 * (F -32)
         // int a = 79;
        // int b = ((a - 32) * 5 / 9);
        // System.out.println("Temperatura in Celsius este " + b);

         //ex 8:Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
         // care sa reprezinte distanta in inch, si sa returneze distanta in metrii
         //double a = 40;
        // double b = a * 0.0254;
        //System.out.println("Distanta in metri este "+ b);

        // 9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
         // si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)

         float timeSeconds = 1;
         int ora = 1;
         int min = 60;
         int sec = 60;
         float mps, kpo, mpo;
         int distance = 1000;

         timeSeconds = (ora * 3600) + (min * 60) + sec;
         mps = distance / timeSeconds;
         kpo = (distance/ 1000.0f) / (timeSeconds/3600.0f);
         mpo = kpo / 1609.0f;
         System.out.println("Viteza in metri pe secunda este " + mps);
         System.out.println("Viteza in kilometri pe ora este"+ kpo);
         System.out.println("Viteza in mile pe ora este "+ mpo);






      //  String localVariable = "Uau!";
     //   System.out.println(localVariable);
     //   System.out.println(classVariable);


       Calculator calc = new Calculator();
       System.out.println(calc.sum(3,4));
       System.out.println(calc.substract(1,10.5));
        System.out.println(calc.multiplication(1, 2));
        System.out.println(calc.divide(4, 2));
       System.out.println(calc.artimetic(2,3,4));
        System.out.println(calc.module(1,2));




     Print print = new Print();
     //print.printStars();
     print.model1();
     print.model2();

       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter first number: ");
        double firstNumber= scanner.nextDouble();
        System.out.println("Please enter second number: ");
        double secondNumber = scanner.nextDouble();
       // System.out.println("Please enter third number: ");
        //double altreileaNumar = scanner. nextInt();
      //System.out.println("Suma numerelor tale este: " + calc.sum(firstNumber, secondNumber) );
       // System.out.println("Rezultatul adunarii este: " + calc.sum(firstNumber, secondNumber));
       // System.out.println("Rezultatul scaderii este:"+ calc.substract(firstNumber, secondNumber));
       // System.out.println("Rezultatul inmultirii este :" + calc.multiplication(firstNumber, secondNumber));
       // System.out.println("Rezultatul impartirii este:" + calc.divide(firstNumber, secondNumber));
       // System.out.println("Media aritmetica este: " + calc.artimetic(firstNumber, secondNumber, altreileaNumar));
        // System.out.println("Restul impartirii este: "+ calc.module(firstNumber, secondNumber));

    }
       public static int adunare (int primulNumar, int aldoileaNumar){
        int rezultat= primulNumar + aldoileaNumar;
        return rezultat;
     }
         public int scadere (int primulNumar,int aldoileaNumar){
        int rezultat = primulNumar -aldoileaNumar;
        return rezultat;
         }
         public double inmultire (double primulNumar, double aldoileaNumar){
        double rezultat = primulNumar * aldoileaNumar;
                return rezultat;
         }
          public double impartire(double primulNumar, double aldoileaNumar){
        double rezultat = primulNumar / aldoileaNumar;
        return rezultat;
        }
         public static void Hello (String nume) {
             System.out.println("," + nume + "!");

         }

         public  double aritmetic(double primulNumar, double aldoileNumar, double altreileaNumar){
         double rezultat = (primulNumar + aldoileNumar + altreileaNumar) / 3;
         return rezultat;


         }
         public  double module (double primulNumar, double aldoileaNumar){
         double rezultat = primulNumar % aldoileaNumar;
         return rezultat;
         }




    }

