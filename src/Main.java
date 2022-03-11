package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Professor p1, p2;

        p1 = new Professor(name:"ensar gül");
        p1.teaches();

        p2 = new Professor(name:"raif hoca");
        p2.teaces();
    }
}