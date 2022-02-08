package kurbanoov.homeworkspring12;

public class Horse implements Animal {
    private String name;
    private int age;
    private String colour;


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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void animalPlus() {
        System.out.println("The horse runs very fast");
    }

    @Override
    public void animalMinus() {
        System.out.println("There is no harm to the horse");
    }

    @Override
    public String toString() {
        return
                "\nname      " + name + '\n' +
                "age        " + age +'\n'+
                "colour     " + colour + '\n';
    }
}
