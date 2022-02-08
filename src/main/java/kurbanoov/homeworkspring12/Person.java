package kurbanoov.homeworkspring12;

public class Person {
    private String name;
    private int age;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }
    public void methods(){
        animal.animalPlus();
        animal.animalMinus();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "age      " + age +'\n'+
                "animal   " + animal+'\n';
    }
}
