package AnimalRescuier;

public class AppMain {
    public static void main(String[] args) {
        Dog ralph =  new Dog();
        System.out.println(ralph.getName());
        ralph.setName("asda");
        ralph.play();

        System.out.println(ralph.getAge());
        ralph.setAge(5);
        System.out.println(ralph.getRase());
        ralph.setRase("qwe");
        System.out.println(ralph.getColor());
        ralph.setColor("asd");
        System.out.println(ralph.getWeight());
        ralph.setWeight(5.5);
        System.out.println(ralph.getheightCm());
        ralph.setheightCm(2);
        System.out.println(ralph.getLevelOfHealth());
        ralph.setLevelOfHealth(2);
        System.out.println(ralph.getFeelingHungry());
        ralph.setFeelingHungry(3);
        System.out.println(ralph.getMoodLevel());
        ralph.setMoodLevel(3);
        System.out.println(ralph.getFavFood());
        ralph.setFavFood("asd");
        System.out.println(ralph.getFavActivity());
        ralph.setFavActivity("asdf");
       ralph.eat();
       ralph.sleep();
       ralph.speak();
       ralph.waveTail();

       Child tudu =new Child();
        System.out.println(tudu.getName());
        tudu.setName(" a");

        System.out.println(tudu.getAge());
        tudu.setAge(5);
        System.out.println(tudu.getMoney());
        tudu.setMoney(10.5);
        System.out.println(tudu.getColorEye());
        tudu.setColorEye("asz");
        System.out.println(tudu.getWeight());
        tudu.setWeight(20);
        System.out.println(tudu.getHeightCm());
        tudu.setHeightCm(23);
        System.out.println(tudu.getLevelOfHealth());
        tudu.setLevelOfHealth(9);
        System.out.println(tudu.getFeelingHungry());
        tudu.setFeelingHungry(7);
        System.out.println(tudu.getMoodLevel());
        tudu.setMoodLevel(6);
        System.out.println(tudu.getFavFood());
        tudu.setFavFood("azxc");
        System.out.println(tudu.getFavActivity());
        tudu.setFavActivity("asdfg");
        tudu.eat();
        tudu.sleep();
        tudu.speak();
        tudu.play();

        Food  food= new Food();
        System.out.println(food.getName());
        food.setName("q");
        System.out.println(food.getPriceEuro());
        food.setPriceEuro(10.5);
        System.out.println(food.getAmountKg());
        food.setAmountKg(2.5);
        System.out.println(food.getAvailability());
        food.setAvailability(3.3);

        Vet vet = new Vet();
        System.out.println(vet.getName());
                vet.setName("sas");
        System.out.println(vet.getSpecialization());
        vet.setSpecialization("asdfg");
        System.out.println(vet.getColorEye());
        vet.setColorEye("as");
        System.out.println(vet.getWeight());
        vet.setWeight(336);
        System.out.println(vet.getHeightCm());
        vet.setHeightCm(25);
        System.out.println(vet.getLevelOfHealth());
        vet.setLevelOfHealth(8);
        System.out.println(vet.getFeelingHungry());
        vet.setFeelingHungry(8);
        System.out.println(vet.getMoodLevel());
        vet.setMoodLevel(5);
        System.out.println(vet.getFavFood());
        vet.setFavFood("asf");
        System.out.println(vet.getFavActivity());
        vet.setFavActivity("qwert");


        vet.eat();
        vet.sleep();
        vet.speak();
        vet.play();

        Environment envi = new Environment();
        System.out.println(envi.getName());
        envi.setName("asdfg");









    }
}
