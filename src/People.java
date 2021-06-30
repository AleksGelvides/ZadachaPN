abstract class People {
    String name, profession;
    int age;
    People(String name, int age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public abstract String getProfession();

    public abstract int getAge();

    public abstract String getName();
}
