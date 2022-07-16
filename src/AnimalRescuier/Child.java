package AnimalRescuier;

public class Child {
   private String name ="Tudor";
    private double money = 25;
    private int age = 3;
    private String colorEye= "blue";
    private double weight = 15.4;
    private int heightCm= 100;
    private int levelOfHealth= 10;
    private int feelingHungry= 9;
    private int moodLevel= 8;
    private String favFood= "apte";
    private String favActivity= "playing";

    public String getName(){
        return name;    }
    public void setName(String name) {
        this.name = name;    }

    public int getAge() {
        return age;     }
    public void setAge(int age) {
        this.age = age;     }

    public double getMoney() {
        return money;     }
    public void setMoney(double money) {
        this.money = money;     }

    public String getColorEye(){
        return colorEye;    }
    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;    }

    public double getWeight() {
        return weight;      }
    public void setWeight(double weight){
        this.weight= weight;    }


    public int getHeightCm(){
        return heightCm;    }
    public void setHeightCm(int heightCm){
        this.heightCm=heightCm;    }

    public int getLevelOfHealth() {
        return levelOfHealth;     }
    public void setLevelOfHealth(int levelOfHealth) {
        this.levelOfHealth = levelOfHealth;     }

    public int getFeelingHungry() {
        return feelingHungry;     }
    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;     }


    public int getMoodLevel(){
        return moodLevel;    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;     }

    public String getFavFood() {
        return favFood;     }

    public void setFavFood(String favFood) {
        this.favFood = favFood;     }

    public String getFavActivity() {
        return favActivity;     }
    public void setFavActivity(String favActivity){
        this.favActivity=favActivity;    }


    public void eat(){
        System.out.println("eating milk");
    }

    public void sleep(){
        System.out.println("not Snores");

    }
    public void speak(){
        System.out.println("mami");
    }
    public void play() {
        System.out.println("Playing  traseu");

    }

}
