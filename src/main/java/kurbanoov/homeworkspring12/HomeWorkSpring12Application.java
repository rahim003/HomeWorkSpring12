package kurbanoov.homeworkspring12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWorkSpring12Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=context.getBean("myPerson",Person.class);
        System.out.println(person);
        person.methods();
        Person person1=context.getBean("myPerson1",Person.class);
        System.out.println(person1);
        person1.methods();
        context.close();
    }
}
