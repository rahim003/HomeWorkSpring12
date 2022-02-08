package kurbanoov.homeworkspring12;

public class Dog  implements Animal{
    private String name;
    private String breed;
    private String colour;
    private int age;


    @Override
    public void animalPlus() {
        System.out.println("The dog barks at the cow");
    }

    @Override
    public void animalMinus() {
        System.out.println("A dog bites a human");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "\nname     " + name + '\n' +
                "breed    " + breed + '\n' +
                "colour   " + colour + '\n' +
                "age      " + age+'\n';
    }
}

