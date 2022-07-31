import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {

      //  List<Integer> myList= new ArrayList<>();


     //  myList.add(3);
     // int x= 3;
      //Integer y = 3;

      //  System.out.println(myList.get(0));
      //  myList.remove(Integer.valueOf(3));
      //  System.out.println(myList.size());


      //  List<Float> myListOfFloats= new ArrayList<>();
       // myListOfFloats.add(3.4F);
       // myListOfFloats.remove(3.4F);
       // System.out.println(myListOfFloats.size());

       // myList.add(3);
       // myList.add(3);
       // myList.add(3);
       // myList.add(3);
       // myList.add(3);
        //set= update
        //add= insert
       // myList.set(2,5);
       // myList.add(2,5); */


       // int a=1;
       // String z= "1";

       // List<String>myListOfStrings= new ArrayList<>();

      //  List<Integer> myListOfInt= new ArrayList<>();
      //  for(int i= 1; i<=100; i++) {
       //  myListOfInt.add(i);
      //   }

       // List<String>myListOfStrings2= new ArrayList<>(100);

       // for(int i= 1; i<=100; i++) {
       //     myListOfStrings.add(i + "");
       // }


       // System.out.println(myListOfStrings);

      //  System.out.println("[");
       // for(String value:myListOfStrings){
      //      System.out.println(value + ",");
       // }
       // System.out.println("]");


        //int z= 1;
       // for (String value :myListOfStrings2){
        //    value=z+ "";
         //   z++;
        //}
        // for(String value:myListOfStrings)
        //    System.out.println(value);

        LogicalOperations op= new LogicalOperations();
        //op.printNumbersBackwardsFromList(myListOfInt);

        List<Integer> myListOfInt= new ArrayList<>();
        for(int i= 1; i<=9; i++) {
            myListOfInt.add(i);
        }
        //op.printListEx1(myListOfInt);

       // op.addNumberToListEx2(myListOfInt,3);

        //op.printListByIndexEx3(myListOfInt,2);

        List<String>myListOfStrings= new ArrayList<>(3);
       myListOfStrings.add("a") ;
        myListOfStrings.add("aa") ;
        myListOfStrings.add("aaa") ;
        myListOfStrings.add("aaa") ;

        op.addStringToMyListEx5(myListOfStrings,1,"a");


        List<Integer> myListOfInt1= new ArrayList<>();
        for(int i= 0; i<=9; i++) {
            myListOfInt.add(i);
        }
       // op.addNumbertoFirstIndexEx6(myListOfInt1,55);

       // op.printListIndexAndElementsEx7(myListOfInt);

        List<Integer> myListOfInt2= new ArrayList<>();
        for(int i= 1; i<=9; i++) {
            myListOfInt.add(i);
        }

        //System.out.println(op.getBiggestValueFromListEx9());

       // Calculator calc= new Calculator();
       // calc.sum(myList);







        }





    }

