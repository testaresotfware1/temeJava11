package AnimalRescuier;

public class AppMain {
    public static void main(String[] args) {
        Dog ralph =  new Dog();
        System.out.println(ralph.name);
        ralph.play();

        System.out.println(ralph.age);
        System.out.println(ralph.rase);
        System.out.println(ralph.color);
        System.out.println(ralph.weight);
        System.out.println(ralph.heightCm);
        System.out.println(ralph.levelOfHealth);
        System.out.println(ralph.feelingHungry);
        System.out.println(ralph.moodLevel);
        System.out.println(ralph.favFood);
        System.out.println(ralph.favActivity);
       ralph.eat();
       ralph.sleep();
       ralph.speak();
       ralph.waveTail();

       Child tudu =new Child();
        System.out.println(tudu.age);
        System.out.println(tudu.colorEye);
        System.out.println(tudu.weight);
        System.out.println(tudu.heightCm);
        System.out.println(tudu.levelOfHealth);
        System.out.println(tudu.feelingHungry);
        System.out.println(tudu.moodLevel);
        System.out.println(tudu.favFood);
        System.out.println(tudu.favActivity);
        tudu.eat();
        tudu.sleep();
        tudu.speak();
        tudu.play();

        Food  food= new Food();
        System.out.println(food.name);
        System.out.println(food.priceEuro);
        System.out.println(food.amountKg);
        System.out.println(food.availability);

        Vet vet = new Vet();
        System.out.println(vet.age);
        System.out.println(vet.colorEye);
        System.out.println(vet.weight);
        System.out.println(vet.heightCm);
        System.out.println(vet.levelOfHealth);
        System.out.println(vet.feelingHungry);
        System.out.println(vet.moodLevel);
        System.out.println(vet.favFood);
        System.out.println(vet.favActivity);
        vet.eat();
        vet.sleep();
        vet.speak();
        vet.play();

        Environment envi = new Environment();
        System.out.println(envi.name);









    }
}
