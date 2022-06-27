public class Main {

    public static void main(String[] args) {

       System.out.println("Hello world!");


        System.out.println("Altceva");
        String author = "Ana";
        int busnumber = 35;
        long longValue = 21654651233135454L;

        float kgdemereAuthor = 4.5F;

        int additionalAppleskg = 2;


        System.out.println(author + " vrea sa cumpere \"mere\".\n"
                +
                "Pentru a cumpara mere, " +author + " trebuie sa mearga la piata, \n" +
                "pe strada Avram Iancu. Pe strada Avram Iancu, exista \n" +
                "cea mai mare piata agricola. " +author + " va merge la piata \n" +
                "cu autobuzul numarul " +busnumber+ "" +
                ". Pe autobuz, " +author +  " se  intalneste cu \n" +
                "George, care si el merge sa cumpere mere. +author + vrea sa cumpere \n" +
                kgdemereAuthor +"  kg de mere, iar George 10 ca e barbat. Pe drum inapoi \n" + author +
                " se razgandeste, si se intoarce sa mai cumpere "+additionalAppleskg+" kg de mere. " + author + " are acum\n" +
                (kgdemereAuthor + additionalAppleskg) +" kg de mere");


        int x = 2;
        double y = 4;
        double z = x + y; // mai intai se executa adunarea si apoi atribuirea

        System.out.println(z);
        z++;

        // x+=2;  x = x + 2;
        x+=x+=x++ + ++x;

        //sus- jos, stg dr dar executa de la dr la st si se vaexecuta adunarea c m de int, dar inainte ++ si eg 10;
        System.out.println(x);

        System.out.println(x++);
        System.out.println(x);

        //Tema:
        //1
        System.out.println("Hello");
        System.out.println("Irina");
        //2
        x = 2;
        y = 3;
        z = x + y ;
        System.out.println(z);
        //3
        x = 10;
        y = 3;
        z = x / y;
        System.out.println(z);
        //4a
        x = -5;
        y = 8;
        z = 6;
        System.out.println(x+ (y * z));
        //4b
        x = 55;
        y = 9;
        z = 9;
        System.out.println((x + y) % z);
        //4c
        System.out.println(20 + ( (-3*5) / 8) ) ;
        //4d
        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(5 + 15 / (3 * 2) - 8 % 3);


            }
    //1. Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().



}