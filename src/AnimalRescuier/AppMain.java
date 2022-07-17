package AnimalRescuier;

public class AppMain {
    public static void main(String[] args) {
        Dog ralph =  new Dog();
        System.out.println(ralph.getName());
        ralph.setName("Ralph");
        ralph.play();

        Dog rex= new Dog();
        rex.setName("Rex");
        System.out.println(rex.getName());
        rex.play();

        Dog grivey =new Dog();
        grivey.setName("Grivey");
        grivey.eat();



        System.out.println(ralph.getAge());
        ralph.setAge(10);
        System.out.println(ralph.getRase());
        ralph.setRase("Buldog");
        System.out.println(ralph.getColor());
        ralph.setColor("gray");
        System.out.println(ralph.getWeight());
        ralph.setWeight(10.5);
        System.out.println(ralph.getheightCm());
        ralph.setheightCm(20);
        System.out.println(ralph.getLevelOfHealth());
        ralph.setLevelOfHealth(9);
        System.out.println(ralph.getFeelingHungry());
        ralph.setFeelingHungry(7);
        System.out.println(ralph.getMoodLevel());
        ralph.setMoodLevel(8);
        System.out.println(ralph.getFavFood());
        ralph.setFavFood("bone");
        System.out.println(ralph.getFavActivity());
        ralph.setFavActivity("playing");
       ralph.eat();
       ralph.sleep();
       ralph.speak();
       ralph.waveTail();

       Child tudu =new Child();
        System.out.println(tudu.getName());
        tudu.setName("Tudor");

        System.out.println(tudu.getAge());
        tudu.setAge(3);
        System.out.println(tudu.getMoney());
        tudu.setMoney(25);
        System.out.println(tudu.getColorEye());
        tudu.setColorEye("blue");
        System.out.println(tudu.getWeight());
        tudu.setWeight(15.4);
        System.out.println(tudu.getHeightCm());
        tudu.setHeightCm(100);
        System.out.println(tudu.getLevelOfHealth());
        tudu.setLevelOfHealth(10);
        System.out.println(tudu.getFeelingHungry());
        tudu.setFeelingHungry(9);
        System.out.println(tudu.getMoodLevel());
        tudu.setMoodLevel(8);
        System.out.println(tudu.getFavFood());
        tudu.setFavFood("apte");
        System.out.println(tudu.getFavActivity());
        tudu.setFavActivity("playing");
        tudu.eat();
        tudu.sleep();
        tudu.speak();
        tudu.play();

        Food  food= new Food();
        System.out.println(food.getName());
        food.setName("Fooddog");
        System.out.println(food.getPriceEuro());
        food.setPriceEuro(50.5);
        System.out.println(food.getAmountKg());
        food.setAmountKg(2);
        System.out.println(food.getAvailability());
        food.setAvailability(2);

        Vet vet = new Vet();
        System.out.println(vet.getName());
                vet.setName("Dogdoctor");
        System.out.println(vet.getSpecialization());
        vet.setSpecialization("rats");
        System.out.println(vet.getColorEye());
        vet.setColorEye("green");
        System.out.println(vet.getWeight());
        vet.setWeight(88);
        System.out.println(vet.getHeightCm());
        vet.setHeightCm(180);
        System.out.println(vet.getLevelOfHealth());
        vet.setLevelOfHealth(10);
        System.out.println(vet.getFeelingHungry());
        vet.setFeelingHungry(9);
        System.out.println(vet.getMoodLevel());
        vet.setMoodLevel(8);
        System.out.println(vet.getFavFood());
        vet.setFavFood("ciocolata");
        System.out.println(vet.getFavActivity());
        vet.setFavActivity("working");


        vet.eat();
        vet.sleep();
        vet.speak();
        vet.play();

        Environment envi = new Environment();
        System.out.println(envi.getName());
        envi.setName("Central Parc");









    }
}
