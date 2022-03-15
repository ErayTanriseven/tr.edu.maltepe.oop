package tr.edu.maltepe.oop;

public class Main {

    private int numberOfClasses = 3;

    public int getX() {
        return numberOfClasses;
    }

    public void setX(int x) {
        this.numberOfClasses = x;
    }

    public static void main(String[] args){
        System.out.println("Number of Classes:");
        System.out.println(new Main().getX());
        System.out.println("Student id:");
        System.out.println(new Student().getX());
        System.out.println("Number of students:");
        System.out.println(new ComputerProfessor().getnumberOfStudents());

    }


}
