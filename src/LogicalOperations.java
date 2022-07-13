public class LogicalOperations {


    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }


    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";
    }

    public String verifyText(String textInput) {
        if (textInput.equals("FastTrack")) {
            return ("Learning text comparison");

        } else if (!textInput.equals("FastTrack")) {
            return "“Got to try some more”";
        }
        return "00";
    }


    public String verifiyNumberEx6(int number) {
        if (number >= 8 || number == 6) {
            return ("The amount of snow this winter was(cm):" + number);
        } else
        //if(number <= 8 || number != 6 );
        {
            System.out.println("The forecast snow is(cm):" + number);

        }
        return "0";
    }


    public String verifyNumberEx7(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) ;

        return "The number is lower than 3";

    }

    public String isNumberEven(int number) {
        if ((number % 2) == 0) {
            return "true";
        } else {
            return "false";
        }


    }

    public String isEligibleToVote(int number) {
        if (number >= 18) {
            return "true";
        } else {
            return "false";
        }
    }


    public String greatestFrom3(int x, int y, int z) {

        if (x > y && x > z) {
            return ("Greatest number is:" + x);
        } else if (y > z) {
            return ("Greatest number is:" + y);
        } else {
            return ("Greatest number is:" + z);
        }


    }

    public void printToHundred(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public double SumAndAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
        ;
        return sum / 100d;

    }

    public void printTominusHundred(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.println(i);
        }

    }


    public void printXtoY(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }
    //Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).


    public int SumEx7() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        ;
        return sum;



            }
    }












