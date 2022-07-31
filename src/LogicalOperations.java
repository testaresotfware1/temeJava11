import java.util.List;

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
    // int sum= 0;
    // double count= 0;
    //while(start < finish){
    //   if(start %2 !=0){
    //   sum= sum+start;
    //   count++;
    //   }
    //start++;
    //}
    //return sum/count;
//}


    public int printToHundred1(int start, int finish) {
        while (start < finish) {
            System.out.println(start);
            start++;
        }
        return start++;
    }


    public int printToMinusHundred1(int start, int finish) {
        while (start >= -finish) {
            System.out.println(start);
            start--;
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
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else if (y < x) {
            while (y <= x) {
                y++;
                System.out.println(y);
            }
        } else {
            System.out.println("Numbers are equal!");
        }

    }


    public void displayEvenNumbersWhile() {
        int start = 1;
        while (start <= 100) {
            start++;
            if (start % 2 == 0) {
                System.out.println(start);

            }
        }
    }

    public void oddNumbersWhile() {

        int number = 1;

        while (number <= 100) {

            number++;

            if (number % 2 != 0) {

                System.out.println(number);

            }

        }

    }


    public double getAverageInIntervalEx8(int start, int finish) {
        int sum = 0;
        double count = 0;
        while (start <= finish) {
            if (start % 7 == 0)
                sum = sum + start;
            start++;
            count++;
        }
        return (sum / count);
    }

    public void Fibonacci() {
        int i = 1, n = 20, firstnumber = 0, secondnumber = 1;
        System.out.println("Fibonacci series till" + n + "numbers");
        while (i <= n) {
            System.out.println(firstnumber + " ");
            int nextnumber = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextnumber;
            i++;
        }
    }

    public void cozalozawoza() {
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

    public int[] populateArrayUpToNumber(int number) {
        int[] array = new int[number];

        //array[0]=1;
        //array[1]=2;
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i + 1;

        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        return sum / array.length;
    }


    public int[] getEvenArrayToHundred(int[] evenArray) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenArray[j] = i;
                j++;
            }
        }
        return evenArray;

    }


    public boolean checkInArray(String[] arrString, String input) {
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equals(input)) {
                return true;
            }
        }
        return false;
    }

    public int getPositionInArray(int[] Numbers, int nr) {
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == nr) {
                return i;
            }
        }
        return 0;

    }

    public void drawLines() {
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};
        for (int i = 0; i <= 10; i++) {
            System.out.println(line);
        }


        /*public int[] removeNrFromArray(int[] myArray, int nr) {
            int[] secondArray = new int[myArray.length];
            int j = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == nr)
                    continue;
                secondArray[j++] = myArray[i];
            }
            int[] finArray = new int[j];
            for (int i = 0; i < j; i++)
                finArray[i] = secondArray[i];
            return finArray;
        }

        public int getSecondSmallestNrInArray(int[] myArray) {
            int temporary = 0;
            for(int i = 0; i< myArray.length;i++){
                for(int j = i + 1;j<myArray.length;j++){
                    if(myArray[i] > myArray[j]){
                        temporary = myArray[j];
                        myArray[j] = myArray[i];
                        myArray[i] = temporary;
                    }
                }
            }
            return myArray[1];
        }

        public int[] copyArray(int[] firstArray, int[] emptyArray) {
            for (int i = 0, j = 0; i < firstArray.length; i++) {
                emptyArray[j] = firstArray[i];
                j++;
            }
            return emptyArray;
        } */

        //public boolean isValueInArray(String[] array, String value){
        //   for (int i=0;i< array.length;i++){
        //      if(array[i].equals(value)){
        //         return true;
//
        //     }
        //  }
        //  return false;
    }

    //LABORATOR6
    public void printNumbersBackwardsFromList(List<Integer> myList) {

        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }

    public void printListEx1(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    public void addNumberToListEx2(List<Integer> myList, int number) {
        myList.add(number);
    }

    public void printListByIndexEx3(List<Integer> myList, int position) {

        for (int i = position; i < myList.size(); i++) {

            System.out.println(myList.get(i));
        }
    }

    public void addStringToMyListEx5(List<String> myList, int index, String text) {
        myList.add(index, text);
    }

    public void addNumbertoFirstIndexEx6(List<Integer> myList, int number) {
        myList.add(0, number);

    }

    public void printListIndexAndElementsEx7(List<Integer> myList) {

        for (int i = 0; i < myList.size(); i++)

            System.out.println("Index " + i + " are elementul " + myList.get(i));

    }

    public int getBiggestValueFromListEx9(List<Integer> myList) {

        int biggest = myList.get(0);

        for (int i = 0; i < myList.size(); i++) {

            if (myList.get(i) > biggest) {

                biggest = myList.get(i);

            }

        }

        return biggest;

    }

    public int getHighestNumber(List<Integer> list) {
        int max = list.get(0);
        for (int x : list) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    //7.5.In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

    public void readArrayIndex(int[] array, int number){
        try{
            System.out.println(array[number]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inside catch, number too large");
        }
    }
    //7.6. In clasa LogicalOp, creati o metoda  'wait()'.
    // Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int. In interiorul ei,
    // tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
    // Ex: wait(5) -> asteapta 5 secunde.
    public void wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}








































































