public class Main4 {
    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();
        //int x = 12;
        // int y = 15;
        //op.printToHundred(x);
        //System.out.println(op.SumAndAverage());
        // op.printTominusHundred(x);

        //  op.printXtoY(12, 15);
        //  System.out.println(op.SumEx7());

        //for (int i= 1; i<=100; i++)
        //   if ( i % 2==0)
        //System.out.println(i);


        for (int i = 1; i <= 100; i++)
            if (i % 2 != 0)
                System.out.println(i);


        int i, j;
        for (i = 0; i <= 6; i++) {
            for (j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();


        }


    }

}
