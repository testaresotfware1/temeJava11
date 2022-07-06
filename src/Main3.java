import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//    EX 3   Given two numbers,
        double first = 5;
        double second = 4;

        LogicalOperations op = new LogicalOperations();
//        System.out.println("Greater value is: " + op.getGreaterNumber(first, second));

//     EX 5 Given a text input and a number input,
        String textInput = "FastTracka";
        int number = 2;
        // System.out.println(op.verifyTextAndNumber(textInput, number));

        String yrffd = "FastTrack1";
        // EX4  System.out.println(op.verifyText(yrffd));
        //EX 1
        // Calculator calc = new Calculator();
        //  System.out.println("suma a doua numere este: "+ calc.sum(first, second));
        //System.out.println("rez scaderii a doua numere este: "+ calc.substract(first, second));
        // System.out.println("rez impartirii a doua numere este: "+ calc.divide(first,second));
        // System.out.println("rez inmutirii a doua nr este:"+ calc.multiplication(first,second));
        // System.out.println("restul impartirii a doua numere este:" + calc.module(first, second));
        // System.out.println("media aitmetica a doua numere este:"+ calc.aritmetic(first, second));


        // System.out.println(op.verifiyNumberEx6(number));
        // System.out.println(op.verifyNumberEx7( number));


        Scanner keyboard = new Scanner(System.in);
        //System.out.println("Press a number: ");

       // System.out.println("press a number. It is even?");
        //int numbereven= keyboard.nextInt();
        //System.out.println(op.isNumberEven(numbereven));

       // System.out.println("Are u eligible to vote.Pls  press your age:");
        //int numberage= keyboard.nextInt();
        //System.out.println(op.isEligibleToVote(numberage));





        /* int key = keyboard.nextInt();

        switch (key) {
            case 0:
                System.out.println("The number is: 0.");
                break;
            case 1:
                System.out.println("The number is: 1.");
                break;
            case 2:
                System.out.println("The number is: 2.");
                break;
            case 3:
                System.out.println("The number is: 3.");
                break;
            case 4:
                System.out.println("The number is: 4.");
                break;
            case 5:
                System.out.println("The number is: 5.");
                break;
            case 6:
                System.out.println("The number is: 6.");
                break;
            case 7:
                System.out.println("The number is: 7.");
                break;
            case 8:
                System.out.println("The number is: 8.");
                break;
            case 9:
                System.out.println("The number is: 9.");
                break;
            default:
                System.out.println("Not aplicable");*/



        int x, y, z;
        System.out.print("Enter the first number:");
        x = keyboard.nextInt();
        System.out.print("Enter the second number:");
        y = keyboard.nextInt();
        System.out.print("Enter the third number:");
        z = keyboard.nextInt();
        System.out.println(op.greatestFrom3( x,  y,  z));

        }



        }















