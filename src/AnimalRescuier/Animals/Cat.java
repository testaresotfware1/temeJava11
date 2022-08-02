package AnimalRescuier.Animals;

public  abstract class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("eating purrina   ");

    }

    @Override
    public void sleep() {

    }

    public abstract void speak();


    public  void play(){
        System.out.println("catch");
    }

    @Override
    public void waveTail() {

    }


}


