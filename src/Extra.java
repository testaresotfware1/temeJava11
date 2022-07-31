public class Extra {

    public static void main(String[] args) {


        String txt = "Hello";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));

        String txt1 = "Hello Everybody";
        System.out.println(txt1.indexOf("e"));

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        int x = 10;
        int y = 9;
        System.out.println(x > y);

        int z = 0;
        int t = 50;
        // if (z > t) {
        //    System.out.println("Hello World");
        //   if ( z == t)
        //   {    System.out.println("Hello");
        //  }

        //  if (z ==t ){
        //     System.out.println("yes");
        //  }else{
        //     System.out.println("no");
        // }

        if (z > t) {
            System.out.println(1);

        } else if (z == t) {
            System.out.println(2);
        } else {
            System.out.println(3);


        }

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
        }

        int dayz = 4;
        switch (
                dayz
        ) {

            case
                    1:
                System.out.println("Saturday");
                break;

            case
                    2:
                System.out.println("Sunday");

                break
                        ;

            default
                    :
                System.out.println("Weekend");
        }

       /*int i = 1;
       while
        (i < 6) {
            System.out.println(i);

            i++
            ;
        }
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        }
        while
        (i < 6);


        for
        (int i = 0; i < 5;
         i++
        ) {
            System.out.println(
                    "Yes"
            );
        }*/
        String[] cars = {"Volvo", "BMW", "Ford"};
        for
        (String i :
                cars
        ) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {

             break   ;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {

                continue
                        ;
            }
            System.out.println(i);
        }

        String[] cars1 = {"Volvo", "BMW", "Ford"};
        String[] cars2 = {"Volvo", "BMW", "Ford"};
        System.out.println( cars2[1]  );
        String[] cars3= {"Volvo", "BMW", "Ford"};
        cars3[0] = "Opel" ;
        System.out.println(cars3[0]);

        String[] cars4 = {"Volvo", "BMW", "Ford"};
        System.out.println( cars4.length);

        String[] cars5 = {"Volvo", "BMW", "Ford"};
        for (String i : cars5 ) {
            System.out.println(i);
        }


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };















    }
}





















