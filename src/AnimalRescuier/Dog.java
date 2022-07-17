package AnimalRescuier;

public class Dog {
    private int age ;
    private String rase ;
    private String name ;
    private String color;
    private double weight ;
    private int heightCm;
    private int levelOfHealth;
    private int feelingHungry;
    private int moodLevel;
    private String favFood;
    private String favActivity;









    public String getName(){
        return name;
    }
   // public void setName(String dogname){
    //    name=dogname;
    //}
    public void setName(String name){
                this.name=name;    }

    public int getAge(){
        return age;    }
    public void setAge(int age){
        this.age=age;    }

    public String getRase(){
        return rase;    }
    public void setRase(String rase){
        this.rase= rase;    }

    public String getColor(){
        return color;    }
    public void setColor(String color){
        this.color= color;    }

    public double getWeight() {
        return weight;    }
    public void setWeight(double weight){
        this.weight=weight;    }

    public double getheightCm() {
        return heightCm;    }
    public void setheightCm(int heightCm){
        this.heightCm=heightCm;    }

    public int getLevelOfHealth() {
        return levelOfHealth;    }
    public void setLevelOfHealth(int levelOfHealth) {
        this.levelOfHealth = levelOfHealth;    }

    public int getFeelingHungry() {
        return feelingHungry;    }

    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;     }

    public int getMoodLevel() {
        return moodLevel;    }
    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;     }

    public String getFavFood() {
        return favFood;    }
    public void setFavFood(String favFood) {
        this.favFood = favFood;    }

    public String getFavActivity() {
        return favActivity;     }

    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;     }

    public void eat(){
        System.out.println("eating dog food");
    }

    public void sleep(){
        System.out.println("Snores...zzz");

    }
    public void speak(){
        System.out.println("Ham");
    }
    public void play(){
        System.out.println("Playing fetch");

    }
    public void waveTail(){
        System.out.println("Waving the tail");
    }

    }

