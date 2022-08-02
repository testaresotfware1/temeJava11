package AnimalRescuier;

import AnimalRescuier.Animals.Duck;
import AnimalRescuier.Animals.Mouse;
import AnimalRescuier.Animals.Siamess;
import AnimalRescuier.Animals.dog.Dog;
import AnimalRescuier.Animals.dog.Labrador;
import AnimalRescuier.enviroment.Environment;
import AnimalRescuier.people.Child;
import AnimalRescuier.food.Food;
import AnimalRescuier.vet.Vet;

import static java.lang.System.*;

public class AppMain {
    public static void main(String[] args) {
        Dog ralph =  new Dog();
        out.println(ralph.getName());
        ralph.setName("Ralph");
        ralph.play();

        Dog rex= new Dog();
        rex.setName("Rex");
        out.println(rex.getName());
        rex.play();

        Dog grivey =new Dog();
        grivey.setName("Grivey");
        grivey.eat();

        Duck ducky = new Duck();
        //ducky.setname("Ducky");
        ducky.sleep();

        Labrador duffy= new Labrador();
        ducky.speak();

        Siamess toby = new Siamess();
        toby.speak();


        out.println(ralph.getAge());

        ralph.setAge(10);
        out.println(ralph.getRase());
        ralph.setRase("Buldog");
        out.println(ralph.getColor());
        ralph.setColor("gray");
        out.println(ralph.getWeight());
        ralph.setWeight(10.5);
        out.println(ralph.getheightCm());
        ralph.setheightCm(20);
        out.println(ralph.getLevelOfHealth());
        ralph.setLevelOfHealth(9);
        out.println(ralph.getFeelingHungry());
        ralph.setFeelingHungry(7);
        out.println(ralph.getMoodLevel());
        ralph.setMoodLevel(8);
        out.println(ralph.getFavFood());
        ralph.setFavFood("bone");
        out.println(ralph.getFavActivity());
        ralph.setFavActivity("playing");
       ralph.eat();
       ralph.sleep();
       ralph.speak();
       ralph.waveTail();

       Child tudu =new Child();
        out.println(tudu.getName());
        tudu.setName("Tudor");

        out.println(tudu.getAge());
        tudu.setAge(3);
        out.println(tudu.getMoney());
        tudu.setMoney(25);
        out.println(tudu.getColorEye());
        tudu.setColorEye("blue");
        out.println(tudu.getWeight());
        tudu.setWeight(15.4);
        out.println(tudu.getHeightCm());
        tudu.setHeightCm(100);
        out.println(tudu.getLevelOfHealth());
        tudu.setLevelOfHealth(10);
        out.println(tudu.getFeelingHungry());
        tudu.setFeelingHungry(9);
        out.println(tudu.getMoodLevel());
        tudu.setMoodLevel(8);
        out.println(tudu.getFavFood());
        tudu.setFavFood("apte");
        out.println(tudu.getFavActivity());
        tudu.setFavActivity("playing");
        tudu.eat();
        tudu.sleep();
        tudu.speak();
        tudu.play();

        Food food= new Food();
        out.println(food.getName());
        food.setName("Fooddog");
        out.println(food.getPriceEuro());
        food.setPriceEuro(50.5);
        out.println(food.getAmountKg());
        food.setAmountKg(2);
        out.println(food.getAvailability());
        food.setAvailability(2);

        Vet vet = new Vet();
        out.println(vet.getName());
                vet.setName("Dogdoctor");
        out.println(vet.getSpecialization());
        vet.setSpecialization("rats");
        out.println(vet.getColorEye());
        vet.setColorEye("green");
        out.println(vet.getWeight());
        vet.setWeight(88);
        out.println(vet.getHeightCm());
        vet.setHeightCm(180);
        out.println(vet.getLevelOfHealth());
        vet.setLevelOfHealth(10);
        out.println(vet.getFeelingHungry());
        vet.setFeelingHungry(9);
        out.println(vet.getMoodLevel());
        vet.setMoodLevel(8);
        out.println(vet.getFavFood());
        vet.setFavFood("ciocolata");
        out.println(vet.getFavActivity());
        vet.setFavActivity("working");


        vet.eat();
        vet.sleep();
        vet.speak();
        vet.play();

        Environment envi = new Environment();
        out.println(envi.getName());
        envi.setName("Central Parc");


        Siamess tobby= new Siamess();
        tobby.eat();
        tobby.speak();

        Mouse mousee= new Mouse();
        mousee.play();
        mousee.eat();

        Labrador doru= new Labrador();
        doru.sleep();
        doru.eat();









    }
}
