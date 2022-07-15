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

    // RforLoops ex3
    public void countBetween(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
        for (int i = x; i >= y; i--) {
            System.out.println(i);
        }
    }

    //RforLoops ex 4
    public void countBetween1(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else if (y < x) {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Numbers are equal!");
        }

    }

    public void displayEvenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void displayOddNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    public int returSum(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;
            // sum = sum + i;
            // System.out.println(sum);
        }
        return sum;
    }

    public void printPattern() {
        for (int j = 7; j >= 1; j--) {
            String text = "";
            for (int i = j; i >= 1; i--) {
                text = text + "*";
            }
            System.out.println(text);
        }
    }

    public double getAverageInInterval(int start, int finish) {
        int sum = 0;
        double count = 0;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }
        return (sum / count);
    }

    // public void getAverageForEvenInInterval(int start, int finish) {
    //   while (start <= finish) {
    //       start++;
    //       System.out.println(start);
    //   }
    //}


    public int printToHundred1(int start, int finish) {
        while (start < finish) {
            System.out.println(start);
            start++;
        }
        return start++;
    }


    public int printToMinusHundred1(int start, int finish) {
        while (start < finish) {
            System.out.println(start);
            start++;
        }
        return start++;
    }

    public void countBetween2(int x, int y) {
        while (x < y) {
            System.out.println(x);
            x++;
        }
        while (x > y) {
            System.out.println(y);
            y++;
        }
    }
    public void countBetween4(int x, int y) {
        if (x < y) {
            while (x < y) {
                System.out.println(x);
                x++;
            }
        } else if (y < x) {
            while (y < x) {
                y++;
                System.out.println(y);
            }
        } else {
            System.out.println("Numbers are equal!");
        }




        //public void displayOddNumbers1() {
         //   int x =1;
          //  while(x<=100){
          //      x++;
           //     if(x % 2 !=0){
           //         System.out.println(x);
            //    }
           // }
        }


        public void displayEvenNumbers(int start,int finish) {
            while (start<= finish ) {
                if (start % 2 == 0) {
                    System.out.println(start);
                    start++;
                }
            }
        }

    public double getAverageInIntervalEx8(int start, int finish) {
        int sum = 0;
        double count = 0;
        while (start <= finish) {
            if(start % 7 ==0)
            sum = sum + start;
            start++;
            count++;
        }
        return (sum / count);
    }

    public void Fibonacci(){
        int i=1, n=20, firstnumber=0,secondnumber= 1;
        System.out.println("Fibonacci series till"+ n + "numbers");
        while(i<=n){
            System.out.println(firstnumber + " ");
            int nextnumber= firstnumber + secondnumber;
            firstnumber= secondnumber;
            secondnumber= nextnumber;
            i++;
        }
    }

    public void cozalozawoza(){
        int i = 1;

        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

    }








































