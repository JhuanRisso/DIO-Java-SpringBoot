package Desafios.Bootcamp;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Courses course1 = new Courses();
        course1.setTitle("C# Course");
        course1.setDescription("C# course");
        course1.setWorkLoad(6);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("C# Mentoring");
        mentoring.setDescription("Mentoring for C#");
        mentoring.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(mentoring);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp C#");
        bootcamp.setDescription("C# Bootcamp");
        bootcamp.getContent().add(course1);
        bootcamp.getContent().add(mentoring);

        Devs devJones = new Devs();
        devJones.setName("Jones");
        devJones.subscribeBootcamp(bootcamp);
        System.out.println(devJones.getSubscribedContent());
        devJones.progress();
        devJones.progress();
        System.out.println(devJones.getSubscribedContent());
        System.out.println(devJones.getFinishedContent());
        System.out.println(devJones.calculateTotalXp());

    }
    
}
