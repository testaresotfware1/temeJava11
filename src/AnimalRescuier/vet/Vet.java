package AnimalRescuier.vet;

public class Vet {

    private String name ;
    private String specialization ;

    private int age ;
    private String colorEye;
    private double weight ;
    private int heightCm;
    private int levelOfHealth;
    private int feelingHungry;
    private int moodLevel;
    private String favFood;
    private String favActivity;

    public String getName(){
        return name;    }
    public void setName(String name) {
        this.name = name;    }

    public String getSpecialization(){
        return specialization;
    }
public void  setSpecialization(String specialization){
        this.specialization= specialization;
}
    public int getAge() {
        return age;     }
    public void setAge(int age) {
        this.age = age;     }


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
        System.out.println("eating fish");
    }

    public void sleep(){
        System.out.println("Snores");

    }
    public void speak(){
        System.out.println("pisi");
    }
    public void play() {
        System.out.println("Playing NFS");


    }

}
